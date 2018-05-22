<?php
$model=[
'active'=>'tv',
'ad'=>true,
'title'=>'Argentinisima',
'description'=>'Ver Argentinisima por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.argentinisimatv.com.ar/grilla/grilla.html',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php'	;
?>