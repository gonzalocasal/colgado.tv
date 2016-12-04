<?php
$model=[
'active'=>0,
'ad'=>true,
'title'=>'One TV',
'description'=>'Ver One TV por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'player'=>'<script type="text/javascript" src="/view/js/player.js"></script>
<object type="application/x-shockwave-flash" data="http://p.jwpcdn.com/6/8/jwplayer.flash.swf" width="950" height="535" id="player_421" name="player_421">
<param name="allowfullscreen" value="true" />
<param name="wmode" value="opaque" /></object>
<script type="text/javascript">
jwplayer("player_421").setup({
file: "http://server5.stweb.tv/radioone/ngrp:live_all/playlist.m3u8",
title: "One TV - colgado.TV",width: "950",height: "535",stretching: "exactfit",autostart: "true"});
</script>'];
include_once'../controller/prepare.php'	;
?>
