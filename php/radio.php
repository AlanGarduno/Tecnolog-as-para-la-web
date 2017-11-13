<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    Sexo:
    <input type="radio"
    name="sexo"
    value="M"
    checked>Mujer
    <input type="radio"
    name="sexo"
    value="H">Hombre
</body>
</html>
<?
    $sexo = $_REQUEST['sexo'];
    print($sexo)
?>