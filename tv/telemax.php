<?php
$model=[
'activa'=>0,
'ad'=>true,
'titulo'=>'Telemax',
'descripcion'=>'Ver Telemax internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'player'=>'<script type="text/javascript" src="/view/js/player.js"></script>
<object type="application/x-shockwave-flash" data="http://p.jwpcdn.com/6/8/jwplayer.flash.swf" width="950" height="535" bgcolor="#000000" id="player_421" name="player_421">
<param name="allowfullscreen" value="true" />
<param name="wmode" value="opaque" /></object>
<script type="text/javascript">
jwplayer("player_421").setup({
file: "http://live-edge01.telecentro.net.ar/live/smil:tlx.smil/playlist.m3u8",
title: "Telemax - colgado.TV",width: "950",height: "535",stretching: "exactfit",autostart: "true"});
</script>'];
include_once'../controller/prepare.php'	;
?>