<?php
$model=[
'active'=>'tv',
'ad'=>true,
'title'=>'A&#38;E',
'description'=>'Ver A&#38;E por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.directv.com.ar/guia/ChannelDetail.aspx?id=207',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php'	;
?>
