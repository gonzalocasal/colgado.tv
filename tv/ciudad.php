<?php
$model=[
'active'=>'tv',
'ad'=>true,
'title'=>'Canal de la Ciudad',
'description'=>'Ver Canal de la Ciudad internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.buenosaires.gob.ar/canaldelaciudad/programacion',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php'	;
?>
