<?php
$model=[
'active'=>'tv',
'ad'=>true,
'title'=>'DEPORTV',
'description'=>'Ver DEPORTV por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://deportv.gov.ar/wp-content/uploads/2014/03/GRILLA-PROGRAMACION.pdf',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php'	;
?>


