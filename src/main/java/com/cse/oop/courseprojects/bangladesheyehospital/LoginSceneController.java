package com.cse.oop.courseprojects.bangladesheyehospital;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginSceneController
{
    @javafx.fxml.FXML
    private TextField passwordTextField;
    @javafx.fxml.FXML
    private TextField emailTextField;
    @javafx.fxml.FXML
    private ComboBox<String> selectUserComboBox;
    @javafx.fxml.FXML
    private Label hotlineLabel;
    @javafx.fxml.FXML
    private Label titleNameLabel;
    @javafx.fxml.FXML
    private Label selectUserLabel;
    @javafx.fxml.FXML
    private Label passwordLabel;
    @javafx.fxml.FXML
    private Label userIDLabel;

    @javafx.fxml.FXML
    public void initialize() {
        selectUserComboBox.getItems().addAll("Doctor", "Delivery InCharge", "Facility Manager", "Nurse", "Patient", "Pharmacist", "Receptionist", "System Admin");
    }

    @javafx.fxml.FXML
    public void resetPasswordButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void loginButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void createNewProfileButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void appointmentButton(ActionEvent actionEvent) {
    }
}