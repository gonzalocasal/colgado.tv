<?php
$model=[
'active'=>'tv',
'ad'=>true,
'title'=>'Rusia 2018',
'description'=>'Mundial FIFA Rusia 2018 en VIVO por internet',
'schedule'=>'http://www.promiedos.com.ar/',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php';	
?>