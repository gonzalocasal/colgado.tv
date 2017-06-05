<?php
if (array_key_exists('player', $model) || array_key_exists('EVENT', $model) ){
	header("Cache-Control: no-cache, no-store, must-revalidate"); // HTTP 1.1.
	header("Pragma: no-cache"); // HTTP 1.0.
	header("Expires: 0");
}
?>