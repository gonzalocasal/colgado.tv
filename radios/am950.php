<?php
$model=[
'active'=>'radios',
'title'=>'AM950 Radio Belgrano',
'description'=>'Escuchar AM950 Radio Belgrano por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.am950belgrano.com/programacion/',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php';
?>
