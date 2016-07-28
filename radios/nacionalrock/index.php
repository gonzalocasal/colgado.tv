<?php
$model=[
'activa'=>2, 
'titulo'=>'Nacional Rock',
'descripcion'=>'Escuchar Nacional Rock por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'ad'=>'no',
'programacion'=>'http://nacionalrock.com/programas/',
'player'=>'<div id="mediaplayer_wrapper" style="position: relative; width: 478px; height: 80px;"><object type="application/x-shockwave-flash" data="http://enlaradio.com.ar/shared/player/v5v6/player.swf" width="100%" height="100%" bgcolor="#000000" id="mediaplayer" name="mediaplayer" tabindex="0"><param name="allowfullscreen" value="true"><param name="allowscriptaccess" value="always"><param name="seamlesstabbing" value="true"><param name="wmode" value="opaque"><param name="flashvars" value="netstreambasepath=http%3A%2F%2Fwww.enlaradio.com.ar%2Flisten%2Fmetro%2F&amp;id=mediaplayer&amp;flashplayer=player.swf&amp;file=http%3A%2F%2Fmp3.metroaudio1.stream.avstreaming.net%3A7200%2Fmetro&amp;provider=sound&amp;image=%2Fimg%2Fplayer_html5.png&amp;autostart=true&amp;duration=0&amp;controlbar.position=bottom"></object></div>
<script type="text/javascript">
  jwplayer("mediaplayer").setup({
	 flashplayer: "player.swf",
    id: "mediaID",
    controlbar: "bottom",
    width: "478",
    height: "80",
    file: "rtmp://186.33.227.194/rn_sc_rad39/mp3:rn_sc_rad39.stream",
	provider: "sound",
	image: "/img/player_html5.png",
	autostart: "true",
	duration:"0",
    modes: [
	        {type: "flash", src: "http://enlaradio.com.ar/shared/player/v5v6/player.swf", config: {provider: "sound"} },
        {type: "html5"},
        {type: "download"}
    ]
  });
</script>'];
include_once'../../controller/prepare.php';	
?>