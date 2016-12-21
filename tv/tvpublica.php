<?php
$model=[
'active'=>'tv',
'ad'=>true,
'title'=>'TV P&uacute;blica',
'description'=>'Ver la TV P&uacute;blica por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'schedule'=>'http://www.directv.com.ar/guia/ChannelDetail.aspx?id=121',
'player'=>'<div style="overflow:hidden;width:970px;height:544px">
			<iframe id="ciframe" src="http://www.tvpublica.com.ar/vivo-2/" width="1000" height="1040" style="margin-top: -170px; margin-left: -15px;" allowfullscreen></iframe>
			</div>'];
include_once'../controller/prepare.php';	
?>