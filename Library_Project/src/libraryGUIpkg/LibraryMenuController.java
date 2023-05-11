/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package library_pkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author jjaws
 */
public class LibraryMenuController implements Initializable {

    @FXML
    private Button newMember_btn;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void newMember_click(ActionEvent event) throws IOException {
        //theLabel.setText("Works");
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("NewMemberFX.fxml"));
            Stage stage = new Stage();
            stage.setTitle("New Member Form");
            stage.setScene(new Scene(root));
            // Used to ensure the main menu cannot be clicked once new menu is opened.
            stage.initModality(Modality.WINDOW_MODAL);
            // Do not believe it matters what kind of button you use, as long as it is on the main menu.
            stage.initOwner(newMember_btn.getScene().getWindow());
            stage.show();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void newCollection_click(ActionEvent event) {
    }

    @FXML
    private void removeMember_click(ActionEvent event) {
    }

    @FXML
    private void borrowItem_click(ActionEvent event) {
    }

    @FXML
    private void removeItem_click(ActionEvent event) {
    }

    @FXML
    private void newEmployee_click(ActionEvent event) {
    }

    @FXML
    private void returnItem_click(ActionEvent event) {
    }

    @FXML
    private void checkOverdues_click(ActionEvent event) {
    }

    @FXML
    private void editInformation_click(ActionEvent event) {
    }

    @FXML
    private void quit_click(ActionEvent event) {
    }
    
}
