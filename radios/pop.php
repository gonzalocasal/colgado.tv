<?php
$model=[
'active'=>'radios', 
'title'=>'POP',
'description'=>'Escuchar POP por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.pop-radio.com.ar/',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php';	
?>