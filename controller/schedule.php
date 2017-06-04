<?php
include 'event.php';
$dateBsAs = new DateTime("now", new DateTimeZone("America/Argentina/Buenos_Aires"));
$currentDate = date_format($dateBsAs, 'd/m/Y H:i');
$currentDate = date('d/m/Y H:i', strtotime($currentDate));
$dateBegin   = date('d/m/Y H:i', strtotime($event['date'] .' '. $event['begin']));
$dateEnd     = date('d/m/Y H:i', strtotime($event['date'] .' '. $event['ends']));
if( ($dateBegin < $currentDate) && ($currentDate < $dateEnd) ){
	$model['vipe'] = $event;
}
?>