/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package libraryGUIpkg;

import Stuff.*;
import librarypackage.SSN;

import java.net.URL;
import java.util.Date;
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
    @FXML
    private Label displayLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void saveEmployee_click(ActionEvent event) {
    /* Stub for how it should work
        // Enter info of the member:
        String name = nameText.getText();

        String address = addressText.getText();

        String dob = dobText.getText();

        String email = emailText.getText();

        String ssn = ssnText.getText();
        SSN SSN = new SSN(ssn);

        String memtype;

        while (true) {
            memtype = emptypeText.getText();
            if (memtype.equals("L") || memtype.equals("l") || memtype.equals("T")
                    || memtype.equals("t"))
                break;
            displayLabel.setText("Invalid input!");
        }

        displayLabel.setText("Creating a new employee...");

        // Try to create a new employee.
        try {
            Date DOB = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
            if (memtype.equals("L") || memtype.equals("l")) {
                Librarian librarian = new Librarian(name, address, DOB, email, SSN, library);
                library.addLibrarian(librarian);
            } else {
                Technician technician = new Technician(name, address, DOB, email, SSN, library);
                library.addTechnician(technician);
            }
        } catch (Exception e) {
            displayLabel.setText("Must enter an appropriate dob!");
            return;
        }
        displayLabel.setText("New Employee Successfully Saved to database.");
    */
    }
    
}
