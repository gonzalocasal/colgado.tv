<?php
include_once'../controller/event.php';
$model=[
'active'=>'tv',
'ad'=>true,
'title'=> $event['title'],
'description'=>$event['description'],
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php';
?>
