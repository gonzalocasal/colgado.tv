<?php
session_start();
if (!isset($_SESSION["again"]) and (!isset($_POST["email"]))){
	header("Location:".$_SERVER["DOCUMENT_ROOT"]."");
}
if (isset($_POST["email"])){
	$_SESSION["nombre"] = $_POST["nombre"]; 
	$_SESSION["email"] = $_POST["email"]; 
	$_SESSION["mensaje"] = $_POST["mensaje"];
}
?>