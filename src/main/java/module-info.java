module org.education.hospitalmanagementapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.j;
    requires com.google.protobuf;
    requires kernel;
    requires java.desktop;
    requires layout;


    opens org.education.hospitalmanagementapp to javafx.fxml;
    exports org.education.hospitalmanagementapp;
    opens org.education.hospitalmanagementapp.controllers to  javafx.fxml;
    exports org.education.hospitalmanagementapp.controllers to  javafx.fxmls;
}