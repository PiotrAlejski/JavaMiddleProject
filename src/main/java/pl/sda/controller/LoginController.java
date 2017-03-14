package pl.sda.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private PasswordField passwordTexField;

    @FXML
    private TextField loginTexField;

    @FXML
    void submitOnAction(ActionEvent event) {
        System.out.println(loginTexField.getText());
        System.out.println(passwordTexField.getText());
        Alert alert = new Alert(Alert.AlertType.INFORMATION, " Hello");
        alert.show();

/** 1.powołac do zycia UserService
 *  2. Tworzymy Usera z polami pobranymi z fieldów
 *  3. metoda Authentica
 *  4. sprawdzenie, czy haslo jesty OK(if)
 */
    }

}


