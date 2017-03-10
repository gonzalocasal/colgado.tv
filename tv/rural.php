<?php
$model=[
'active'=>'tv',
'ad'=>true,
'title'=>'Rural',
'description'=>'Ver Rural por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.directv.com.ar/guia/ChannelDetail.aspx?id=125',
'player'=>'<div style="overflow:hidden;width:750px;height:444px">
			<iframe id="ciframe" src="http://www.elrural.com/transmision-en-vivo" width="1200" height="970" style="margin-top: -450px; margin-left: -30px;" allowfullscreen></iframe>
			</div>'];
include_once'../controller/prepare.php'	;
?>