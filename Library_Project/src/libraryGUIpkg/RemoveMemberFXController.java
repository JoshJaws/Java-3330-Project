/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package libraryGUIpkg;

import Stuff.*;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author jjaws
 */
public class RemoveMemberFXController implements Initializable {

    @FXML
    private TextField nameText;
    @FXML
    private Label displayL;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void removeMember_click(ActionEvent event) {
    /* Stub for how it should work
        String name = nameText.getText();
        library.removeMember(name);
        displayL.setText("Member was removed");
    */
    }
    
}
