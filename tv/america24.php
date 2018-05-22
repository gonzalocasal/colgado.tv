<?php
$model=[
'active'=>'tv',
'ad'=>'si',
'title'=>'Am&eacute;rica 24',
'description'=>'Ver Am&eacute;rica 24 por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.directv.com.ar/guia/ChannelDetail.aspx?id=719',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php'	;
?>