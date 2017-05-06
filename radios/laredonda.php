<?php
$model=[
'active'=>'radios', 
'title'=>'La Redonda',
'description'=>'Escuchar La Redonda por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.fmlaredonda.com.ar/programacion.aspx',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php';	
?>