module com.example.todolist {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.todolist to javafx.fxml;
    exports com.example.todolist;
    exports Sample.Controller;
    opens Sample.Controller to javafx.fxml;
}