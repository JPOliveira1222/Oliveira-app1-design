/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 Joao Pedro Oliveira
 */
package Sample.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class loadListController {

    @FXML
    private TableView<?> LoadListTable;
    // table view for all previously saved lists

    @FXML
    private Button loadListButton;
    //button that will load back the previous list

    @FXML
    private TableColumn<?, ?> loadListTableDate;
    //table view of the date created of the load file

    @FXML
    private TableColumn<?, ?> loadListTableDescription;
    //table view of description of load file

    @FXML
    private TableColumn<?, ?> loadListTableName;
    //table view of name of load file
}

    class loadFile{

    }
