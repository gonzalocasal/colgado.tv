<?php
$model=[
'active'=>'radios', 
'title'=>'Rivadavia',
'description'=>'Escuchar Rivadavia por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://rivadavia.com.ar/programacion/',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php';	
?>