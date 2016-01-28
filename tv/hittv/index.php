<?php
$activa=0;
$ad='si';
$titulo='Hit TV';
$descripcion='Ver Hit TV por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.';
$programacion='';
$player='<object width="800" height="450" id="container_api" name="container_api" data="http://www.kisstelevision.es/flowplayer-3.2.16.swf" 
type="application/x-shockwave-flash"><param name="allowfullscreen" value="true">
<param name="allowscriptaccess" value="always">
<param name="wmode" value="transparent">
<param name="quality" value="high"><param name="bgcolor" value="#000000">
<param name="flashvars" 
value="config={&quot;clip&quot;:{&quot;provider&quot;:&quot;rtmp&quot;,&quot;live&quot;:&quot;true&quot;,&quot;url&quot;:&quot;live&quot;,&quot;autoBuffering&quot;:&quot;true&quot;,&quot;autoplay&quot;:&quot;true&quot;},&quot;plugins&quot;:{&quot;rtmp&quot;:{&quot;url&quot;:&quot;flowplayer.rtmp-3.2.3.swf&quot;,&quot;netConnectionUrl&quot;:&quot;rtmp://tst.es.flash.glb.ipercast.net/tst.es-live/&quot;},&quot;ova&quot;:{&quot;url&quot;:&quot;ova.swf&quot;,&quot;autoPlay&quot;:true,&quot;ads&quot;:{&quot;schedule&quot;:[{&quot;position&quot;:&quot;pre-roll&quot;,&quot;tag&quot;:&quot;http://ads.telecinco.es/RealMedia/ads/adstream_sx.ads/www.kissfm.es/videos/canaltelevision/[123]@x50&quot;}]}}},&quot;playerId&quot;:&quot;container&quot;,&quot;playlist&quot;:[{&quot;provider&quot;:&quot;rtmp&quot;,&quot;live&quot;:&quot;true&quot;,&quot;url&quot;:&quot;live&quot;,&quot;autoBuffering&quot;:&quot;true&quot;,&quot;autoplay&quot;:&quot;true&quot;}]}"></object>';
include_once'../../controller/prepare.php';
?>