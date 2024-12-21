
<?php
;
$servername = "";
$username = "";
$password = "";
$dbname = "";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 
$name=$_POST["name"];
$email=$_POST["email"];
//$sql = "INSERT INTO member (     ) VALUES (        )";
$sql =" write your sql statement here";

if ($conn->query($sql) === FALSE) {   
    echo "Error: " . $sql . "<br>" . $conn->error;
}

$conn->close();
?>