<?php
session_start();
if (!isset($_SESSION["again"]) and (!isset($_POST["email"]))){
	header("Location:".$_SERVER["DOCUMENT_ROOT"]."");
}
if (isset($_POST["email"])){
	$_SESSION["nombre"] = $_POST["nombre"]; 
	$_SESSION["email"] = $_POST["email"]; 
	$_SESSION["mensaje"] = $_POST["mensaje"];
}


$sub="'boton-submit'";
$cards[1]=' <script src="https://www.google.com/recaptcha/api.js?hl=es"></script><form action="../controller/mail.php" id="form-captcha" method="post" ><div class="g-recaptcha" data-sitekey="6LdsSQoTAAAAAGmhRnttiooSCafXzfM0YPoIdyNp"></div><br/><div id="enviar"><input type="submit" value="ENVIAR" id="boton-submit"/><br><a href="javascript:{}" class="boton" onclick="document.getElementById('.$sub.').click(); return false;">ENVIAR</a></div></form>';

$model=[
'activa'=>3,
'titulo'=>'Contacto | Colgado',
'descripcion'=>'Colgado.TV es el mejor sitio web para ver TV y escuchar radio por internet en vivo las 24hs online, gratis y sin l&iacute;mites.',
'cards' => $cards];

include_once'../controller/prepare.php';
?>
