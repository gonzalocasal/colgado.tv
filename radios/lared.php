<?php
$model=[
'active'=>'radios', 
'title'=>'La Red',
'description'=>'Escuchar La Red por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.radiolared.multimediosamerica.com.ar/podcasts',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php';	
?>