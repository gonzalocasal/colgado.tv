<?php
$model=[
'activa'=>1,
'ad'=>'si',
'titulo'=>'ECTV',
'descripcion'=>'Ver ECTV internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'programacion'=>'http://www.directv.com.ec/guia/ChannelDetail.aspx?id=187',
'player'=>'<object type="application/x-shockwave-flash" id="player1" name="player1" 
		data="http://www.ecuadortv.ec/mod_video/player.swf" width="800" height="450"><param name="allowfullscreen" value="true">
		<param name="allowscriptaccess" value="always">
		<param name="wmode" value="transparent">
		<param name="flashvars" value="file=http://www.ecuadortv.ec/mod_video/listaReproduccion.php&amp;autostart=true&amp;playlistsize=360&amp;lightcolor=#4f9cb0&amp;frontcolor=#efefef&amp;backcolor=#111111&amp;repeat=list"></object>'];
include_once'../controller/prepare.php';	
?>