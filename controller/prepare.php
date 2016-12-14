<?php
require_once 'config.php';
 header("Cache-Control: no-cache, must-revalidate"); //HTTP 1.1
  header("Pragma: no-cache"); //HTTP 1.0
  header("Expires: Sat, 26 Jul 1997 05:00:00 GMT"); // Date in the past
$environmet=['googleKey'=>getenv('GOOGLE_KEY'),'captcha'=>getenv('CAPTCHA_PUBLIC_KEY'),'version'=>getenv('VIEW_VERSION')];
$model = array_merge($model, $environmet);
$template = $twig->loadTemplate("template.html");
$template->display($model);
?>