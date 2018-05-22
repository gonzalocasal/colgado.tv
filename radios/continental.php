<?php
$model=[
'active'=>'radios', 
'title'=>'Continental',
'description'=>'Escuchar Continental por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.continental.com.ar/escucha/programacion/',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php';	
?>