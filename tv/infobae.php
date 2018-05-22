<?php
$model=[
'active'=>'tv',
'ad'=>true,
'title'=>'Infobae TV',
'description'=>'Ver Infobae TV por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.infobae.com/tv',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php'	;
?>