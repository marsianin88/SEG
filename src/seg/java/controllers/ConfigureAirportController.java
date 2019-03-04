package seg.java.controllers;

import seg.java.XMLReaderDOM;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ConfigureAirportController {
    /** FXML variables */
    public Button backToAirportSelection;
    public Button addAirportButton;
    public TextField airportNameTextbox;

    private XMLReaderDOM xmlReaderDOM;

    /** GOES BACK TO AirportSelectionController */
    public void backToAirportSelection(ActionEvent actionEvent) {
        try {
            Stage stage = (Stage) addAirportButton.getScene().getWindow();
            stage.close();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/seg/resources/views/airportSelection.fxml"));
            Parent root1 = fxmlLoader.load();
            stage = new Stage();
            stage.setTitle("Airport Selection");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, "Uh oh, something went wrong :(").showAndWait();
        }
    }

    /** ADDS Airport TO ARRAYLIST & OPENS EITHER dashboard.fxml ***** OR should loop for amount of runways */
    public void addAirport(ActionEvent actionEvent) {
        if (airportNameTextbox.getText().isEmpty()) {
            new Alert(Alert.AlertType.ERROR, "Please ensure all fields are filled!").showAndWait();
        } else {
            try {
                Stage stage = (Stage) addAirportButton.getScene().getWindow();
                stage.close();
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/seg/resources/views/configureRunway.fxml"));
                Parent root1 = fxmlLoader.load();
                stage = new Stage();
                stage.setTitle("Add Runway");
                stage.setScene(new Scene(root1));
                stage.show();
            } catch (Exception e) {
                new Alert(Alert.AlertType.ERROR, "Uh oh, something went wrong :(").showAndWait();
            }
        }
    }

    public void setAirportArrayList (XMLReaderDOM xmlReaderDOM) {
        this.xmlReaderDOM = xmlReaderDOM;
    }

    /** **** TO BE DONE **** IMPORTS AIRPORTS FROM airportsXML.xml AND ADDS THEM TO ARRAY LIST */
    public void importAirportsFromXML(ActionEvent actionEvent) {
    }
}
