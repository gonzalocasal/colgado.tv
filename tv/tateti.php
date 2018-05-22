<?php
$model=[
'active'=>'tv',
'ad'=>true,
'title'=>'TATETI',
'description'=>'Ver TATETI por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://tateti.tv/programas',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php';	
?>