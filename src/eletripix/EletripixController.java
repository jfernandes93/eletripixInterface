/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eletripix;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

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

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void openConversao(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("conversao.fxml"));
        Pane cmdPane = (Pane) fxmlLoader.load();
        opcao.getChildren().clear();
        opcao.getChildren().add(cmdPane);
    }
    
    
    
    @FXML
    private void openConfiguracao(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("configuracoes.fxml"));
        Pane cmdPane = (Pane) fxmlLoader.load();
        opcao.getChildren().clear();
        opcao.getChildren().add(cmdPane);
    }

    @FXML
    private void openSistema(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("conversao.fxml"));
        Pane cmdPane = (Pane) fxmlLoader.load();
        opcao.getChildren().clear();
        opcao.getChildren().add(cmdPane);
    }

}
