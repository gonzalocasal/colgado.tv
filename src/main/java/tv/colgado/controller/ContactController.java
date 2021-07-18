package tv.colgado.controller;

import com.sendgrid.*;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import tv.colgado.model.CaptchaResult;
import tv.colgado.model.Contact;

import java.io.IOException;

import static tv.colgado.utils.Constants.*;

@Log4j2
@Controller
public class ContactController implements ColgadoController{

	private final String version;

	private final String emailReceiver;

	private final String emailApiKey;

	private final String captchaApiKey;

	public ContactController(@Value("${version}") String version, @Value("${email.receiver}") String emailReceiver, @Value("${email.api}") String emailApiKey, @Value("${captcha.api}") String captchaApiKey) {
		this.version = version;
		this.emailReceiver = emailReceiver;
		this.emailApiKey = emailApiKey;
		this.captchaApiKey = captchaApiKey;
	}

	@RequestMapping("/contacto")
	public String root(Model model) {
		addCommonAttributes(model);
		model.addAttribute("title", "Contacto");
		return getDefaultView();
	}

	@PostMapping("/contacto")
    public String greetingSubmit(@ModelAttribute Contact contact) {
		if (isHuman(contact)) {
			Mail mail = generateMail(contact);
			SendGrid sg = new SendGrid(emailApiKey);
			Request request = new Request();
			request.method = Method.POST;
			request.endpoint = "mail/send";
		      try {
		    	log.info("Sending Email...");
				request.body = mail.build();
				sg.api(request);
			} catch (IOException e) {
				return VIEW_ROBOT;
			}
			return VIEW_MESSAGE;
		}
		return VIEW_ROBOT;
    }

	private Mail generateMail(Contact contact) {
		log.info("Building new user email...");
		Email from = new Email(contact.getEmail());
		String subject = EMAIL_SUBJECT+ contact.getName();
		Email to = new Email(emailReceiver);
		Content content = new Content("text/plain", contact.getMessage());
		return new Mail(from, subject, to, content);
	}

	private Boolean isHuman(Contact contact) {
		log.info("Validating sender is human...");
		if (contact == null) {
			return false;
		}

		String uri = String.format(GOOGLE_CAPTCHA_VERIFY_URI, captchaApiKey, contact.getToken());
		RestTemplate restTemplate = new RestTemplate();
		CaptchaResult result = restTemplate.postForObject( uri, null, CaptchaResult.class);
		if (result != null && result.getSuccess() != null) {
			return result.getSuccess();
		} else {
			return false;
		}
	}

	@Override
	public void addCommonAttributes(Model model) {
		model.addAttribute("active", ACTIVE_CONTACTO);
		model.addAttribute("version", version);
		model.addAttribute("ad", false);
	}

	@Override
	public void addMediaAttributes(Model model, String title,String template, String schedule) {}

}
