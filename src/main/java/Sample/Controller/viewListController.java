package Sample.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuButton;

public class viewListController {
    @FXML
    private Button EditButton;
    // brings up edit widow

    @FXML
    private Button listDeleteButton;
    //allows user to delete selected window(s)

    @FXML
    private ListView<?> listTableView;
    // table view of lists

    @FXML
    private Button mainMenuButton;
    //button that takes user to main menu

    @FXML
    private Button saveButton;
    //button that takes user to save window

    @FXML
    private MenuButton sortByButton;
    //menu button that allows user to sort by date or title(possible allow search function?)

    public class delete{

    }

}
