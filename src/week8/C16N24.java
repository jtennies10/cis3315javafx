/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

/**
 *
 * @author Joshua Tennies
 */
public class C16N24 extends Application {
        MediaPlayer mp = new MediaPlayer(
                new Media("http://cs.armstrong.edu/liang/common/sample.mp4"));

    @Override
    public void start(Stage primaryStage) {
        MediaView mediaView = new MediaView(mp);
        
        Button btn = new Button(">");
        btn.setOnAction((ActionEvent event) -> {
            if(btn.getText().equals(">")) {
                mp.play();
                btn.setText("||");
            } else {
                mp.pause();
                btn.setText(">");
            }
        });
        
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(mediaView);
        borderPane.setBottom(btn);
        
        Scene scene = new Scene(borderPane, 650, 500);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
