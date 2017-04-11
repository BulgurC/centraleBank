import javafx.application.*;
import javafx.event.*;
import javafx.scene.layout.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.scene.input.*;
import javafx.geometry.*;
import javafx.scene.text.*;
import javafx.scene.effect.*;
import javafx.scene.image.*;
import javafx.beans.value.*;
import javafx.beans.*;
import javafx.beans.property.adapter.*;
import javafx.beans.property.*;
import javafx.beans.binding.*;

public class Melding
{
	public static void display(String title, String message)
	{
		Stage primaryStage = new Stage();
		
		primaryStage.initModality(Modality.APPLICATION_MODAL);
		primaryStage.setTitle(title);
		primaryStage.setMinWidth(250);
		
		Label la = new Label();
		la.setText(message);
		Button close =new Button("Sluiten  (A)");
		close.setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			public void handle(KeyEvent event)
    			{
    				if (event.getCode() == KeyCode.A)
    				{
    					primaryStage.close();
    				}
    			}
    		});
    	VBox vbox = new VBox(10);
    	vbox.getChildren().addAll(la, close);
    	//vbox.setAlignments(Pos.CENTER);
    	
    	Scene scene = new Scene(vbox);
    	primaryStage.setScene(scene);
    	primaryStage.showAndWait();
	}
}