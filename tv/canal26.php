<?php
$model=[
'active'=>'tv',
'ad'=>true,
'title'=>'Canal 26',
'description'=>'Ver Canal 26 internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.directv.com.ar/guia/ChannelDetail.aspx?id=720',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php';	
?>