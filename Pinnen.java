import javafx.application.*;
import javafx.event.*;
import javafx.scene.layout.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.scene.text.*;
import javafx.scene.effect.*;
import javafx.scene.image.*;

public class Snelpin extends Application
{
	public static void main(String[] args)
	{
		launch(args);
	}

    public void start(Stage Stage)
    {    	
    	BorderPane border = new BorderPane();
    	border.setTop(addHBoxt());
        border.setLeft(addVBoxl());
        border.setCenter(addStackPane());
        border.setRight(addVBoxr());
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
    
    public StackPane addStackPane()
    {
    	StackPane stack = new StackPane();
    	    	
    	ImageView Logo = new ImageView("file:Geek Inc icon.png");
    	Logo.setPreserveRatio(true);
    	stack.getChildren().add(Logo);
    	
    	return stack;
    }
    
    public VBox addVBoxl()
    {
    	VBox vbox = new VBox();
    	vbox.setSpacing(8);

    	Button options[] = new Button[]
    	{
    		new Button("€10"),
    		new Button("€20"),
    		new Button("€30"),
    		new Button("€50"),
    		new Button("€75")
    	};
    	
    	/*options[1].setOnAction(new EventHandler<ActionEvent>()
    		{
    			@Override
    			public void handle(ActionEvent event)
    			{
    				try
    				{
    				Application.launch(Saldo.class);
    				}
    				
    				catch(IllegalStateException e)
    				{
    				}
    			}
    		});*/

    	for (int i=0; i<5; i++)
    	{
    		vbox.getChildren().add(options[i]);
    	}

    	return vbox;
    }
    
    public VBox addVBoxr()
    {
    	VBox vbox = new VBox();
    	vbox.setSpacing(8);

    	Button options[] = new Button[]
    	{
    		new Button("€90"),
    		new Button("€100"),
    		new Button("€250"),
    		new Button("Ander bedrag")
    	};
    	
    	/*options[1].setOnAction(new EventHandler<ActionEvent>()
    		{
    			@Override
    			public void handle(ActionEvent event)
    			{
    				try
    				{
    				Application.launch(Saldo.class);
    				}
    				
    				catch(IllegalStateException e)
    				{
    				}
    			}
    		});*/

    	for (int i=0; i<4; i++)
    	{
    		vbox.getChildren().add(options[i]);
    	}

    	return vbox;
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