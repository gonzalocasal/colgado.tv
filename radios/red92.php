<?php
$model=[
'active'=>'radios', 
'title'=>'Red 92',
'description'=>'Escuchar Red 92 por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.red92.com/',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php';	
?>