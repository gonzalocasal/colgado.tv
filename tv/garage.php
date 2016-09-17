<?php
$model=[
'activa'=>0,
'ad'=>true,
'titulo'=>'El Garage TV',
'descripcion'=>'Ver El Garage TV por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'programacion'=>'http://www.ar.elgarage.com/tv/programas',
'player'=>'<div class="noticecontent">
			<div id="swfclientid812780578581571_div" style="float: left; height: 0px;"><object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" id="swfclientid812780578581571" width="01" height="0" style="width:01px; height:0px;"> <param name="movie" value="http://octoshape-a.akamaihd.net/eps/swfclient/sua.swf"> <param name="flashvars" value="printfunc=swfclientid812780578581571print&amp;donefunc=swfclientid812780578581571done&amp;0=-osasua:id812780578581571osasua&amp;1=-suaosa:akamaihd.net:id812780578581571suaosa&amp;2=-allowDomain:octoshape-a.akamaihd.net&amp;3=-allowInsecureDomain:octoshape-a.akamaihd.net"> <param name="AllowScriptAccess" value="always"> <param name="wmode" value="transparent"> <embed src="http://octoshape-a.akamaihd.net/eps/swfclient/sua.swf" name="swfclientid812780578581571" wmode="transparent" allowscriptaccess="always" flashvars="printfunc=swfclientid812780578581571print&amp;donefunc=swfclientid812780578581571done&amp;0=-osasua:id812780578581571osasua&amp;1=-suaosa:akamaihd.net:id812780578581571suaosa&amp;2=-allowDomain:octoshape-a.akamaihd.net&amp;3=-allowInsecureDomain:octoshape-a.akamaihd.net" width="01" height="01" type="application/x-shockwave-flash"> </object></div><object type="application/x-shockwave-flash" id="player" name="player" data="http://octoshape-a.akamaihd.net/eps/players/infinitehd4/player.swf" width="720" height="405" style="visibility: visible;"><param name="allowFullScreen" value="true"><param name="scale" value="noscale"><param name="allowScriptAccess" value="always"></object>
			<script type="text/javascript" src="//octoshape-a.akamaihd.net/eps/js/swfobject.js"></script><script type="text/javascript">
                var player_id = "player";
                var player_width = 800;
                var player_height = 450;
                var player_streams = [{                id: "my_stream",
                                               stream: "octoshape://streams.octoshape.net/datco/garage/live/flv/ch1/abr"}
                ];
                var player_stream = "my_stream";
                var params = {allowFullScreen: true, scale: "noscale", allowScriptAccess: "always"};
                var attributes = {id: player_id, name: player_id};
    			swfobject.embedSWF(document.location.protocol+"//octoshape-a.akamaihd.net/eps/players/infinitehd4/player.swf", player_id, player_width, player_height, "10.2.0", null, null, params, attributes);
			</script>
		   </div>
		'];
include_once'../controller/prepare.php'	;
?>