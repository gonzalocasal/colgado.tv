<?php
include 'event.php';
$format = 'd/m/Y H:i';
$dateBsAs = new DateTime("now", new DateTimeZone("America/Argentina/Buenos_Aires"));
$currentDate = date_format($dateBsAs, $format);
$dateBegin   = \DateTime::createFromFormat($format,$event['beginDate']);
$dateEnd     = \DateTime::createFromFormat($format,$event['endDate']);
$currentDate = \DateTime::createFromFormat($format,$currentDate);
$model['EVENT'] = ($dateBegin < $currentDate && $currentDate < $dateEnd? $event : false);
?>