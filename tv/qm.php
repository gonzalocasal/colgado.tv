<?php
$model=[
'active'=>'tv',
'ad'=>true,
'title'=>'Qm',
'description'=>'Ver Qm por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://qmnoticias.com/',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php'	;
?>