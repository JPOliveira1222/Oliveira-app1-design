module com.example.todolist {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.junit.jupiter.api;


    opens com.example.todolist to javafx.fxml;
    exports com.example.todolist;
    exports Sample.Controller;
    opens Sample.Controller to javafx.fxml;
}