package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private TextField UserName;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label labelError;


    List<User> usersList = new ArrayList<>();


    public void initialize(URL location, ResourceBundle resources )
    {
        usersList.add( new User()
        {{
            this.setUsername( "Admin" );
            this.setPassword( "Admin" );
        }} );
    }
    public void close()
    {
        Platform.exit();
    }
    public void about()
    {
        Alert alert = new Alert( Alert.AlertType.INFORMATION );
        alert.setTitle( "Informacje o programie" );
        alert.setHeaderText( "Statki" );
        alert.setContentText( "Autorzy: Konrad Tabiś, Tomasz Zapiórkowski" );
        alert.showAndWait();
    }
    public void zaloguj(ActionEvent event) throws IOException
    {
        User u = new User()
        {{
            this.setUsername( UserName.getText() );
            this.setPassword( passwordField.getText() );
        }};
        for ( User el : usersList ) {
            if ( ( el.getUsername().equals( u.getUsername() ) ) && ( el.getPassword().equals( u.getPassword() ) ) ) {
                Parent menu_page_parent = FXMLLoader.load(getClass().getResource("menu.fxml"));
                Scene menu_page_scene = new Scene(menu_page_parent);
                Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                app_stage.setScene(menu_page_scene);
                app_stage.show();
            }else
                labelError.setText( "nie wykryto użytkownika!" );
        }
    }
    public void rejestracja(ActionEvent event) throws IOException {
        Parent menu_page_parent= FXMLLoader.load(getClass().getResource("rejestracja.fxml"));
        Scene  menu_page_scene = new Scene(menu_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(menu_page_scene);
        app_stage.show();
    }
}
