<?php
$model=[
'active'=>'radios',
'title'=>'Disney Radio',
'description'=>'Escuchar Disney por internet en vivo las 24hs toda la programaci&oacute;n online y sin l&iacute;mites.',
'programacion'=>'http://radiodisney.disneylatino.com/la/index.php?c=argentina#!/categorias/16/destacados',
'player'=> basename($_SERVER["PHP_SELF"], ".php")];
include_once'../controller/prepare.php';
?>