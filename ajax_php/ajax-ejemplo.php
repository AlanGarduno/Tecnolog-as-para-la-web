<?php
$dbhost = "localhost";
$dbuser = "root";
$dbpass = "0709";
$dbname = "prueba";
mysql_connect($dbhost, $dbuser, $dbpass);
mysql_select_db($dbname) or die(mysql_error());
$edad = $_GET['edad'];
$sexo = $_GET['sexo'];
$anio = $_GET['anio'];
$edad = mysql_real_escape_string($edad);
$sexo = mysql_real_escape_string($sexo);
$anio = mysql_real_escape_string($anio);
$query = "SELECT * FROM ajax_example WHERE sexo = '$sexo'";
if(is_numeric($edad))
$query .= " AND edad <= $edad";
if(is_numeric($anio))
$query .= " AND anio <= $anio";
$qry_result = mysql_query($query) or die(mysql_error());
$display_string = "<table>";
$display_string .= "<tr>";
$display_string .= "<th>Nombre</th>";
$display_string .= "<th>Edad</th>";
$display_string .= "<th>Sexo</th>";
$display_string .= "<th>Anio</th>";
$display_string .= "</tr>";
while($row = mysql_fetch_array($qry_result)) {
$display_string .= "<tr>";
$display_string .= "<td>$row[nombre]</td>";
$display_string .= "<td>$row[edad]</td>";
$display_string .= "<td>$row[sexo]</td>";
$display_string .= "<td>$row[anio]</td>";
$display_string .= "</tr>";
}
echo "Consulta: " . $query . "<br />";
$display_string .= "</table>";
echo $display_string;
?>