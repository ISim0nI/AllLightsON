package sample;


import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.layout.TilePane;

import javafx.stage.Stage;


public class AllLightsON extends Application {


    @Override
    public void start(Stage primaryStage) {


        primaryStage.setTitle("AllLightsON");


        //Struktur von fenster
        TilePane root = new TilePane();

        root.setPrefColumns(5);
        root.setPrefRows(5);


        for (int i = 0; i < 25; i++) {
            Button lampe = new Button("");
            root.getChildren().add(lampe);

        }


        Scene scene = new Scene(root, 400, 400);


        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
