package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by Dell on 05.04.2017.
 */
public class ControllerMenu {
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
    public void nowa_gra(ActionEvent event) throws IOException {
        Parent menu_page_parent = FXMLLoader.load(getClass().getResource("plansza.fxml"));
        Scene menu_page_scene = new Scene(menu_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(menu_page_scene);
        app_stage.show();
    }
    public void statystyki(ActionEvent event) throws IOException {
        Parent menu_page_parent = FXMLLoader.load(getClass().getResource("staty.fxml"));
        Scene menu_page_scene = new Scene(menu_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(menu_page_scene);
        app_stage.show();

    }
    public void wyloguj(ActionEvent event) throws IOException {
        Parent menu_page_parent = FXMLLoader.load(getClass().getResource("log.fxml"));
        Scene menu_page_scene = new Scene(menu_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(menu_page_scene);
        app_stage.show();
    }



}
