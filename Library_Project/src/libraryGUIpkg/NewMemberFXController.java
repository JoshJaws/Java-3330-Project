/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package libraryGUIpkg;

import Stuff.LibraryCollection;
import Stuff.Library;
import librarypackage.SSN;
import Stuff.Librarian;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author jjaws
 */
public class NewMemberFXController implements Initializable {
    // Need to be able to call this in the main and pass it to this window
    Stuff.Library library = new Stuff.Library();
    
    @FXML
    private TextField nameText;
    @FXML
    private TextField addressText;
    @FXML
    private TextField emailText;
    @FXML
    private TextField ssnText;
    @FXML
    private TextField memtypeText;
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
    private void saveMember_click(ActionEvent event) {

        String name = nameText.getText();

        String address = addressText.getText();

        String dob = dobText.getText();

        String email = emailText.getText();

        String ssn = ssnText.getText();
        SSN SSN = new SSN(ssn); // convert the String to SSN type.

        String memtype;

        while (true) {
            memtype = memtypeText.getText();
            if (memtype.equals("S") || memtype.equals("s") || memtype.equals("P")
                    || memtype.equals("p") || memtype.equals("E") || memtype.equals("e"))
                break;
            displayLabel.setText("Invalid input!");
        }

        System.out.print("Creating a new member...");
        try {
            Date DOB = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
            if (memtype.equals("S") || memtype.equals("s")) {
                library.ondutyLibrarian.makeStudent(name, address, DOB, email, SSN, library);
            } else if (memtype.equals("P") || memtype.equals("p"))
                library.ondutyLibrarian.makeProfessor(name, address, DOB, email, SSN, library);
            else
                library.ondutyLibrarian.makeMember(name, address, DOB, email, SSN, library);
        } catch (Exception e) {
            displayLabel.setText("must enter an appropriate dob!"); // Happen when the dob format is wrong.
            return;
        }
        // System.out.println("The membership ID is: " + library.getMember(name).getID());
        displayLabel.setText("New Member Successfully Saved to database.");
        // System.out.println("");
    }
    
}
