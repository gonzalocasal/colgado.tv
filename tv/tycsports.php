<?php
$model=[
'activa'=>0,
'ad'=>true,
'protected'=>false,
'titulo'=>'TyC Sports',
'descripcion'=>'Ver TyC Sports por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'programacion'=>'http://www.directv.com.ar/guia/ChannelDetail.aspx?id=629',
'player'=>'<script type="text/javascript" src="/view/js/player.js"></script>
<object type="application/x-shockwave-flash" data="http://p.jwpcdn.com/6/8/jwplayer.flash.swf" width="950" height="535" id="player_421" name="player_421">
<param name="allowfullscreen" value="true" />
<param name="wmode" value="opaque" /></object>
<script type="text/javascript">
jwplayer("player_421").setup({
file: "http://cdnapi.kaltura.com/p/1885581/sp/188558100/playManifest/entryId/0_pp4mf5wo/format/applehttp/protocol/http/uiConfId/35254601/a.m3u8?referrer=aHR0cDovL3d3dy50eWNzcG9ydHNwbGF5LmNvbQ==&playSessionId=61b99a31-63a1-009e-245b-453ba12a2a88",
title: "TyC Sports - colgado.TV",width: "950",height: "535",stretching: "exactfit",autostart: "true"});
</script>'];
include_once'../controller/prepare.php'	;
?>