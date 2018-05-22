<?php
$model=[
'active'=>'tv',
'ad'=>true,
'protected'=>false,
'title'=>'FX',
'description'=>'Ver FX por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.directv.com.ar/guia/ChannelDetail.aspx?id=217',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php'	;
?>
