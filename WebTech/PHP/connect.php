<?php
	$firstName = $_POST['firstname'];
	$lastName = $_POST['lastname'];
	$email = $_POST['email'];
	$add = $_POST['add'];

    echo "Name";
    echo "    ";
    echo $firstName;
    echo " ";
    echo $lastName;
    echo "<br>";
    echo "<br>";
    echo "Email";
    echo "    ";
    echo $email;
    echo "<br>";
    echo "<br>";
    echo "Address";
    echo "    ";
    echo $add;
   
	
	// $conn = new mysqli('localhost','root','','test');
	// if($conn->connect_error){
	// 	echo "$conn->connect_error";
	// 	die("Connection Failed : ". $conn->connect_error);
	// } else {
	// 	$stmt = $conn->prepare("insert into lala(firstName, lastName, email,address) values(?, ?, ?, ?)");
	// 	$stmt->bind_param("sssssi", $firstName, $lastName, $email, $add);
	// 	$execval = $stmt->execute();
	// 	echo $execval;
	// 	echo "Registeation done";
	// 	$stmt->close();
	// 	$conn->close();
	// }
?>