<?php
$model=[
'activa'=>2, 
'titulo'=>'Radio Nacional',
'descripcion'=>'Escuchar Radio Nacional por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'programacion'=>'http://www.radionacional.com.ar/?page_id=2171',
'player'=>'
	<script src="http://www.raddios.com/application/libraries/reproh5/jplayerrtmp.min.js"></script>
	<div id="mediaplayer_wrapper" style="position: relative; display: block; width: 240px; height: 30px;">
	<a id="beforeswfanchor0" href="#mediaplayer" tabindex="-1" title="Flash start" style="border:0;clip:rect(0 0 0 0);display:block;height:1px;margin:-1px;outline:none;overflow:hidden;padding:0;position:absolute;width:1px;"></a>
	<object type="application/x-shockwave-flash" data="http://p.jwpcdn.com/6/12/jwplayer.flash.swf" 
	width="100%" height="100%" bgcolor="#000000" id="mediaplayer" name="mediaplayer"
	class="jwswf swfPrev-beforeswfanchor0 swfNext-afterswfanchor0" tabindex="0"><param name="allowfullscreen" value="true">
	<param name="allowscriptaccess" value="always"><param name="seamlesstabbing" value="true"><param name="wmode" value="transparent">
	</object>
	<a id="afterswfanchor0" href="#mediaplayer" tabindex="-1" title="Flash end" style="border:0;clip:rect(0 0 0 0);display:block;height:1px;margin:-1px;outline:none;overflow:hidden;padding:0;position:absolute;width:1px;"></a>
	<div id="mediaplayer_aspect" style="display: none;"></div><div id="mediaplayer_jwpsrv" style="position: absolute; top: 0px; z-index: 10;">
	<div class="afs_ads" style="width: 1px; height: 1px; position: absolute; background: transparent;">&nbsp;</div></div></div>
	<script type="text/javascript">jwplayer("mediaplayer").setup({file:"rtmp://186.33.227.197/rn_sc_rad7/rn_sc_rad7.stream",height:30,width:240,autostart:true});</script></div>'];
include_once'../controller/prepare.php';	
?>