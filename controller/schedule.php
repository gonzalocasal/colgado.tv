<?php
include 'event.php';
$format = 'd/m/Y H:i';
$dateBsAs = new DateTime("now", new DateTimeZone("America/Argentina/Buenos_Aires"));
$currentDate = date_format($dateBsAs, $format);
$dateBegin = $event['date'].' '.$event['begin'];
$dateEnd   = $event['date'].' '.$event['ends'];
$dateBegin   = \DateTime::createFromFormat($format,$dateBegin);
$dateEnd     = \DateTime::createFromFormat($format,$dateEnd);
$currentDate = \DateTime::createFromFormat($format,$currentDate);
$model['EVENT'] = ($dateBegin < $currentDate && $currentDate < $dateEnd? $event : false);
?>