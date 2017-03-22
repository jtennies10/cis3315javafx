/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Joshua Tennies
 */
public class C16N01 extends Application {
    private double paneWidth = 500;
    private double paneHeight = 150;
    @Override
    public void start(Stage primaryStage) {
        Text text = new Text(20, 40, "Programming is fun");
        text.setFont(new Font("Times", 20));
        Pane paneForText = new Pane();
        paneForText.getChildren().add(text);
        paneForText.setStyle("-fx-border-color: gray");
        
        RadioButton rbRed = new RadioButton("Red");
        RadioButton rbYellow = new RadioButton("Yellow");
        RadioButton rbBlack = new RadioButton("Black");
        RadioButton rbOrange = new RadioButton("Orange");
        RadioButton rbGreen = new RadioButton("Green");
        
        ToggleGroup group = new ToggleGroup();
        rbRed.setToggleGroup(group);
        rbYellow.setToggleGroup(group);
        rbBlack.setToggleGroup(group);
        rbOrange.setToggleGroup(group);
        rbGreen.setToggleGroup(group);
        
        HBox hbox = new HBox(5);
        hbox.getChildren().addAll(rbRed, rbYellow, rbBlack, rbOrange, rbGreen);
        hbox.setAlignment(Pos.CENTER);
        hbox.setStyle("-fx-border-color:red;-fxpadding:10 0 10 0");
        
        Button btLeft = new Button("<=");
        Button btRight = new Button("=>");
        HBox hBoxForButtons = new HBox(5);
        hBoxForButtons.getChildren().addAll(btLeft, btRight);
        
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(hbox);
        borderPane.setCenter(paneForText);
        borderPane.setBottom(hBoxForButtons);
        
        Scene scene = new Scene(borderPane, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        rbRed.setOnAction(e -> text.setStroke(Color.RED));
        rbYellow.setOnAction(e -> text.setStroke(Color.YELLOW));
        rbBlack.setOnAction(e -> text.setStroke(Color.BLACK));
        rbOrange.setOnAction(e -> text.setStroke(Color.ORANGE));
        rbGreen.setOnAction(e -> text.setStroke(Color.GREEN));
        
        btLeft.setOnAction(e -> text.setX(text.getX() - 1));
        btRight.setOnAction(e -> text.setX(text.getX() + 1));
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
