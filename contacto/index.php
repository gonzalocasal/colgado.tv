<?php
$sub="'boton-submit'";
$cards[1]='<img  src="/view/imgs/contacto.jpg" height="197" width="248" alt="Contacto"/><br><form action="captcha.php" id="form-contacto" method="post" >		<input id="nombre" name="nombre" class="inputcontacto" type="text" placeholder="Nombre" required value=""><br>		<input id="email" name="email" class="inputcontacto" type="email" placeholder="Email" required value=""><br>		<textarea id="mensaje" class="inputcontacto"  name="mensaje" placeholder="Mensaje" required rows="2"></textarea><br><div id="enviar"><input type="submit" value="ENVIAR" id="boton-submit"/><br><a href="javascript:{}" class="boton" onclick="document.getElementById('.$sub.').click(); return false;">ENVIAR</a></div></form>';	

$model=[
'activa'=>3,
'titulo'=>'Contacto | Colgado',
'luces'=>'no',
'ad'=>'no',
'programacion'=>'',
'descripcion'=>'Colgado.TV es el mejor sitio web para ver TV y escuchar radio por internet en vivo las 24hs online, gratis y sin l&iacute;mites.',
'cards' => $cards];

include_once'../controller/prepare.php';
?>