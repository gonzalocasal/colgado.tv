<?php
header("Content-Type: text/html; charset=utf-8");
$root= $_SERVER["DOCUMENT_ROOT"];
require_once ''.$root.'/controller/vendor/twig/lib/Twig/Autoloader.php';
$templateDir=''.$root.'/view/';
$templateDirCompi=''.$root.'/view/view-c';
Twig_Autoloader::register();
$loader = new Twig_Loader_Filesystem($templateDir);
$twig = new Twig_Environment($loader);
if (in_array("player", $model)){
	header("Cache-Control: no-cache, no-store, must-revalidate"); // HTTP 1.1.
	header("Pragma: no-cache"); // HTTP 1.0.
	header("Expires: 0");
}
?>