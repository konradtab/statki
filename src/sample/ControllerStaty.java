package sample;

import javafx.application.Platform;
import javafx.scene.control.Alert;

/**
 * Created by Dell on 05.04.2017.
 */
public class ControllerStaty {
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
}
