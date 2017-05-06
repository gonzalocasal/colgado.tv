<?php
$model=[
'active'=>'radios', 
'title'=>'Cooperativa',
'description'=>'Escuchar Cooperativa por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.radiocooperativa.com.ar/?page_id=94',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php';	
?>