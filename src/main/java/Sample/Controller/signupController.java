package Sample.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class signupController {

    @FXML
    private AnchorPane signupDOB;
    /*
    Takes user input of date of birth
     */

    @FXML
    private TextField signupFirstName;
    /*
    Takes user input of FirstName
     */

    @FXML
    private TextField signupLastName;
    /*
    Takes user input of LastName
     */

    @FXML
    private Button signupSaveButton;
    /*
    Saves entered information unless it is empty. if empty, pops up error.
     */
}
class signUpUser{

}
