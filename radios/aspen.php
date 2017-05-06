<?php
$model=[
'active'=>'radios', 
'title'=>'Aspen',
'description'=>'Escuchar Aspen por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.fmaspen.com/programacion.php',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php';	
?>