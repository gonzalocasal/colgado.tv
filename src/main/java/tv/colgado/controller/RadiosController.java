package tv.colgado.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tv.colgado.service.YoutubeIdsProvider;

import static tv.colgado.utils.Constants.ACTIVE_RADIOS;
import static tv.colgado.utils.Constants.CHANNEL_VORTERIX;

@Controller
public class RadiosController implements ColgadoController {


	private final YoutubeIdsProvider youtube;
	private final String version;

	public RadiosController(@Autowired YoutubeIdsProvider youtube, @Value("${version}") String version) {
		this.youtube = youtube;
		this.version = version;
	}

	@RequestMapping("/radios")
	public String root(Model model) {
		addCommonAttributes(model);
		model.addAttribute("title", "Radios");
		return getDefaultView();
	}

	@RequestMapping("/radios/la100")
	public String la100(Model model) {
		String title = "La 100";
		String template = "la100";
		String schedule = "https://www.cienradios.com.ar/argentina/la-100/vivo#fragment-2";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/radios/pop")
	public String pop(Model model) {
		String title = "POP";
		String template = "pop";
		String schedule = "https://www.minutouno.com";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/radios/metro")
	public String metro(Model model) {
		String title = "Metro";
		String template = "metro";
		String schedule = "https://www.metro951.com";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/radios/disney")
	public String disney(Model model) {
		String title = "Disney Radio";
		String template = "disney";
		String schedule = "https://radiodisney.disneylatino.com/argentina";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/radios/los40")
	public String los40(Model model) {
		String title = "Los 40";
		String template = "los40";
		String schedule = "https://www.los40principales.com.ar";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/radios/vorterix")
	public String vorterix(Model model) {
		String title = "Vorterix";
		String template = "vorterix";
		String schedule = "https://vorterix.com";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		model.addAttribute("id", youtube.getId(CHANNEL_VORTERIX));
		return getDefaultView();
	}

	@RequestMapping("/radios/rocknpop")
	public String rocknpop(Model model) {
		String title = "Rock & Pop";
		String template = "rocknpop";
		String schedule = "https://fmrockandpop.com";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/radios/aspen")
	public String aspen(Model model) {
		String title = "Aspen";
		String template = "aspen";
		String schedule = "https://www.fmaspen.com";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/radios/one")
	public String one(Model model) {
		String title = "ONE";
		String template = "one";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,null);
		return getDefaultView();
	}

	@RequestMapping("/radios/vale")
	public String vale(Model model) {
		String title = "Vale";
		String template = "vale";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,null);
		return getDefaultView();
	}

	@RequestMapping("/radios/latina")
	public String latina(Model model) {
		String title = "Latina";
		String template = "latina";
		String schedule = "https://www.latina101.com.ar/";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/radios/convos")
	public String convos(Model model) {
		String title = "Con Vos";
		String template = "convos";
		String schedule = "https://www.radioconvos.com.ar";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/radios/mega")
	public String mega(Model model) {
		String title = "Mega";
		String template = "mega";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,null);
		return getDefaultView();
	}

	@RequestMapping("/radios/milenium")
	public String milenium(Model model) {
		String title = "Milenium";
		String template = "milenium";
		String schedule = "https://www.fmmilenium.com.ar/";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/radios/blue")
	public String blue(Model model) {
		String title = "Blue";
		String template = "blue";
		String schedule = "https://www.bluefm.com.ar/";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/radios/mitre")
	public String mitre(Model model) {
		String title = "Mitre";
		String template = "mitre";
		String schedule = "https://radiomitre.cienradios.com/";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/radios/radio10")
	public String radio10(Model model) {
		String title = "Radio 10";
		String template = "radio10";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,null);
		return getDefaultView();
	}

	@RequestMapping("/radios/cnnradio")
	public String cnnradio(Model model) {
		String title = "CNN Radio";
		String template = "cnnradio";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,null);
		return getDefaultView();
	}

	@RequestMapping("/radios/lared")
	public String lared(Model model) {
		String title = "La Red";
		String template = "lared";
		String schedule = "https://www.radiolared.multimediosamerica.com.ar";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/radios/continental")
	public String continental(Model model) {
		String title = "Continental";
		String template = "continental";
		String schedule = "https://www.radiolared.multimediosamerica.com.ar";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/radios/radionacional")
	public String radionacional(Model model) {
		String title = "Radio Nacional";
		String template = "radionacional";
		String schedule = "https://www.radionacional.com.ar/";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/radios/delplata")
	public String delplata(Model model) {
		String title = "Del Plata";
		String template = "delplata";
		String schedule = "https://www.amdelplata.com";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/radios/am750")
	public String am750(Model model) {
		String title = "AM 750";
		String template = "am750";
		String schedule = "https://750.am/";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/radios/rivadavia")
	public String rivadavia(Model model) {
		String title = "Rivadavia";
		String template = "rivadavia";
		String schedule = "https://www.rivadavia.com.ar/";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/radios/cadena3")
	public String cadena3(Model model) {
		String title = "Cadena 3";
		String template = "cadena3";
		String schedule = "https://www.cadena3.com/";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@Override
	public void addCommonAttributes(Model model) {
		model.addAttribute("active", ACTIVE_RADIOS);
		model.addAttribute("version", version);
		model.addAttribute("ad", false);
	}

	@Override
	public void addMediaAttributes(Model model, String title,String template, String schedule) {
		model.addAttribute("title", title);
		model.addAttribute("player", template);
		model.addAttribute("schedule", schedule);
	}

}
