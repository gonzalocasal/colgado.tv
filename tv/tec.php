<?php
$model=[
'active'=>'tv',
'ad'=>true,
'title'=>'Tecn&oacute;polis TV',
'description'=>'Ver Tecn&oacute;polis TV TEC por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.tectv.gob.ar/index.php/programacion',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php';	
?>