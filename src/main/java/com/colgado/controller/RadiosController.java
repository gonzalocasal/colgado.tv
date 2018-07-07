package com.colgado.controller;

import static com.colgado.utils.Constants.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.colgado.service.YoutubeIdsProvider;

@Controller
public class RadiosController implements ControllerI {
	
	@Autowired
	private YoutubeIdsProvider youtube;
	
	@Value("${version}")
	private String version;

	@RequestMapping("/radios")
	public String root(Model model) {
		addCommonAttributes(model);
		model.addAttribute("title", "Radios");
		return DEFAULT_VIEW;
	}

	@RequestMapping("/radios/la100")
	public String la100(Model model) {
		String title = "La 100";
		String template = "la100";
		String schedule = "http://www.cienradios.com.ar/argentina/la-100/vivo#fragment-2";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/radios/pop")
	public String pop(Model model) {
		String title = "POP";
		String template = "pop";
		String schedule = "https://www.minutouno.com";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/radios/metro")
	public String metro(Model model) {
		String title = "Metro";
		String template = "metro";
		String schedule = "http://www.metro951.com";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/radios/disney")
	public String disney(Model model) {
		String title = "Disney Radio";
		String template = "disney";
		String schedule = "http://radiodisney.disneylatino.com/argentina";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/radios/los40")
	public String los40(Model model) {
		String title = "Los 40";
		String template = "los40";
		String schedule = "http://www.los40principales.com.ar";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/radios/vorterix")
	public String vorterix(Model model) {
		String title = "Vorterix";
		String template = "vorterix";
		String schedule = "https://vorterix.com";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		String id = youtube.getId(CHANNEL_VORTERIX);
		model.addAttribute("id", id);	
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/radios/rocknpop")
	public String rocknpop(Model model) {
		String title = "Rock & Pop";
		String template = "rocknpop";
		String schedule = "http://fmrockandpop.com";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/radios/aspen")
	public String aspen(Model model) {
		String title = "Aspen";
		String template = "aspen";
		String schedule = "https://www.fmaspen.com";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}

	@RequestMapping("/radios/one")
	public String one(Model model) {
		String title = "ONE";
		String template = "one";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,null);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/radios/nacionalrock")
	public String nacionalrock(Model model) {
		String title = "Nacional Rock";
		String template = "nacionalrock";
		String schedule = "http://www.radionacional.com.ar/nacionalrock/";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/radios/rqp")
	public String rqp(Model model) {
		String title = "RQP";
		String template = "rqp";
		String schedule = "https://www.rqp.fm/";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/radios/vale")
	public String vale(Model model) {
		String title = "Vale";
		String template = "vale";
		String schedule = null;
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/radios/latina")
	public String latina(Model model) {
		String title = "Latina";
		String template = "latina";
		String schedule = "http://www.latina101.com.ar/";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/radios/convos")
	public String convos(Model model) {
		String title = "Con Vos";
		String template = "convos";
		String schedule = "http://www.radioconvos.com.ar";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/radios/mega")
	public String mega(Model model) {
		String title = "Mega";
		String template = "mega";
		String schedule = null;
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/radios/milenium")
	public String milenium(Model model) {
		String title = "Milenium";
		String template = "milenium";
		String schedule = "http://www.fmmilenium.com.ar/";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/radios/blue")
	public String blue(Model model) {
		String title = "Blue";
		String template = "blue";
		String schedule = "http://www.bluefm.com.ar/";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/radios/espn")
	public String espn(Model model) {
		String title = "ESPN";
		String template = "espn";
		String schedule = "http://www.espn.com.ar/espnradio/play?s=1079fm";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/radios/pasion")
	public String pasion(Model model) {
		String title = "FM Pasi&oacute;n";
		String template = "espn";
		String schedule = null;
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/radios/mitre")
	public String mitre(Model model) {
		String title = "Mitre";
		String template = "mitre";
		String schedule = "https://radiomitre.cienradios.com/";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/radios/radio10")
	public String radio10(Model model) {
		String title = "Radio 10";
		String template = "radio10";
		String schedule = null;
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/radios/lared")
	public String lared(Model model) {
		String title = "La Red";
		String template = "lared";
		String schedule = "http://www.radiolared.multimediosamerica.com.ar";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/radios/continental")
	public String continental(Model model) {
		String title = "Continental";
		String template = "continental";
		String schedule = "http://www.radiolared.multimediosamerica.com.ar";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/radios/radionacional")
	public String radionacional(Model model) {
		String title = "Radio Nacional";
		String template = "radionacional";
		String schedule = "http://www.radionacional.com.ar/";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/radios/delplata")
	public String delplata(Model model) {
		String title = "Del Plata";
		String template = "delplata";
		String schedule = "https://www.amdelplata.com";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/radios/am750")
	public String am750(Model model) {
		String title = "AM 750";
		String template = "am750";
		String schedule = "https://750.am/";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/radios/rivadavia")
	public String rivadavia(Model model) {
		String title = "Rivadavia";
		String template = "rivadavia";
		String schedule = "http://www.rivadavia.com.ar/";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/radios/cooperativa")
	public String cooperativa(Model model) {
		String title = "Cooperativa";
		String template = "cooperativa";
		String schedule = "https://radiocooperativa.com.ar/";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/radios/cadena3")
	public String cadena3(Model model) {
		String title = "Cadena 3";
		String template = "cadena3";
		String schedule = "https://www.cadena3.com/";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/radios/delsol")
	public String delsol(Model model) {
		String title = "Del Sol";
		String template = "delsol";
		String schedule = "https://estaciondelsol.elsol.com.ar/";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/radios/brava")
	public String brava(Model model) {
		String title = "Brava";
		String template = "brava";
		String schedule = "http://brava.com.ar/";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/radios/vida")
	public String vida(Model model) {
		String title = "Vida";
		String template = "vida";
		String schedule = "http://www.fmvida.com.ar/";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/radios/coolradio")
	public String coolradio(Model model) {
		String title = "Cool Radio";
		String template = "coolradio";
		String schedule = "http://www.coolihd.com/";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/radios/red92")
	public String red92(Model model) {
		String title = "Red 92";
		String template = "red92";
		String schedule = "http://red92.com/";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/radios/laredonda")
	public String laredonda(Model model) {
		String title = "FM La Redonda";
		String template = "laredonda";
		String schedule = "http://www.fmlaredonda.com.ar/";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
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
