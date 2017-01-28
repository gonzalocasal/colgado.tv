<?php
$version = getenv('VIEW_VERSION');
$update = ( isset($_COOKIE["VIEW_VERSION"]) && $_COOKIE["VIEW_VERSION"] == $version);
if (array_key_exists('player', $model) || $update){
	header("Cache-Control: no-cache, no-store, must-revalidate"); // HTTP 1.1.
	header("Pragma: no-cache"); // HTTP 1.0.
	header("Expires: 0");
	setcookie("VIEW_VERSION", $version, time() + 604800);
}
?>
