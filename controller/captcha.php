<?php
session_start();
if (!isset($_SESSION["again"]) and (!isset($_POST["email"]))){
	header("Location:".$_SERVER["DOCUMENT_ROOT"]."");
}
if (isset($_POST["email"])){
	$_SESSION["name"] = $_POST["name"]; 
	$_SESSION["email"] = $_POST["email"]; 
	$_SESSION["message"] = $_POST["message"];
}
?>