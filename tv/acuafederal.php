<?php
$model=[
'active'=>'tv',
'ad'=>true,
'title'=>'ACUA Federal',
'description'=>'Ver ACUA Federal por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://acuafederal.tda.gob.ar/programacion',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php'	;
?>