<?php
$model=[
'active'=>'tv',
'ad'=>true,
'title'=>'HispanTV',
'schedule'=>'http://www.hispantv.com/programacion',
'description'=>'Ver HispanTV por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php'	;
?>