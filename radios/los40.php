<?php
$model=[
'active'=>'radios', 
'title'=>'Los 40',
'description'=>'Escuchar Los 40 por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.los40principales.com.ar/programacion.aspx',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php';	
?>