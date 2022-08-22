module cs.ku.lab04 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ku.cs to javafx.fxml;
    exports ku.cs;

    exports ku.cs.shop.controllers;
    opens ku.cs.shop.controllers to javafx.fxml;
}