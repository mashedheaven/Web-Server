<?php

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
$sql = "Enter your sql statement here";
$result = $conn->query($sql);

if ($result->num_rows > 0) {
    // output data of each row
    $count = 0;
	// use a while loop to display 3 members information
    while($row = $result->fetch_assoc() AND $count<3) {
        $count++;
        $name = $row["name"];
        $email = $row["email"];
        $id=$row["id"];     
	
?>

<!- Enter your html codes and php script to display the image, name and email >
    
<?php
    }
    
} else {
    echo "There is no member in the club!";
}
?>