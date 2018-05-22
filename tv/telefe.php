<?php
$model=[
'active'=>'tv',
'ad'=>true,
'title'=>'Telefe',
'description'=>'Ver Telefe online por internet en vivo las 24hs toda la programaci&oacute;n sin l&iacute;mites.',
'schedule'=>'http://www.directv.com.ar/guia/ChannelDetail.aspx?id=123',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php';	
?>