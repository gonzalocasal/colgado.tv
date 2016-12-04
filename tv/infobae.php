<?php
$model=[
'active'=>0,
'ad'=>true,
'title'=>'Infobae TV',
'description'=>'Ver Infobae TV por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.infobae.com/tv',
'player'=>'<object type="application/x-shockwave-flash" name="StrobeMediaPlayback" data="http://denivip.ru/smp/StrobeMediaPlayback.swf" width="950" height="535" id="StrobeMediaPlayback" style="visibility: visible;">
	<param name="allowFullScreen" value="true">
	<param name="wmode" value="transparent">
	<param name="flashvars" value="src=http://200.69.47.114:1935/infobae/movil/playlist.m3u8&amp;autoPlay=true&amp;scaleMode=stretch&amp;verbose=true&amp;controlBarAutoHide=true&amp;controlBarPosition=bottom&amp;poster=images/poster.png&amp;plugin_hls=http://denivip.ru/smp/HLSDynamicPlugin.swf"></object>'];
include_once'../controller/prepare.php'	;
?>