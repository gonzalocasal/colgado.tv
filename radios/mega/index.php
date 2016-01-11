<?php
$activa=['','',' pagActiva','','']; 
$titulo='Mega';
$descripcion='Escuchar Mega por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.';
$ad='no';
$programacion='http://www.fm-mega983.com.ar/';
$player='<script src="http://jwpsrv.com/library/40TpZB2+EeOLRiIACusDuQ.js"></script>
		<div id="playeriOvjuhZDLLIt"></div>
		<script type="text/javascript">
    	jwplayer("playeriOvjuhZDLLIt").setup({
        file: "rtmp://server4.stweb.tv:1935/mega983?wmsAuthSign=c2VydmVyX3RpbWU9Mi85LzIwMTUgMTI6MTc6NTEgUE0maGFzaF92YWx1ZT1NOXFaZVVLNWVqaXZiaHNvbGhQWVdBPT0mdmFsaWRtaW51dGVzPTIw/live",
        height: "30",
        autostart: "true"
    	});
		</script>';
include_once'../../controller/prepare.php';	
?>
