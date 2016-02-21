<?php 
	session_start();
	require("vendor/mailer/class.smtp.php");
	require("vendor/mailer/class.phpmailer.php");
	require_once('../controller/vendor/recaptchalib.php');
	$secret = "6LdsSQoTAAAAALw_SUEaBaZp9r58BmVJ64NIYzX-";
	$response = null; 
	$reCaptcha = new ReCaptcha($secret);
	if ($_POST["g-recaptcha-response"]) {
		$response = $reCaptcha->verifyResponse(
		$_SERVER["REMOTE_ADDR"],
		$_POST["g-recaptcha-response"]
		);
	}
	if ($response != null && $response->success) {
	    $name    = $_SESSION["nombre"]; 
	    $email   = $_SESSION["email"]; 
	    $subject = $name." - Contacto";
	    $message = $_SESSION["mensaje"]; 
	    $mail = new PHPMailer();
	    $mail->SMTPOptions = array('ssl' => array('verify_peer' => false,'verify_peer_name' => false,'allow_self_signed' => true));
	    $mail->IsSMTP();
	    $mail->Host = "smtp.gmail.com";
	    $mail->Port = 587;
	    $mail->SMTPAuth = true;
	    $mail->Username = "user@gmail.com";
	    $mail->Password = "pass";
	    $mail->SMTPSecure = 'tls';
	    $mail->From = "from@gmail.com";
	    $mail->FromName = "Colgado.TV";
	    $mail->AddAddress("to@gmail.com");
	    $mail->IsHTML(true);
	    $mail->Subject = $subject;
	    $mail->Body = $mail_body ="
	    <h2>Contacto</h2>
	    <div><b>Nombre:  </b>".$name."<br></div>
	    <div><b>Email:   </b>".$email."<br></div> 
	    <div><b>Mensaje: </b>".$message."</div>";
	    $mail->Send();
	 	header("Location: http://colgado.tv/");   
	}
	else {
		$_SESSION["again"] = $_SESSION["nombre"];
		$_SESSION["result"] ="Parese ser que usted es un robot.";
		header("Location: http://colgado.tv/contacto/captcha.php"); 
	}
?>