<?php
$model=[
'active'=>'radios', 
'title'=>'ESPN Radio',
'description'=>'Escuchar ESPN Radio por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.espn1079.fm/programacion/',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php';	
?>