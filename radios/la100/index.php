<?php
$activa=['','',' pagActiva','','']; 
$titulo='La 100';
$descripcion='Escuchar La 100 por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.';
$ad='no';
$programacion='http://www.cienradios.com.ar/argentina/la-100/vivo#fragment-2';
$player='<script src="http://jwpsrv.com/library/40TpZB2+EeOLRiIACusDuQ.js"></script>
		<div id="playeriOvjuhZDLLIt"></div>
		<script type="text/javascript">
    	jwplayer("playeriOvjuhZDLLIt").setup({
        file: "http://buecrplb01.cienradios.com.ar/la100.aac",
        height: "30",
        autostart: "true"
    	});
		</script>';
include_once'../../controller/prepare.php';	
?>