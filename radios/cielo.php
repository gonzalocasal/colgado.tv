<?php
$model=[
'active'=>'radios', 
'title'=>'Cielo',
'description'=>'Escuchar Cielo por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://cielofm.com/#programacion',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php';	
?>