<?php
$model=[
'active'=>'tv',
'ad'=>true,
'protected'=>false,
'title'=>'FOX Sports',
'description'=>'Ver FOX Sports por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.directv.com.ar/guia/ChannelDetail.aspx?id=605',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php'	;
?>