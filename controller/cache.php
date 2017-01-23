<?php
//if (isMedia()){
if (true){
	header("Cache-Control: no-cache, no-store, must-revalidate"); // HTTP 1.1.
	header("Pragma: no-cache"); // HTTP 1.0.
	header("Expires: 0");
}
function isMedia(){
	return array_key_exists('player', $model);
}
?>