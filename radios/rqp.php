<?php
$model=[
'active'=>'radios', 
'title'=>'RQP',
'description'=>'Escuchar RQP por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.rqp.fm/',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php';	
?>

