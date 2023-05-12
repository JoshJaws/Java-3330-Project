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
public class ReturnItemFXController implements Initializable {

    @FXML
    private TextField itemNameText;
    @FXML
    private TextField sectionText;
    @FXML
    private TextField memNameText;
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
    private void ReturnItem_click(ActionEvent event) {
    /*Stub for how it should work.
        String memberName = memNameText.getText();
        Member borrower = library.getMember(memberName);

        // get the section
        String sectionString;
        while (true) {
            sectionString = sectionText.getText();
            if (sectionString.equals("A") || sectionString.equals("S") || sectionString.equals("L")
                    || sectionString.equals("N"))
                break;
            displayL.setText("Invalid input!");
        }
        Section section;
        if (sectionString.equals("A")) {
            section = Section.ARTS;
        } else if (sectionString.equals("S")) {
            section = Section.SCIENCES;
        } else if (sectionString.equals("L")) {
            section = Section.LAWS;
        } else {
            section = Section.NEWSPAPERS;
        }

        // get the name of the item:
        String name = memNameText.getText();

        LibraryCollection item = library.getItem(section, name);

        borrower.returnItem(item);
    */
    }
    
}
