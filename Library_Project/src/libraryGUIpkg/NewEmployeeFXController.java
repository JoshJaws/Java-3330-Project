/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package libraryGUIpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author jjaws
 */
public class NewEmployeeFXController implements Initializable {

    @FXML
    private TextField nameText;
    @FXML
    private TextField addressText;
    @FXML
    private TextField emailText;
    @FXML
    private TextField ssnText;
    @FXML
    private TextField emptypeText;
    @FXML
    private TextField dobText;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void saveEmployee_click(ActionEvent event) {
    }
    
}
