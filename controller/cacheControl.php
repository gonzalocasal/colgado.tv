<?php
$version = getenv('VIEW_VERSION');
if(!isset($_COOKIE['version'])) {
    setcookie("version", $version, time()+3600);
    $clientVersion = "noVersion";
} else {
    $clientVersion = $_COOKIE['version'];
}
echo "COOKIE:";
var_dump($_COOKIE['version']);
if (array_key_exists('player', $model) || ($version != $clientVersion)){
	header("Cache-Control: no-cache, no-store, must-revalidate"); // HTTP 1.1.
	header("Pragma: no-cache"); // HTTP 1.0.
	header("Expires: 0");
}
?>