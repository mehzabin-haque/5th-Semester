
<?php

	$firstname = $_POST['firstname'];
	$lastname = $_POST['lastname'];
	$email = $_POST['email'];
	$addr = $_POST['add'];

    echo "Name";
    echo "    ";
    echo $firstname;
    echo " ";
    echo $lastname;
    echo "<br>";
    echo "<br>";
    echo "Email";
    echo "    ";
    echo $email;
    echo "<br>";
    echo "<br>";
    echo "Address";
    echo "    ";
    echo $addr;

   


   
	
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