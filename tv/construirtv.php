<?php
$model=[
'active'=>'tv',
'ad'=>true,
'title'=>'Construir TV',
'description'=>'Ver Construir TV por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.construirtv.com/?sec=3',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php'	;
?>