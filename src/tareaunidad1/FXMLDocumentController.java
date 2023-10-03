/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaunidad1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Miriam
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label salida;
    @FXML
    private TextField txtNombre;

    @FXML
    private void devolverSaludo(ActionEvent event) {
        String nombre = txtNombre.getText();
        salida.setText("Hola " + nombre);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
