<?php
$activa=2; 
$titulo='Aspen';
$descripcion='Escuchar Aspen por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.';
$ad='no';
$programacion='http://www.fmaspen.com/programacion.php';
$player='<script src="http://jwpsrv.com/library/40TpZB2+EeOLRiIACusDuQ.js"></script>
		<div id="playeriOvjuhZDLLIt"></div>
		<script type="text/javascript">
    	jwplayer("playeriOvjuhZDLLIt").setup({
        file: "rtsp://server5.stweb.tv/aspen/live/",
        height: "30",
        autostart: "true"
    	});
		</script>';
include_once'../../controller/prepare.php';	
?>