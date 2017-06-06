<?php
$model=[
'active'=>'radios', 
'title'=>'Radio Con Vos',
'description'=>'Escuchar Radio Con Vos por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.radioconvos.com.ar',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php';	
?>