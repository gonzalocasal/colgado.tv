<?php
$model=[
'activa'=>2, 
'titulo'=>'POP',
'descripcion'=>'Escuchar POP por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'ad'=>'no',
'programacion'=>'http://www.pop-radio.com.ar/',
'player'=>'<script src="http://jwpsrv.com/library/40TpZB2+EeOLRiIACusDuQ.js"></script>
		<div id="playeriOvjuhZDLLIt"></div>
		<script type="text/javascript">
    	jwplayer("playeriOvjuhZDLLIt").setup({
        file: "rtmp://popradio.stweb.tv:1935/popradio/live",
        height: "30",
        autostart: "true"
    	});
		</script>'];
include_once'../../controller/prepare.php';	
?>


