/** Program: Random Cards
 * Summary:From textbook (Liang): Chapter 14, exercise 3, 4, and 6.
 * Author: Katon Bingham
 * Date: 2/25/18
 *
 * All following work is my own. 
 * -Katon
 **/

package programmingexercise8;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RandomCards extends Application{
    @Override
    public void start(Stage primaryStage){
        ArrayList<String> cards = new ArrayList<>();

        for(int i = 0; i < 52; i++){
            cards.add(String.valueOf(i + 1));
        }
        
        java.util.Collections.shuffle(cards);

        ImageView iView1 = new ImageView(new Image(
                "programmingexercise8/card/" + cards.get(0) + ".png"));
        ImageView iView2 = new ImageView(new Image(
                "programmingexercise8/card/" + cards.get(1) + ".png"));
        ImageView iView3 = new ImageView(new Image(
                "programmingexercise8/card/" + cards.get(2) + ".png"));
            
            
        HBox hBox = new HBox();
        
        hBox.getChildren().add(iView1);
        hBox.getChildren().add(iView2);
        hBox.getChildren().add(iView3);
        
        Scene scene = new Scene(hBox);
        
        primaryStage.setTitle("Random Cards");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
        
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
