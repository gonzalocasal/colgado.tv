<?php
$model=[
'active'=>'radios', 
'title'=>'Brava',
'description'=>'Escuchar Brava por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.fmbrava.net.ar/index.php?option=com_content&view=category&layout=blog&id=38&Itemid=110',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php';	
?>