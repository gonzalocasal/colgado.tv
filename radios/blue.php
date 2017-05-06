<?php
$model=[
'active'=>'radios', 
'title'=>'Blue',
'description'=>'Escuchar Blue por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://bluefm.com.ar/programacion/',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php';	
?>