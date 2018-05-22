<?php
$model=[
'active'=>'tv',
'ad'=>true,
'title'=>'Encuentro',
'description'=>'Ver encuentro por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.directv.com.ar/guia/ChannelDetail.aspx?id=126',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php'	;
?>