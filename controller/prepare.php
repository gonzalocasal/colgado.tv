<?php
require_once 'config.php';
$environmet=['googleKey'=>getenv('GOOGLE_KEY'),'captcha'=>getenv('CAPTCHA_PUBLIC_KEY'),'version'=>getenv('VIEW_VERSION')];
$model = array_merge($model, $environmet);
$template = $twig->loadTemplate("template.html");
$template->display($model);
?>