module com.cse.oop.courseprojects.bangladesheyehospital {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cse.oop.courseprojects.bangladesheyehospital to javafx.fxml;
    exports com.cse.oop.courseprojects.bangladesheyehospital;
}