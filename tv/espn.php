<?php
$model=[
'active'=>'tv',
'ad'=>true,
'protected'=>true,
'title'=>'ESPN',
'description'=>'Ver ESPN por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.directv.com.ar/guia/ChannelDetail.aspx?id=623',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php'	;
?>