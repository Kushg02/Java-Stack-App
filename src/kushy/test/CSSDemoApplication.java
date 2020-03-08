package kushy.test;

import javafx.fxml.FXMLLoader; //Our FXML class

import javafx.scene.Scene; //Our Scene class

import javafx.scene.Parent; //Our Scene's parent class

import javafx.stage.Stage; //Our Stage Class

import javafx.application.Application; //So you dont have to call Application


public class CSSDemoApplication extends Application {

    @Override //Overides the default JavaFX init() method

    //Implements the abstract method "Start"
    //start() methot is the starting entry point of the JavaFX app. 
    public void start(Stage primaryStage) throws Exception {  //Instantiates the primary stage with the function

        Parent root = FXMLLoader.load(getClass().getResource("css_demo.fxml")); //Essentially importing our FXML

        Scene scene = new Scene(root, 800, 450); //Setting up our window "scene" on our stage

        scene.getStylesheets().add(getClass().getResource("demo.css").toExternalForm()); //Importing CSS

        primaryStage.setScene(scene); //Setting the stage's to our current working scene

        primaryStage.show(); // Reveal the stage and launch the UI
    }

    public static void main(String[] args) {
        launch(args);
    }
}
