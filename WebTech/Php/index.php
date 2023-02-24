<!-- <?php
    require_once('test.php');
?> -->

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">


    <link rel="stylesheet" href="test.css">
</head>

<body>


    <div>
        <!-- <?php
        if(isset($_POST['submit'])){
            $firstname = $_POST['firstname'];
            $lastname = $_POST['lastname'];
            $email = $_POST['email'];
            $addre = $_POST['add'];

            $sql = "INSERT INTO users (firstname,lastname,email,address) VALUES(?,?,?.?)";
            $stmtinsert = $db->prepare($sql);
            $result = $stmtinsert->execute([$firstname, $lastname, $email, $addre]);
            
            if($result){
                echo 'Successfully Saved';
            }
            else{
                echo 'Error while saving';
            }
            // echo $firstname . " " . $lastname . " " . $email. " " . $addre;
        }
    ?> -->
    </div>
    <form action="connect.php" method="post">
        <div class="container">
            <h3> Form </h3>
            <ul class="form-style-1">
                <li><label>Full Name <span class="required">*</span></label><input type="text" name="firstname" class="field-divided" placeholder="First" /> <input type="text" name="lastname" class="field-divided" placeholder="Last" /></li>
                <li>
                    <label>Email <span class="required">*</span></label>
                    <input type="email" name="email" class="field-long" />
                </li>
                <li>
                    <label> Address <span class="required">*</span></label>
                    <textarea name="add" id="field5" class="field-long field-textarea"></textarea>
                </li>

                <div class="upload-btn-wrapper">
                    <button class="btn"> <b> Photo </b></button>
                    <input type="file" name="myfile" />
                </div>

                <li>
                    <button type="reset" id="can"> Cancel </button>
                    <input type="submit" value="Submit" />
                </li>
            </ul>
        </div>
    </form>

    <script src="test.js"></script>
</body>

</html>
