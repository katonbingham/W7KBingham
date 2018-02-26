/** Program: Color, Font, Checkerboard
 * Summary:From textbook (Liang): Chapter 14, exercise 3, 4, and 6.
 * Author: Katon Bingham
 * Date: 2/25/18
 *
 * All following work is my own. 
 * -Katon
 **/
package programmingexercise8;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class ColorFont extends Application{
    @Override
    public void start(Stage primaryStage){
        BorderPane pane = new BorderPane();
        
        pane.setTop(getHBox());
        pane.setLeft(getVBox());

        Scene scene = new Scene(pane);
        primaryStage.setTitle(("Colored Text"));
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private HBox getHBox(){
        HBox hBox = new HBox(15);
        hBox.setPadding(new Insets(15,15,15,15));
        hBox.getChildren().add(new Label("ColorFont"));

        Label[] hText = {
            new Label("Java1"),
            new Label("Java2"), 
            new Label("Java3"),
            new Label("Java4"),
            new Label("Java5")}; 
        
        for (Label horText: hText){
            HBox.setMargin(horText, new Insets(0,0,0,15));
            hBox.getChildren().add(horText);
        }
        return hBox;
    }
    
    private VBox getVBox(){
        VBox vBox = new VBox(10); 
        vBox.setPadding(new Insets(15,5,5,5));
//        vBox.getChildren().add(new Label("ColorFont"));
        
        Label[] vText = {
            new Label("Java1"),
            new Label("Java2"), 
            new Label("Java3"),
            new Label("Java4"),
            new Label("Java5")}; 
        
        for (Label vertText: vText){
            VBox.setMargin(vertText, new Insets(0,0,0,15));
            vBox.getChildren().add(vertText);
        }
        
        return vBox;
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
