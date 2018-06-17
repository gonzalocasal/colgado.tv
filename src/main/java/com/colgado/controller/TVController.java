package com.colgado.controller;

import static com.colgado.utils.Constants.*;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TVController implements ControllerI{
	
	
	@Value("${version}")
	private String version;

	@RequestMapping("/")
	public String root(Model model, HttpServletResponse response) {
		addCommonAttributes(model);
		model.addAttribute("active", ACTIVE_TV);
		model.addAttribute("version", version);
		model.addAttribute("title", "Television");
		model.addAttribute("ad", false);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/telefe")
	public String telefe(Model model) {
		String title = "Telefe";
		String template = "telefe";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=123";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/eltrece")
	public String eltrece(Model model) {
		String title = "El Trece";
		String template = "eltrece";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=124";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/america")
	public String america(Model model) {
		String title = "Am&eacute;rica";
		String template = "america";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=120";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/tvpublica")
	public String tvpublica(Model model) {
		String title = "TV P&uacute;blica";
		String template = "tvpublica";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=121";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	
	@RequestMapping("/tv/canal9")
	public String canal9(Model model) {
		String title = "Canal 9";
		String template = "canal9";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=122";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	
	@RequestMapping("/tv/tycsports")
	public String tycsports(Model model) {
		String title = "TyC Sports";
		String template = "tycsports";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=629";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/dxtv")
	public String dxtv(Model model) {
		String title = "DEPORTV";
		String template = "dxtv";
		String schedule = "http://deportv.gov.ar/programacion";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/directvsports")
	public String directvsports(Model model) {
		String title = "DirecTV Sports";
		String template = "directvsports";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=610";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/foxsports")
	public String foxsports(Model model) {
		String title = "FOX Sports";
		String template = "foxsports";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=605";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/foxsports2")
	public String foxsports2(Model model) {
		String title = "FOX Sports";
		String template = "foxsports2";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=608";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/espn")
	public String espn(Model model) {
		String title = "ESPN";
		String template = "espn";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=621";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/espn2")
	public String espn2(Model model) {
		String title = "ESPN 2";
		String template = "espn2";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=623";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/garage")
	public String garage(Model model) {
		String title = "El Garage TV";
		String template = "garage";
		String schedule = "http://www.elgarage.com/";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/tn")
	public String tn(Model model) {
		String title = "TN";
		String template = "tn";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=716";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/c5n")
	public String c5n(Model model) {
		String title = "C5N";
		String template = "c5n";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=717";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/ln+")
	public String ln(Model model) {
		String title = "LN+";
		String template = "ln+";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=715";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/america24")
	public String a24(Model model) {
		String title = "A24";
		String template = "america24";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=719";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/cronica")
	public String cronica(Model model) {
		String title = "Cr&oacute;nica TV";
		String template = "cronica";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=718";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/canal26")
	public String canal26(Model model) {
		String title = "Canal 26";
		String template = "canal26";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=720";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/telesur")
	public String telesur(Model model) {
		String title = "Telesur";
		String template = "telesur";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=722";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/rt")
	public String rt(Model model) {
		String title = "RT";
		String template = "rt";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=722";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}

	@RequestMapping("/tv/cnn")
	public String cnn(Model model) {
		String title = "CNN";
		String template = "cnn";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=704";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}

	
	@RequestMapping("/tv/history")
	public String history(Model model) {
		String title = "History";
		String template = "history";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=742";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/discovery")
	public String discovery(Model model) {
		String title = "Discovery";
		String template = "discovery";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=732";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/natgeo")
	public String natgeo(Model model) {
		String title = "Nat Geo";
		String template = "natgeo";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=730";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/id")
	public String id(Model model) {
		String title = "Investigation Discovery";
		String template = "id";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=223";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/trutv")
	public String trutv(Model model) {
		String title = "TruTv";
		String template = "trutv";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=220";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}

	@RequestMapping("/tv/animalplanet")
	public String animalplanet(Model model) {
		String title = "Animal Planet";
		String template = "animalplanet";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=734";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	
	@RequestMapping("/tv/tec")
	public String tec(Model model) {
		String title = "TEC TV";
		String template = "tec";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=734";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	

	@RequestMapping("/tv/encuentro")
	public String encuentro(Model model) {
		String title = "Encuentro";
		String template = "encuentro";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=126";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/magazine")
	public String magazine(Model model) {
		String title = "Ciudad Magazine";
		String template = "magazine";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=236";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/telemax")
	public String telemax(Model model) {
		String title = "Telemax";
		String template = "telemax";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=726";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	
	@RequestMapping("/tv/construirtv")
	public String construirtv(Model model) {
		String title = "Construir TV";
		String template = "construirtv";
		String schedule = "http://www.construirtv.com";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	
	@RequestMapping("/tv/ciudad")
	public String ciudad(Model model) {
		String title = "Canal de la Ciudad";
		String template = "ciudad";
		String schedule = "http://www.buenosaires.gob.ar/canaldelaciudad/programacion";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/tvuniversidad")
	public String tvuniversidad(Model model) {
		String title = "TV Universidad";
		String template = "tvuniversidad";
		String schedule = "https://tv.unlp.edu.ar/programas";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/argentinisima")
	public String argentinisima(Model model) {
		String title = "Argentinisima";
		String template = "argentinisima";
		String schedule = "http://www.argentinisimatv.com.ar/grilla/grilla.html";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/rural")
	public String rural(Model model) {
		String title = "Rural";
		String template = "rural";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=125";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/vorterix")
	public String vorterix(Model model) {
		String title = "Vorterix";
		String template = "vorterix";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,null);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/mtv")
	public String mtv(Model model) {
		String title = "MTV";
		String template = "mtv";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,null);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/vh1")
	public String vh1(Model model) {
		String title = "VH1";
		String template = "vh1";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,null);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/pakapaka")
	public String pakapaka(Model model) {
		String title = "Paka Paka";
		String template = "pakapaka";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=303";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/cartoon")
	public String cartoon(Model model) {
		String title = "Cartoon";
		String template = "cartoon";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=304";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/nick")
	public String nick(Model model) {
		String title = "Nick";
		String template = "nick";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=308";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/discoverykids")
	public String discoverykids(Model model) {
		String title = "Discovery Kids";
		String template = "discoverykids";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=330";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/disney")
	public String disney(Model model) {
		String title = "Disney";
		String template = "disney";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=312";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/disneyjunior")
	public String disneyjunior(Model model) {
		String title = "Disney Junior";
		String template = "disneyjunior";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=315";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/disneyxd")
	public String disneyxd(Model model) {
		String title = "Disney XD";
		String template = "disneyxd";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=316";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/fox")
	public String fox(Model model) {
		String title = "Fox";
		String template = "fox";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=204";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/fx")
	public String fx(Model model) {
		String title = "FX";
		String template = "fx";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=217";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/foxlife")
	public String foxlife(Model model) {
		String title = "Fox Life";
		String template = "foxlife";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=231";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/warner")
	public String warner(Model model) {
		String title = "Warner";
		String template = "warner";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=206";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/universal")
	public String universal(Model model) {
		String title = "Universal";
		String template = "universal";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=218";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/axn")
	public String axn(Model model) {
		String title = "AXN";
		String template = "axn";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=214";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	 
	@RequestMapping("/tv/sony")
	public String sony(Model model) {
		String title = "Sony";
		String template = "sony";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=210";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/tnt")
	public String tnt(Model model) {
		String title = "TNT";
		String template = "tnt";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=502";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}

	@RequestMapping("/tv/space")
	public String space(Model model) {
		String title = "Space";
		String template = "space";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=518";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/cinecanal")
	public String cinecanal(Model model) {
		String title = "Cinecanal";
		String template = "cinecanal";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=507";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/studiouniversal")
	public String studiouniversal(Model model) {
		String title = "Studio Universal";
		String template = "studiouniversal";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=508";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/isat")
	public String isat(Model model) {
		String title = "I-SAT";
		String template = "isat";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=520";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/cinemax")
	public String cinemax(Model model) {
		String title = "Cinemax";
		String template = "cinemax";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=509";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/amc")
	public String amc(Model model) {
		String title = "amc";
		String template = "amc";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=210";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/tcm")
	public String tcm(Model model) {
		String title = "TCM";
		String template = "tcm";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=504";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/golden")
	public String golden(Model model) {
		String title = "Golden Edge";
		String template = "golden";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=517";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/hbo")
	public String hbo(Model model) {
		String title = "HBO";
		String template = "hbo";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=524";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@RequestMapping("/tv/hboplus")
	public String hbo2(Model model) {
		String title = "HBO Plus";
		String template = "hboplus";
		String schedule = "http://www.directv.com.ar/guia/ChannelDetail.aspx?id=526";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	
	@RequestMapping("/tv/rusia2018")
	public String rusia2018(Model model) {
		String title = "Rusia 2018";
		String template = "rusia2018";
		String schedule = "http://www.promiedos.com.ar/";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,schedule);
		return DEFAULT_VIEW;
	}
	
	@Override
	public void addCommonAttributes(Model model) {
		model.addAttribute("active", ACTIVE_TV);
		model.addAttribute("version", version);
		model.addAttribute("ad", true);
	}


	@Override
	public void addMediaAttributes(Model model, String title, String template, String schedule) {
		model.addAttribute("title", title);
		model.addAttribute("player", template);
		model.addAttribute("schedule", schedule);
	}
	
}
