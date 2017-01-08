<?php
if (array_key_exists('player', $model) || validateVersion() ){
	header("Cache-Control: no-cache, no-store, must-revalidate"); // HTTP 1.1.
	header("Pragma: no-cache"); // HTTP 1.0.
	header("Expires: 0");
}

function validateVersion(){
	return 	(getenv('VIEW_VERSION') != $_GET['v']);
}
?>