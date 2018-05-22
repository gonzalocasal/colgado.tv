<?php
$model=[
'active'=>'tv',
'ad'=>true,
'title'=>'TV P&uacute;blica',
'description'=>'Ver la TV P&uacute;blica por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.directv.com.ar/guia/ChannelDetail.aspx?id=121',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php';	
?>