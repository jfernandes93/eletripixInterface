/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eletripix;

import java.io.File;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author joaof
 */
public class Eletripix extends Application {

    private void insertLicense(Stage principal) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/licenca.fxml"));
        Pane root1;
        root1 = fxmlLoader.load();
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(principal);
        stage.setTitle("Licença");
        stage.setScene(new Scene(root1));
        stage.show();
    }

    private boolean checkLicense() throws IOException {

        File license = new File("license.key");
        return license.exists();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/eletripix.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("Eletripix");
            stage.setScene(scene);
            stage.show();
        checkLicense();
        if(checkLicense()==false){

            insertLicense(stage);

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
