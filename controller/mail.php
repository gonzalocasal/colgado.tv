<?php 

session_start(); 
require('vendor/sendgrid/sendgrid-php.php');
require('vendor/recaptchalib.php');

$secret = getenv('CAPTCHA_SECRET_KEY');
$response = null; 
$reCaptcha = new ReCaptcha($secret);

if ($_POST["g-recaptcha-response"]) {
	$response = $reCaptcha->verifyResponse($_SERVER["REMOTE_ADDR"], $_POST["g-recaptcha-response"]);
}

if ($response != null && $response->success) {

    $name    = $_SESSION["name"]; 
    $email   = $_SESSION["email"]; 
    $message = $_SESSION["message"];
    $receiver= getenv('EMAIL_RECEIVER');

	$from = new SendGrid\Email(null, $email);
	$subject = "contacto de ".$name;
	$to = new SendGrid\Email(null, $receiver);
	$content = new SendGrid\Content("text/plain",$message);
	$mail = new SendGrid\Mail($from, $subject, $to, $content);

	$apiKey = getenv('SENDGRID_API_KEY');
	$sg = new \SendGrid($apiKey);

	$response = $sg->client->mail()->send()->post($mail);

	session_destroy();
	require('../contacto/mensaje.php');
}else{
	header("Location:".$_SERVER["DOCUMENT_ROOT"]."");
}

?>