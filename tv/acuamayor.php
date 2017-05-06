<?php
$model=[
'active'=>'tv',
'ad'=>true,
'title'=>'ACUA Mayor',
'description'=>'Ver ACUA Mayor por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://acuamayor.tda.gob.ar/programacion/',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php'	;
?>