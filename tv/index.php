<?php
if (isset($index)){
	$model=[
	'activa'=>0,
	'titulo'=>'Colgado del Cable',
	'descripcion'=>'Colgado del Cable es el mejor sitio web para ver TV y escuchar radio por internet en vivo las 24hs online, gratis y sin l&iacute;mites.',
	'page'=>'tv.html'];
}
else{
	header('Location: /');
}?>
