<?php
$model=[
'active'=>'radios', 
'title'=>'Metro',
'description'=>'Escuchar Metro por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.metro951.com',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php';	
?>