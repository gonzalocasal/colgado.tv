<?php
$model=[
'active'=>'radios', 
'title'=>'Vorterix',
'description'=>'Escuchar Vorterix por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.vorterix.com/',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php';	
?>