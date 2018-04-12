package sample;


import javafx.application.Application;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;

import javafx.scene.layout.VBox;
import javafx.stage.Stage;
aa
/**
 * TODO Make it more structured this is so bad
 */
public class AllLightsON extends Application {


    @Override
    public void start(Stage primaryStage) {

wrrr
        primaryStage.setTitle("AllLightsON");


        //Struktur von fenster

        VBox unten = new VBox();
        unten.setAlignment(Pos.BOTTOM_CENTER);
        unten.getChildren().add(new Button("Reset"));

        TilePane root = new TilePane();

        root.setPrefColumns(5);
        root.setPrefRows(5);


        for (int i = 0; i < 25; i++) {
            Button lampe = new Button("");

            root.getChildren().add(lampe);


        }

        StackPane test = new StackPane();

        test.getChildren().addAll(unten,root);


        Scene scene = new Scene(test, 400, 400);


        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
