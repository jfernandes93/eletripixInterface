/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author joaof
 */
public class EletripixController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private AnchorPane opcao;


    public void initialize(URL url, ResourceBundle rb) {
        

    }

    public EletripixController() {

    }

    

    @FXML
    private void openConversao(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/conversao.fxml"));
        Pane cmdPane = (Pane) fxmlLoader.load();
        opcao.getChildren().clear();
        opcao.getChildren().add(cmdPane);
    }

    @FXML
    private void openConfiguracao(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/configuracoes.fxml"));
        Pane cmdPane = (Pane) fxmlLoader.load();
        opcao.getChildren().clear();
        opcao.getChildren().add(cmdPane);
    }

    @FXML
    private void openSistema(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/conversao.fxml"));
        Pane cmdPane = (Pane) fxmlLoader.load();
        opcao.getChildren().clear();
        opcao.getChildren().add(cmdPane);
    }

}
