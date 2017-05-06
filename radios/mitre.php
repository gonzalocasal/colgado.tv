<?php
$model=[
'active'=>'radios', 
'title'=>'Mitre',
'description'=>'Escuchar Mitre por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://secciones.cienradios.com.ar/radiomitre/programacion-mitre-am-790/',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php';	
?>