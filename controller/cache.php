<?php
$version = getenv('VIEW_VERSION');
if( isset($_COOKIE["VIEW_VERSION"]) && $_COOKIE["VIEW_VERSION"] == $version){
	$update = false;
}
else{
	$update=true;
	setcookie("VIEW_VERSION", $version, time() + 604800);
}
if (array_key_exists('player', $model) || $update){
	header("Cache-Control: no-cache, no-store, must-revalidate"); // HTTP 1.1.
	header("Pragma: no-cache"); // HTTP 1.0.
	header("Expires: 0");
}
?>
