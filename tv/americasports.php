<?php
$model=[
'active'=>'tv',
'ad'=>true,
'title'=>'Am&eacute;rica Sports',
'description'=>'Ver Am&eacute;rica  Sports por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.amsports.com.ar/programacion.php',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php';	
?>