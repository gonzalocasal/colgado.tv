<?php
$model=[
'active'=>'radios', 
'title'=>'Del Plata',
'description'=>'Escuchar Del Plata por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.amdelplata.com/index.php?option=com_grillaprogramacion&view=grillaprogramacion&days=lv&Itemid=14',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php';	
?>