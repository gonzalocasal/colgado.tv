<?php
$activa=['','',' pagActiva','','']; 
$titulo='Radio Nacional';
$descripcion='Escuchar Radio Nacional por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.';
$ad='no';
$programacion='http://www.radionacional.com.ar/?page_id=2171';
$player='<object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" codebase="http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=6,0,29,0" width="241" height="24">
    <param name="movie" value="http://www.alsolnet.com/stream/sc_rad1/alsolnethdcompact.swf">
    <param name="flashvars" value="audioid=sc_rad1">
    <param name="quality" value="high">
    <embed src="http://www.alsolnet.com/stream/sc_rad1/alsolnethdcompact.swf" flashvars="audioid=sc_rad1" quality="high" pluginspage="http://www.macromedia.com/go/getflashplayer" type="application/x-shockwave-flash" width="241" height="24"></object>';
include_once'../../controller/prepare.php';	
?>