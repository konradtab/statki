package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by Dell on 05.04.2017.
 */
public class ControllerRejestracja {
    @FXML
    private TextField UserNameRej;
    @FXML
    private PasswordField passwordFieldRej;

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
    public void rejestracja(ActionEvent event) throws IOException {
        // trzeba dodać sprawdzanie czy użytkownik istnieje

        User u = new User()
        {{
            this.setUsername( UserNameRej.getText() );
            this.setPassword( passwordFieldRej.getText() );
        }};

            Parent menu_page_parent = FXMLLoader.load(getClass().getResource("menu.fxml"));
            Scene menu_page_scene = new Scene(menu_page_parent);
            Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            app_stage.setScene(menu_page_scene);
            app_stage.show();
        }

}
