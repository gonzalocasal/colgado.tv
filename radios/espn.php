<?php
$model=[
'activa'=>2, 
'titulo'=>'ESPN Radio',
'descripcion'=>'Escuchar ESPN Radio por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'programacion'=>'http://www.espn1079.fm/programacion/',
'player'=>'<script type="text/javascript" src="/view/js/player.js"></script>
<object type="application/x-shockwave-flash" data="http://p.jwpcdn.com/6/8/jwplayer.flash.swf" width="600" height="30" bgcolor="#000000" id="player_421" name="player_421">
<param name="allowfullscreen" value="true" />
<param name="wmode" value="opaque" /></object>
<script type="text/javascript">
jwplayer("player_421").setup({
file: "http://espnsslarugby-i.akamaihd.net/hls/live/225068/rugbytest/64/64.m3u8",
title: "Radio ESPN - colgado.TV",width: "600",height: "30",stretching: "exactfit",autostart: "true"});
</script>'];
include_once'../controller/prepare.php';	
?>