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
public class RemoveItemFXController implements Initializable {

    @FXML
    private TextField sectionText;
    @FXML
    private TextField titleText;
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
    private void removeItem_click(ActionEvent event) {
    /* Stub for how it should work
        // 2. Get title:
        String title = titleText.getText();

        // 2. Get section:
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

        // 3. get the item according to section
        LibraryCollection item = library.getItem(section, title);

        // 4. on duty technician delete the item from library
        library.ondutyLibrarian.removeItemFromCollection(item);
    */
    }
    
}
