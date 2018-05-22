<?php
$model=[
'active'=>'radios', 
'title'=>'Vida',
'description'=>'Escuchar Vida por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.fmvida.com.ar/?activeSeccion_var=11',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php';	
?>