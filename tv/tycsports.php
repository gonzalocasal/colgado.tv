<?php
$model=[
'active'=>'tv',
'ad'=>true,
'protected'=>false,
'title'=>'TyC Sports',
'description'=>'Ver TyC Sports por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.directv.com.ar/guia/ChannelDetail.aspx?id=629',
'player'=>'<script type="text/javascript" src="/view/js/player.js"></script>
<object type="application/x-shockwave-flash" data="http://p.jwpcdn.com/6/8/jwplayer.flash.swf" width="950" height="535" id="player_421" name="player_421">
<param name="allowfullscreen" value="true" />
<param name="wmode" value="opaque" /></object>
<script type="text/javascript">
jwplayer("player_421").setup({
file: "http://clairinlive-a.akamaihd.net/dc-1/live/hls/p/1885581/e/1_8xzo6fux/t/YO19xXbHgW_22sNZezlmTg/index-s32.m3u8",
title: "TyC Sports - colgado.TV",width: "950",height: "535",stretching: "exactfit",autostart: "true"});
</script>'];
include_once'../controller/prepare.php'	;
?>