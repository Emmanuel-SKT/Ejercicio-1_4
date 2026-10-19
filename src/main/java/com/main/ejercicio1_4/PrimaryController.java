package com.main.ejercicio1_4;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {

    @FXML
    private TextField txtNumero;
    @FXML
    private Button btnCalcular;
    @FXML
    private Button btnLimpiar;
    @FXML
    private TextArea txtTabla;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    @FXML
    private void btnCalcularOnAction(ActionEvent event) {
        int n = Integer.parseInt(txtNumero.getText());
        String resultado = "";
        
        int i = 1;
        while (i <= 10) {
            int mult = n * i;
            resultado = resultado + n + " x " + i + " = " + mult + "\n";
            i = i + 1;
        }
        
        txtTabla.setText(resultado);
    }

    @FXML
    private void btnLimpiarOnAction(ActionEvent event) {
        txtNumero.setText("");
        txtTabla.setText("");
    }
}
