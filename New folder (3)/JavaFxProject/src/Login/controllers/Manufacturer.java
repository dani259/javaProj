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

import java.io.IOException;

public class Manufacturer {



    @FXML
    public PasswordField passwordField;
    @FXML
    public TextField usernameField;
    @FXML
    public Text loginMessage;
    @FXML
    public TextField IDField;


    @FXML
    public Button go_back;

    @FXML
    public Button sign_up_m;



    @FXML
    void Sign_up_m(ActionEvent event) {

        Stage stage = (Stage) sign_up_m.getScene().getWindow();
        stage.setTitle("Manufacturer account");

        Parent root3 = null;
        try {
            root3 = FXMLLoader.load(getClass().getResource("/Log In/makeaccountman.fxml"));
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
        //stage.setTitle("LogIn");

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




    public void pressButton() throws IOException {
       String username = usernameField.getText();
       String password = passwordField.getText();
        String ID = IDField.getText();

        if (username == null || username.isEmpty()) {
            loginMessage.setText("Please enter a valid username!");
            return;
        } else if (password == null || password.isEmpty()) {
            loginMessage.setText("Please enter password");
            return;
        }else if (ID == null || ID.isEmpty()){
            IDField.setText("Please enter a valid ID");
        }
    }




}
