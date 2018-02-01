/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author joaof
 */
public class ConversaoController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Pane imagemPane;
    
    @FXML
    private ChoiceBox images;
    
    private ObservableList<String> imagenames;
    
    private Image image;
    public ConversaoController() {
        this.imagenames = FXCollections.observableArrayList();
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void selectDiagram(ActionEvent event) throws FileNotFoundException {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        File imagem = fileChooser.showOpenDialog(new Stage());
        imagenames.add(imagem.getPath());
        images.setItems(imagenames);
        FileInputStream f = new FileInputStream(imagem);
        this.image = new Image(f);
        ImageView pic = new ImageView(image);
        pic.fitWidthProperty().bind(imagemPane.widthProperty());
        pic.fitHeightProperty().bind(imagemPane.heightProperty());
        imagemPane.getChildren().add(pic);
    }
    
    @FXML
    private void openDiagram(ActionEvent event) throws FileNotFoundException {
        String img=(String) images.getValue();
        File imagem=new File(img);
        FileInputStream f = new FileInputStream(imagem);
        this.image = new Image(f);
        ImageView pic = new ImageView(image);
        pic.fitWidthProperty().bind(imagemPane.widthProperty());
        pic.fitHeightProperty().bind(imagemPane.heightProperty());
        imagemPane.getChildren().add(pic);
    }
    
}
