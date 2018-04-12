package sample;

import com.sun.deploy.xml.XMLable;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Observable;

public class AllLightsON extends Application {


    @Override
    public void start(Stage primaryStage) {



        primaryStage.setTitle("AllLightsON");


        //Struktur von fenster
        TilePane root = new TilePane();

        root.setPrefColumns(5);
        root.setPrefRows(5);




        for (int i=0; i<25;i++){
            Button lampe = new Button("");
            root.getChildren().add(lampe);

        }


        Scene scene = new Scene(root, 400, 400);


        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
