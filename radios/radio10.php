<?php
$model=[
'active'=>'radios', 
'title'=>'Radio 10',
'description'=>'Escuchar Radio 10 por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.radio-diez.com.ar/',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php';	
?>


