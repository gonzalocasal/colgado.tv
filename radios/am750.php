<?php
$model=[
'active'=>'radios', 
'title'=>'AM 750',
'description'=>'Escuchar AM 750 por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://radioam750.com.ar/',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php';	
?>