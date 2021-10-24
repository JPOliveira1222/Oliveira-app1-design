/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 Joao Pedro Oliveira
 */
package Sample.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class addListController {


    @FXML
    private Button newListAddItems;
    /*
    opens new window that allows addition of more items
     */

    @FXML
    private TextArea newListDescription;
    /*
    allows user to input text to describe list
     */

    @FXML
    private DatePicker newListDueDate;
    /*
    allows user to choose date for due date
     */

    @FXML
    private Button newListSave;
    /*
    allows user to save list
     */

    @FXML
    private TextField newListTitle;
    /*
    allows user to input text to give title a list.
     */

    public static class saveFile {

    }

}
