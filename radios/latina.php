<?php
$model=[
'active'=>'radios', 
'title'=>'Latina',
'description'=>'Escuchar Latina por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.fmlatina925.com.ar/?programacion',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php';	
?>