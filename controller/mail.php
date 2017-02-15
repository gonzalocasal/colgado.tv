<?php 
session_start(); 
require('vendor/sendgrid/sendgrid-php.php');
require('vendor/recaptchalib.php');

$secret = getenv('CAPTCHA_SECRET_KEY');
$reCaptcha = new ReCaptcha($secret);

if ($_POST["g-recaptcha-response"]) {
	$response = $reCaptcha->verifyResponse($_SERVER["REMOTE_ADDR"], $_POST["g-recaptcha-response"]);
}

if ( isset($response) != null && $response->success) {
   	$subject = "contacto de ".$_SESSION["name"];
	$from = new SendGrid\Email(null, $_SESSION["email"]);
	$to = new SendGrid\Email(null, getenv('EMAIL_RECEIVER'));
	$content = new SendGrid\Content("text/plain",$_SESSION["message"]);
	$mail = new SendGrid\Mail($from, $subject, $to, $content);

	$sg = new \SendGrid(getenv('SENDGRID_API_KEY'));
	$response = $sg->client->mail()->send()->post($mail);
	session_destroy();
	require('../contacto/mensaje.php');
}else{
	header("Location:".$_SERVER["DOCUMENT_ROOT"]."");
}
?>