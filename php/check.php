<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>CheckBox</title>
</head>
<body>
    <input type="checkbox" name="extras[]" value="garage" checked>Garage
    <input type="checkbox" name="extras[]" value="añberca">Alberca
    <input type="checkbox" name="extras[]" value="Jardin">Jardin

</body>
</html>
<?php
$extras = $_REQUEST['extras'];
foreach($extras as $extra)
    print("$extra<br>\n");
?>