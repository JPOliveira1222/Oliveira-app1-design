package Sample.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class editViewController {

    @FXML
    private TableView<?> ItemEditView;
    //table view of item in list you want to edit

    @FXML
    private RadioButton completedNoRadio;
    //radio button to determine if list is completed

    @FXML
    private RadioButton completedYesRadio;
    //radio button to determine if list is not completed

    @FXML
    private TextArea descriptionEdit;
    //text area to update list description

    @FXML
    private DatePicker dueDateEdit;
    //are to change due date of title

    @FXML
    private TableColumn<?, ?> editTableDescription;
    //table view of description to edit item

    @FXML
    private TableColumn<?, ?> editTableItem;
    //table view of item name of item

    @FXML
    private TextField titleEdit;
    //text field to allow user of title edit
}