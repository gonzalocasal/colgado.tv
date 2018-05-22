<?php
$model=[
'active'=>'tv',
'ad'=>true,
'title'=>'LN+',
'schedule'=>'http://lnmas.lanacion.com.ar/',
'description'=>'Ver La Naci&oacute;n M&aacute;s por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php'	;
?>