package seg.java;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
    private seg.java.controllers.AirportSelectionController airportSelectionController;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/seg/resources/views/airportSelection.fxml"));
        primaryStage.setTitle("Select Airport");
        primaryStage.setScene(new Scene(root, 385, 151));  // v: width v1: height
        primaryStage.show();
    }
}
