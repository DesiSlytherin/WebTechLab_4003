<!DOCTYPE html>
<html>
<head>
    <title>Coffee Menu</title>
    <link rel="stylesheet" href="style.css">
</head>
    <body>
        <h1>Menu</h1>
        <table>
            <tr>
                <th>Drink</th>
                <th>Size</th>
                <th>Type</th>
                <th>Calories</th>
            </tr>
            <?php
            $xml = simplexml_load_file('coffee.xml');
            if ($xml) {
                foreach ($xml->coffee as $cof) {
                    echo "<tr>";
                    echo "<td>" . $cof->drink . "</td>";
                    echo "<td>" . $cof->size . "</td>";
                    echo "<td>" . $cof->type . "</td>";
                    echo "<td>" . $cof->calories . "</td>";

                    echo "</tr>";
                }
            } else {
                echo "<tr><td colspan='5'>Failed to load the XML file.</td></tr>";
            }
            ?>
        </table>
    </body>
</html>