
package week7;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author Joshua Tennies
 */
public class C15N02 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        VBox vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);
        Rectangle r1 = new Rectangle(25,10,60,30);
        r1.setFill(Color.WHITE);
        r1.setStroke(Color.BLACK);
        vBox.getChildren().add(r1);
        
        int count = 0;
        
        Button btRotate = new Button("Rotate");
        vBox.getChildren().add(btRotate);
        
        btRotate.setOnAction(e ->  {
                r1.setRotate(r1.getRotate()+15);
        });
        
        
        
        
        
        Scene scene = new Scene(vBox, 300, 250);
        
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
