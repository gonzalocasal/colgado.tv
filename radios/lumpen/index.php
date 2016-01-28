<?php
$activa=2; 
$titulo='Lumpen';
$descripcion='Escuchar Lumpen por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.';
$ad='no';
$programacion='http://radiolumpen.com.ar/programas.php';
$player='<object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" codebase="http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=6,0,29,0" width="290" height="186">
			<param name="movie" value="http://www.alsolnet.com/stream/lumpen/alsolnethd.swf">
			<param name="flashvars" value="audioid=lumpen">
			<param name="quality" value="high">
			<embed src="http://www.alsolnet.com/stream/lumpen/alsolnethd.swf" flashvars="audioid=lumpen" quality="high" pluginspage="http://www.macromedia.com/go/getflashplayer" type="application/x-shockwave-flash" width="290" height="186"></object>';
include_once'../../controller/prepare.php';	
?>