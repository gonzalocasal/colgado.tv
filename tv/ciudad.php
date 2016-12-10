<?php
$model=[
'active'=>'tv',
'ad'=>true,
'title'=>'Canal de la Ciudad',
'description'=>'Ver Canal de la Ciudad internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.buenosaires.gob.ar/canaldelaciudad/programacion',
'player'=>'<script type="text/javascript" src="/view/js/player.js"></script>
<object type="application/x-shockwave-flash" data="http://p.jwpcdn.com/6/8/jwplayer.flash.swf" width="950" height="535" id="player_421" name="player_421">
<param name="allowfullscreen" value="true" />
<param name="wmode" value="opaque" /></object>
<script type="text/javascript">
jwplayer("player_421").setup({
file: "http://186.0.233.76:1935/CiudadAbierta/smil:ciudadabierta.smil/playlist.m3u8",
title: "Canal de la Ciudad - colgado.TV",width: "950",height: "535",stretching: "exactfit",autostart: "true"});
</script>'];
include_once'../controller/prepare.php'	;
?>
