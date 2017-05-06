<?php
$model=[
'active'=>'radios', 
'title'=>'Nacional Rock',
'description'=>'Escuchar Nacional Rock por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://nacionalrock.com/programas/',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php';	
?>