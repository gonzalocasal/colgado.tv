<?php
require 'cache.php';
require 'config.php';
$environmet=[
'googleKey'=>getenv('GOOGLE_KEY'),
'captcha'=>getenv('CAPTCHA_PUBLIC_KEY'),
'version'=>getenv('VIEW_VERSION')];
header("Cache-Control: no-store, no-cache, must-revalidate, max-age=0");
header("Cache-Control: post-check=0, pre-check=0", false);
header("Pragma: no-cache");
$model = array_merge($model, $environmet);
$template = $twig->loadTemplate("template.html");
$template->display($model);
?>