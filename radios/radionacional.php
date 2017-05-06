<?php
$model=[
'active'=>'radios',
'title'=>'Radio Nacional',
'description'=>'Escuchar Radio Nacional por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.radionacional.com.ar/?page_id=2171',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php';
?>
