<?php
$model=[
'active'=>'tv',
'ad'=>true,
'title'=>'TV Universidad',
'description'=>'Ver TV Universidad por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'https://tv.unlp.edu.ar/programas',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php'	;
?>