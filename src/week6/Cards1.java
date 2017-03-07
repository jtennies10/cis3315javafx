
package week6;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Joshua Tennies
 */
public class Cards1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane hbox1 = new HBox(-40);
        ScrollPane sp1 = new ScrollPane(hbox1);
        hbox1.setPadding(new Insets(50, 50, 50, 50));
        
        ImageView[] iv = new ImageView[5];
        for(int i = 0; i < 5; i++) {
            iv[i] = new ImageView(new Image("image/card/" + (i+1) + ".png"));
        }
        
        hbox1.getChildren().addAll(iv);
        
        Pane hbox2 = new HBox(-40);
        ScrollPane sp2 = new ScrollPane(hbox2);
        hbox2.setPadding(new Insets(50, 50, 50, 50));
        
        ImageView[] iv2 = new ImageView[5];
        for(int i = 0; i < 5; i++) {
            iv2[i] = new ImageView(new Image("image/card/" + (i+1) + ".png"));
        }
        
        hbox2.getChildren().addAll(iv2);
        
        BorderPane bp = new BorderPane();
        bp.setLeft(sp1);
        bp.setRight(sp2);
        
        Scene scene = new Scene(bp, 300, 250);

        
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
