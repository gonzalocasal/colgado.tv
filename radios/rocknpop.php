<?php
$model=[
'active'=>'radios',
'title'=>'Rock & Pop Radio',
'description'=>'Escuchar Rock & Pop por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.vorterix.com/fmrockandpop/',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php';
?>
