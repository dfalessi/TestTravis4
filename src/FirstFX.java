import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
//import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
 
public class FirstFX extends Application {
    
//	Label label1;
	
	public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception{
    	stage.setTitle("My First Stage Title");
    	label1 = new Label("My first Label! Wow! This is so great!");		
    	VBox root = new VBox();
    	root.getChildren().add(label1);
    	Scene scene = new Scene(root);
    	stage.setScene(scene); 	
    	stage.show();
    }
}