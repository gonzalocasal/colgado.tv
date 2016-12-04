<?php
$model=[
'active'=>0,
'ad'=>true,
'title'=>'360 TV',
'description'=>'Ver 360 TV por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.directv.com.ar/guia/ChannelDetail.aspx?id=723',
'player'=>'<script type="text/javascript" src="/view/js/player.js"></script>
<object type="application/x-shockwave-flash" data="http://p.jwpcdn.com/6/8/jwplayer.flash.swf" width="950" height="535" id="player_421" name="player_421">
<param name="allowfullscreen" value="true" />
<param name="wmode" value="opaque" /></object>
<script type="text/javascript">
jwplayer("player_421").setup({
file: "http://cdn-zc-lsd-3.planisys.net:1935/TV1/smil:tv1live.smil/playlist.m3u8",
title: "360 TV - colgado.TV",width: "950",height: "535",stretching: "exactfit",autostart: "true"});
</script>'];
include_once'../controller/prepare.php';
?>