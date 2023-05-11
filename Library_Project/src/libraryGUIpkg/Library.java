
package library_pkg;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author jjaws
 */
public class Library extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Opens the main menu
        Parent root = FXMLLoader.load(getClass().getResource("LibraryMenu.fxml"));//fxmlLoader.load();
        Scene scene = new Scene(root);
        stage.setTitle("Main Menu");
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
