package tv.colgado.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tv.colgado.service.MediaURLProvider;
import tv.colgado.service.YoutubeIdsProvider;
import static tv.colgado.utils.Constants.*;

@Controller
public class TVController implements ColgadoController{

	private final YoutubeIdsProvider youtube;
	private final MediaURLProvider urlProvider;
	private final String version;

	public TVController(@Autowired YoutubeIdsProvider youtube, @Autowired MediaURLProvider urlProvider,@Value("${version}") String version) {
		this.youtube = youtube;
		this.urlProvider = urlProvider;
		this.version = version;
	}

	@RequestMapping("/")
	public String root(Model model) {
		addCommonAttributes(model);
		model.addAttribute("version", version);
		model.addAttribute("title", "Televisi&oacute;n");
		model.addAttribute("ad", false);
		return getDefaultView();
	}

	@Override
	public void addCommonAttributes(Model model) {
		model.addAttribute("active", ACTIVE_TV);
		model.addAttribute("version", version);
		model.addAttribute("ad", false);
	}

	@Override
	public void addMediaAttributes(Model model, String title, String template, String schedule) {
		model.addAttribute("title", title);
		model.addAttribute("player", template);
		model.addAttribute("schedule", schedule);
	}

	@RequestMapping("/tv/telefe")
	public String telefe(Model model) {
		String title = "Telefe";
		String template = "telefe";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=123";
		String url = urlProvider.getURL(MEDIA_URL_TELEFE);
		model.addAttribute("url", url);
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/eltrece")
	public String eltrece(Model model) {
		String title = "El Trece";
		String template = "eltrece";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=124";
		String url = urlProvider.getURL(MEDIA_URL_EL_TRECE);
		model.addAttribute("url", url);
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/america")
	public String america(Model model) {
		String title = "Am&eacute;rica";
		String template = "america";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=120";
		String url = urlProvider.getURL(MEDIA_URL_AMERICA);
		model.addAttribute("url", url);
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/tvpublica")
	public String tvpublica(Model model) {
		String title = "TV P&uacute;blica";
		String template = "tvpublica";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=121";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		model.addAttribute("id", youtube.getId(CHANNEL_TVP));
		return getDefaultView();
	}

	@RequestMapping("/tv/canal9")
	public String canal9(Model model) {
		String title = "Canal 9";
		String template = "canal9";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=122";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/tycsports")
	public String tycsports(Model model) {
		String title = "TyC Sports";
		String template = "tycsports";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=629";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/tntsports")
	public String tntsports(Model model) {
		String title = "TNT Sports";
		String template = "tntsports";
		String schedule = "https://tntsportsla.com";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/foxsportspremium")
	public String foxsportspremium(Model model) {
		String title = "FOX Sports Premium";
		String template = "foxsportspremium";
		String schedule = "https://play.foxsportsla.com/";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/foxsports")
	public String foxsports(Model model) {
		String title = "FOX Sports";
		String template = "foxsports";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=605";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/foxsports2")
	public String foxsports2(Model model) {
		String title = "FOX Sports 2";
		String template = "foxsports2";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=608";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/espn")
	public String espn(Model model) {
		String title = "ESPN";
		String template = "espn";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=621";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/espn2")
	public String espn2(Model model) {
		String title = "ESPN 2";
		String template = "espn2";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=623";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/directvsports")
	public String directvsports(Model model) {
		String title = "DirecTV Sports";
		String template = "directvsports";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=610";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/dxtv")
	public String dxtv(Model model) {
		String title = "DEPORTV";
		String template = "dxtv";
		String schedule = "https://deportv.gov.ar/programacion";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		model.addAttribute("id", youtube.getId(CHANNEL_DEPORTV));
		return getDefaultView();
	}

	@RequestMapping("/tv/garage")
	public String garage(Model model) {
		String title = "El Garage TV";
		String template = "garage";
		String schedule = "https://www.elgarage.com/";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/americasports")
	public String americasports(Model model) {
		String title = "AM Sports";
		String template = "americasports";
		String schedule = "https://www.amsports.com.ar/";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		model.addAttribute("id", youtube.getId(CHANNEL_AMERICA_SPORTS));
		return getDefaultView();
	}

	@RequestMapping("/tv/tn")
	public String tn(Model model) {
		String title = "TN";
		String template = "tn";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=716";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		model.addAttribute("id", youtube.getId(CHANNEL_TN));
		return getDefaultView();
	}

	@RequestMapping("/tv/c5n")
	public String c5n(Model model) {
		String title = "C5N";
		String template = "c5n";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=717";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		model.addAttribute("id", youtube.getId(CHANNEL_C5N));
		return getDefaultView();
	}

	@RequestMapping("/tv/ln+")
	public String ln(Model model) {
		String title = "LN+";
		String template = "ln+";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=715";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		model.addAttribute("id", youtube.getId(CHANNEL_LN));
		return getDefaultView();
	}

	@RequestMapping("/tv/america24")
	public String a24(Model model) {
		String title = "A24";
		String template = "america24";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=719";
		String url = urlProvider.getURL(MEDIA_URL_AMERICA_24);
		model.addAttribute("url", url);
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/cronica")
	public String cronica(Model model) {
		String title = "Cr&oacute;nica TV";
		String template = "cronica";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=718";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		model.addAttribute("id", youtube.getId(CHANNEL_CRONICA));
		return getDefaultView();
	}

	@RequestMapping("/tv/ip")
	public String ip(Model model) {
		String title = "Informaci&oacute;n Period&iacute;stica";
		String template = "ip";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, null);
		return getDefaultView();
	}

	@RequestMapping("/tv/canal26")
	public String canal26(Model model) {
		String title = "Canal 26";
		String template = "canal26";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=720";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		model.addAttribute("id", youtube.getId(CHANNEL_CANAL26));
		return getDefaultView();
	}

	@RequestMapping("/tv/diputados")
	public String diputados(Model model) {
		String title = "DTV";
		String template = "diputados";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,null);
		model.addAttribute("id", youtube.getId(CHANNEL_DIPUTADOS));
		return getDefaultView();
	}

	@RequestMapping("/tv/dw")
	public String dw(Model model) {
		String title = "DW";
		String template = "dw";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,null);
		model.addAttribute("id", youtube.getId(CHANNEL_DW));
		return getDefaultView();
	}

	@RequestMapping("/tv/telesur")
	public String telesur(Model model) {
		String title = "Telesur";
		String template = "telesur";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=722";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		model.addAttribute("id", youtube.getId(CHANNEL_TELESUR));
		return getDefaultView();
	}

	@RequestMapping("/tv/rt")
	public String rt(Model model) {
		String title = "RT";
		String template = "rt";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=722";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		model.addAttribute("id", youtube.getId(CHANNEL_RT));
		return getDefaultView();
	}

	@RequestMapping("/tv/cnn")
	public String cnn(Model model) {
		String title = "CNN";
		String template = "cnn";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=704";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}


	@RequestMapping("/tv/history")
	public String history(Model model) {
		String title = "History";
		String template = "history";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=742";
		String url = urlProvider.getURL(MEDIA_URL_HISTORY);
		model.addAttribute("url", url);
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/discovery")
	public String discovery(Model model) {
		String title = "Discovery";
		String template = "discovery";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=732";
		String url = urlProvider.getURL(MEDIA_URL_DISCOVERY);
		model.addAttribute("url", url);
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/natgeo")
	public String natgeo(Model model) {
		String title = "Nat Geo";
		String template = "natgeo";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=730";
		String url = urlProvider.getURL(MEDIA_URL_NATGEO);
		model.addAttribute("url", url);
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/id")
	public String id(Model model) {
		String title = "Investigation Discovery";
		String template = "id";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=223";
		String url = urlProvider.getURL(MEDIA_URL_ID);
		model.addAttribute("url", url);
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/trutv")
	public String trutv(Model model) {
		String title = "TruTv";
		String template = "trutv";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=220";
		String url = urlProvider.getURL(MEDIA_URL_TRU_TV);
		model.addAttribute("url", url);
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/animalplanet")
	public String animalplanet(Model model) {
		String title = "Animal Planet";
		String template = "animalplanet";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=734";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/tec")
	public String tec(Model model) {
		String title = "TEC TV";
		String template = "tec";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=734";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/encuentro")
	public String encuentro(Model model) {
		String title = "Encuentro";
		String template = "encuentro";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=126";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		model.addAttribute("id", youtube.getId(CHANNEL_ENCUENTRO));
		return getDefaultView();
	}


	@RequestMapping("/tv/kzo")
	public String kzo(Model model) {
		String title = "KZO";
		String template = "kzo";
		String schedule = "https://kuarzo.com/";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		model.addAttribute("id", youtube.getId(CHANNEL_KZO));
		return getDefaultView();
	}

	@RequestMapping("/tv/nettv")
	public String nettv(Model model) {
		String title = "Net TV";
		String template = "nettv";
		String schedule = "https://www.canalnet.tv/";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/magazine")
	public String magazine(Model model) {
		String title = "Ciudad Magazine";
		String template = "magazine";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=236";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/telemax")
	public String telemax(Model model) {
		String title = "Telemax";
		String template = "telemax";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=726";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}


	@RequestMapping("/tv/construirtv")
	public String construirtv(Model model) {
		String title = "Construir TV";
		String template = "construirtv";
		String schedule = "https://www.construirtv.com";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}


	@RequestMapping("/tv/ciudad")
	public String ciudad(Model model) {
		String title = "Canal de la Ciudad";
		String template = "ciudad";
		String schedule = "https://www.buenosaires.gob.ar/canaldelaciudad/programacion";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/tvuniversidad")
	public String tvuniversidad(Model model) {
		String title = "TV Universidad";
		String template = "tvuniversidad";
		String schedule = "https://tv.unlp.edu.ar/programas";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/argentinisima")
	public String argentinisima(Model model) {
		String title = "Argentinisima";
		String template = "argentinisima";
		String schedule = "https://www.argentinisimatv.com.ar/grilla/grilla.html";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/rural")
	public String rural(Model model) {
		String title = "Rural";
		String template = "rural";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=125";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/vorterix")
	public String vorterix(Model model) {
		String title = "Vorterix";
		String template = "vorterix";
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,null);
		return getDefaultView();
	}

	@RequestMapping("/tv/mtv")
	public String mtv(Model model) {
		String title = "MTV";
		String template = "mtv";
		String url = urlProvider.getURL(MEDIA_URL_MTV);
		model.addAttribute("url", url);
		addCommonAttributes(model);
		addMediaAttributes(model,title,template,null);
		return getDefaultView();
	}

	@RequestMapping("/tv/vh1")
	public String golden(Model model) {
		String title = "VH1";
		String template = "vh1";
		String url = urlProvider.getURL(MEDIA_URL_VH1);
		model.addAttribute("url", url);
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, null);
		return getDefaultView();
	}

	@RequestMapping("/tv/much")
	public String much(Model model) {
		String title = "Much Music";
		String template = "much";
		String url = urlProvider.getURL(MEDIA_URL_MUCH);
		model.addAttribute("url", url);
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, null);
		return getDefaultView();
	}

	@RequestMapping("/tv/pakapaka")
	public String pakapaka(Model model) {
		String title = "Paka Paka";
		String template = "pakapaka";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=303";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		model.addAttribute("id", youtube.getId(CHANNEL_PAKA_PAKA));
		return getDefaultView();
	}

	@RequestMapping("/tv/cartoon")
	public String cartoon(Model model) {
		String title = "Cartoon";
		String template = "cartoon";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=304";
		String url = urlProvider.getURL(MEDIA_URL_CARTOON);
		model.addAttribute("url", url);
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/nick")
	public String nick(Model model) {
		String title = "Nick";
		String template = "nick";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=308";
		String url = urlProvider.getURL(MEDIA_URL_NICK);
		model.addAttribute("url", url);
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/discoverykids")
	public String discoverykids(Model model) {
		String title = "Discovery Kids";
		String template = "discoverykids";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=330";
		String url = urlProvider.getURL(MEDIA_URL_DISCOVERY_KIDS);
		model.addAttribute("url", url);
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/disney")
	public String disney(Model model) {
		String title = "Disney";
		String template = "disney";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=312";
		String url = urlProvider.getURL(MEDIA_URL_DISNEY);
		model.addAttribute("url", url);
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/disneyjunior")
	public String disneyjunior(Model model) {
		String title = "Disney Junior";
		String template = "disneyjunior";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=315";
		String url = urlProvider.getURL(MEDIA_URL_DISNEY_JUNIOR);
		model.addAttribute("url", url);
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/disneyxd")
	public String disneyxd(Model model) {
		String title = "Disney XD";
		String template = "disneyxd";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=316";
		String url = urlProvider.getURL(MEDIA_URL_DISNEY_XD);
		model.addAttribute("url", url);
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/star")
	public String fox(Model model) {
		String title = "Star Channel";
		String template = "star";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=204";
		String url = urlProvider.getURL(MEDIA_URL_STAR);
		model.addAttribute("url", url);
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/fx")
	public String fx(Model model) {
		String title = "FX";
		String template = "fx";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=217";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/foxlife")
	public String foxlife(Model model) {
		String title = "Fox Life";
		String template = "foxlife";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=231";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/warner")
	public String warner(Model model) {
		String title = "Warner";
		String template = "warner";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=206";
		String url = urlProvider.getURL(MEDIA_URL_WARNER);
		model.addAttribute("url", url);
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/universal")
	public String universal(Model model) {
		String title = "Universal";
		String template = "universal";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=218";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/axn")
	public String axn(Model model) {
		String title = "AXN";
		String template = "axn";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=214";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/sony")
	public String sony(Model model) {
		String title = "Sony";
		String template = "sony";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=210";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/hbo")
	public String hbo(Model model) {
		String title = "HBO";
		String template = "hbo";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=524";
		String url = urlProvider.getURL(MEDIA_URL_HBO);
		model.addAttribute("url", url);
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/space")
	public String space(Model model) {
		String title = "Space";
		String template = "space";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=518";
		String url = urlProvider.getURL(MEDIA_URL_SPACE);
		model.addAttribute("url", url);
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/tnt")
	public String tnt(Model model) {
		String title = "TNT";
		String template = "tnt";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=502";
		String url = urlProvider.getURL(MEDIA_URL_TNT);
		model.addAttribute("url", url);
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/cinecanal")
	public String cinecanal(Model model) {
		String title = "Cinecanal";
		String template = "cinecanal";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=507";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/studiouniversal")
	public String studiouniversal(Model model) {
		String title = "Studio Universal";
		String template = "studiouniversal";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=508";
		String url = urlProvider.getURL(MEDIA_URL_UNIVERSAL);
		model.addAttribute("url", url);
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/isat")
	public String isat(Model model) {
		String title = "I-SAT";
		String template = "isat";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=520";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/cinemax")
	public String cinemax(Model model) {
		String title = "Cinemax";
		String template = "cinemax";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=509";
		String url = urlProvider.getURL(MEDIA_URL_CINEMAX);
		model.addAttribute("url", url);
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/amc")
	public String amc(Model model) {
		String title = "amc";
		String template = "amc";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=210";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

	@RequestMapping("/tv/tcm")
	public String tcm(Model model) {
		String title = "TCM";
		String template = "tcm";
		String schedule = "https://www.directv.com.ar/guia/ChannelDetail.aspx?id=504";
		addCommonAttributes(model);
		addMediaAttributes(model, title, template, schedule);
		return getDefaultView();
	}

}
