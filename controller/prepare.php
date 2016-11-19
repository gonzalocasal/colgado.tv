<?php
header("Content-Type: text/html; charset=utf-8");
$root= $_SERVER["DOCUMENT_ROOT"];
require_once ''.$root.'/controller/vendor/twig/lib/Twig/Autoloader.php';

$templateDir=''.$root.'/view/';
$templateDirCompi=''.$root.'/view/view-c';
Twig_Autoloader::register();
$loader = new Twig_Loader_Filesystem($templateDir);

$key=['googleKey'=>getenv('GOOGLE_KEY')];
$model = array_merge($model, $key);
$twig = new Twig_Environment($loader);
$template = $twig->loadTemplate("template.html");

$template->display($model);
?>