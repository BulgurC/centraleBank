import javafx.application.*;
import javafx.event.*;
import javafx.scene.layout.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.scene.text.*;
import javafx.scene.effect.*;
import javafx.scene.image.*;

public class Saldo extends Application
{
	public static void main(String[] args)
	{
		launch(args);
	}

    public void start(Stage Stage)
    {
    	BorderPane border = new BorderPane();
    	border.setTop(addHBoxt());
        border.setCenter(addGridPane());
        border.setBottom(addHBoxb());
        
    	Scene scene = new Scene(border, 300, 250);

    	Stage.setFullScreen(true);
        Stage.setTitle("Geek Incorporated");
        Stage.setScene(scene);
        Stage.show();
    }

    public HBox addHBoxt()
    {
    	HBox hbox = new HBox();
    	ImageView Logo = new ImageView("file:Geek Inc logo.png");
    	Logo.setFitWidth(1536);
    	Logo.setPreserveRatio(true);
    	hbox.getChildren().addAll(Logo);
    	
    	return hbox;
    }
    
    public GridPane addGridPane()
    {
    	GridPane grid = new GridPane();
    	grid.setHgap(10);
    	grid.setVgap(10);

    	Text scenetitle = new Text("Bedrag invoeren");
    	scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
    	grid.add(scenetitle, 0, 0, 2, 1);

    	Label userName = new Label("€");
    	grid.add(userName, 0, 1);

    	TextField userTextField = new TextField();
    	grid.add(userTextField, 1, 1);
    	
    	return grid;
    }
    
    public HBox addHBoxb()
    {
    	HBox hbox = new HBox();
    	hbox.setSpacing(8);
    	
    	Button options[] = new Button[]
    	{
    		new Button("Terug naar beginscherm"),
    		new Button("Afbreken")
    	};
    	
    	for (int i=0; i<2; i++)
    	{
    		hbox.getChildren().add(options[i]);
    	}
    	
    	return hbox;
    }
}