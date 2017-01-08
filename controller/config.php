<?php
header("Content-Type: text/html; charset=utf-8");
$root= $_SERVER["DOCUMENT_ROOT"];
require_once ''.$root.'/controller/vendor/twig/lib/Twig/Autoloader.php';
$templateDir=''.$root.'/view/';
$templateDirCompi=''.$root.'/view/view-c';
Twig_Autoloader::register();
$loader = new Twig_Loader_Filesystem($templateDir);
$twig = new Twig_Environment($loader);
require 'cacheControl.php';
?>