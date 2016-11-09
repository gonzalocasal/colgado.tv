<?php
$model=[
'activa'=>0,
'ad'=>true,
'titulo'=>'TV P&uacute;blica',
'descripcion'=>'Ver la TV P&uacute;blica por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'programacion'=>'http://www.directv.com.ar/guia/ChannelDetail.aspx?id=121',
'player'=>'
	<div id="tvpublica" style="height:405px; width:710px;" > 
    <iframe id="ciframe" src="http://www.tvpublica.com.ar/vivo-2/" width="950" height="950" style="margin-top: -165px; margin-left: -120px;"allowfullscreen></iframe>
  </div>
'];
include_once'../controller/prepare.php';	
?>