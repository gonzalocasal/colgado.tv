<?php
$model=[
'active'=>'radios', 
'title'=>'Cadena 3',
'description'=>'Escuchar Cadena 3 por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.cadena3.com/programacion.asp',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php';	
?>