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
public class NewCollectionFXController implements Initializable {

    @FXML
    private TextField collectionText;
    @FXML
    private TextField titleText;
    @FXML
    private TextField ISBNText;
    @FXML
    private TextField sectionText;
    @FXML
    private TextField priceText;
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
    private void saveItem_click(ActionEvent event) {
    /* Stub for how it should work.
        // 1. Get collection:
        String collection;
        while (true) {
            collection = collectionText.getText();
            if (collection.equals("B") || collection.equals("D") || collection.equals("J") || collection.equals("N"))
                break;
            displayLabel.setText("Invalid input!");
        }

        // 2. Get title:
        String title = titleText.getText();

        // 3. Get ISBN
        String iSBN_String = ISBNText.getText();
        try {
            int ISBN = Integer.parseInt(iSBN_String);
        } catch (NumberFormatException e) {
            displayLabel.setText("Invalid input");
        }
        int ISBN = Integer.parseInt(iSBN_String);

        // 4. Get section:
        String sectionString;
        while (true) {
            sectionString = sectionText.getText();
            if (sectionString.equals("A") || sectionString.equals("S") || sectionString.equals("L")
                    || sectionString.equals("N"))
                break;
            displayLabel.setText("Invalid input!");
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

        // 5. get price
        String priceString = priceText.getText();
        try {
            float price = Float.parseFloat(priceString);
        } catch (NumberFormatException e) {
            displayLabel.setText("Invalid input");
        }
        float price = Float.parseFloat(priceString);

        // Construct the item according to its collection and add it to the library
        // (corresponding hash table)
        if (collection.equals("B")) {
            Book new_book = new Book(title, ISBN, section, price);
            library.ondutyTechnician.addItemToLibrary(new_book);
        } else if (collection.equals("D")) {
            DVD new_DVD = new DVD(title, ISBN, section, price);
            library.ondutyTechnician.addItemToLibrary(new_DVD);
        } else if (collection.equals("J")) {
            Journal new_jJournal = new Journal(title, ISBN, section, price);
            library.ondutyTechnician.addItemToLibrary(new_jJournal);
        } else {
            Newspaper new_nNewspaper = new Newspaper(title, ISBN, section, price);
            library.ondutyTechnician.addItemToLibrary(new_nNewspaper);
        }
    */
        
    }
    
}
