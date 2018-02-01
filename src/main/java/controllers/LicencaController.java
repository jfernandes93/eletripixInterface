/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author joaof
 */
public class LicencaController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    TextField client;
    
    @FXML
    TextField email;
    
    @FXML
    TextField codLicense;


    @FXML
    Label erro;

    @FXML
    Button button;
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    public void exitProgram(ActionEvent event){
        Platform.exit();
        System.exit(0);
    }
    private void activateLicense(String client, String email, String code) throws UnirestException {
        HttpResponse<JsonNode> jsonResponse;
        jsonResponse = Unirest.post("https://api-eletripix-licenses.herokuapp.com/activateLicense")
                .header("accept", "application/json")
                .field("client", client)
                .field("email",email)
                .field("codLicense",code)
                .asJson();
        int status=jsonResponse.getStatus();
        String mensagem= (String)jsonResponse.getBody().getObject().get("status");
        if(status==404){
            erro.setTextFill(Color.RED);
            erro.setText(mensagem);
        }else{
            erro.setTextFill(Color.GREEN);
            erro.setText(mensagem);
            Stage stage = (Stage) button.getScene().getWindow();
            stage.close();
        }


    }
    public void validateLicense(ActionEvent event) throws UnirestException {
        String cliente,email,cod;
        cliente=this.client.getText();
        email=this.email.getText();
        cod=this.codLicense.getText();
        activateLicense(cliente,email,cod);
    }
}
