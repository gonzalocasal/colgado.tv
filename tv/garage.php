<?php
$model=[
'active'=>'tv',
'ad'=>true,
'title'=>'El Garage TV',
'description'=>'Ver El Garage TV por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.elgarage.com/',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php'	;
?>