<?php
header("Content-Type: text/html; charset=utf-8");
$root= $_SERVER["DOCUMENT_ROOT"];
require_once ''.$root.'/controller/vendor/twig/lib/Twig/Autoloader.php';
if (!isset($player)){
	$player='';
}else{
	$cards='';
}
$templateDir=''.$root.'/view/';
$templateDirCompi=''.$root.'/view/view-c';
Twig_Autoloader::register();
$loader = new Twig_Loader_Filesystem($templateDir);
$twig = new Twig_Environment($loader);
$template = $twig->loadTemplate("template");
$template->display(array('titulo' =>$titulo,'descripcion'=>$descripcion,'activa'=>$activa,'ad'=>$ad,'player'=>$player,'cards'=>$cards,'programacion'=>$programacion));
?>