<?php
$model=[
'active'=>'radios', 
'title'=>'La 100',
'description'=>'Escuchar La 100 por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.cienradios.com.ar/argentina/la-100/vivo#fragment-2',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php';	
?>