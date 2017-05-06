<?php
$model=[
'active'=>'tv',
'ad'=>true,
'protected'=>true,
'title'=>'FOX Sports 2',
'description'=>'Ver FOX Sports 2 por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.directv.com.ar/guia/ChannelDetail.aspx?id=608',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php'	;
?>