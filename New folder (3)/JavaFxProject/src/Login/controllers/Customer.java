package Login.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.management.ConstructorParameters;
import java.io.IOException;

public class Customer {


    @FXML
    public PasswordField passwordField;

    @FXML
    public TextField usernameField;

    @FXML
    public Button go_back;

    @FXML
    public Button btn_msg4;

    @FXML
    public Text loginMessage;

    @FXML
    public Button sign_up_c;

    @FXML
    void Sign_up_c(ActionEvent event) {

        Stage stage = (Stage) sign_up_c.getScene().getWindow();
        stage.setTitle("Customer account");

        Parent root3 = null;
        try {
            root3 = FXMLLoader.load(getClass().getResource("/Log In/makeaccountcus.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root3, 1200, 700);
        stage.setScene(scene);
        stage.show();

    };

    @FXML
    void back(ActionEvent event) {

        Stage stage = (Stage) go_back.getScene().getWindow();
        stage.setTitle("LogIn");

        Parent root4 = null;
        try {
            root4 = FXMLLoader.load(getClass().getResource("/Log In/Login.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root4, 1200, 700);
        stage.setScene(scene);
        stage.show();

    };



    public void pressButton() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username == null || username.isEmpty()) {
            loginMessage.setText("Please enter a valid username!");
            return;
        }else
        if (password == null || password.isEmpty()) {
            loginMessage.setText("Please enter password");
            return;
        }
}




}
