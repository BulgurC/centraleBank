import javafx.application.*;
import javafx.event.*;
import javafx.scene.layout.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.scene.text.*;
import javafx.scene.effect.*;
import javafx.scene.image.*;

public class Home extends Application
{
	public static void main(String[] args)
	{
		launch(args);
	}
	
	@Override
    public void start(Stage primaryStage)
    {    	
        BorderPane border = new BorderPane();
        border.setTop(addHBox());
        border.setLeft(addVBox());
        border.setCenter(addStackPane());
        border.setBottom(addHBoxb());

        Scene scene = new Scene(border, 300, 250);

        primaryStage.setFullScreen(true);
        primaryStage.setTitle("Geek Incorporated");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public HBox addHBox()
    {
    	HBox hbox = new HBox();
    	ImageView L = new ImageView("file:Geek Inc logo.png");
    	L.setFitWidth(1536);
    	L.setPreserveRatio(true);
    	hbox.getChildren().addAll(L);
    	
    	return hbox;
    }
    
    public VBox addVBox()
    {
    	VBox vbox = new VBox();
    	vbox.setSpacing(8);
    	
    	Button options[] = new Button[]
    	{
    		new Button("Geld opnemen"),
    		new Button("Saldo")
    	};
    	
    	options[1].setOnAction(new EventHandler<ActionEvent>()
    		{
    			@Override
    			public void handle(ActionEvent event)
    			{
    				try
    				{
    					//javafx.application.Application s = new Saldo();		//1
    					//s.start(Stage.show(true));							//1
    					Application.launch(Saldo.class);	//2
    				}
    				
    				/*catch(RuntimeException e)				//1
    				{
    				}*/
    				
    				catch(IllegalStateException e)			//2
    				{
    					System.out.print("*SIGH*");
    				}
    			}
    		});
    	
    	for (int i=0; i<2; i++)
    	{
    		vbox.getChildren().add(options[i]);
    	}
    	
    	return vbox;
    }
    
    public StackPane addStackPane()
    {
    	StackPane stack = new StackPane();
    	    	
    	ImageView Logo = new ImageView("file:Geek Inc icon.png");
    	Logo.setPreserveRatio(true);
    	stack.getChildren().add(Logo);
    	
    	return stack;
    }
    
    public HBox addHBoxb()
    {
    	HBox hbox = new HBox();
    	hbox.setSpacing(8);
    	
    	Button options[] = new Button[]
    	{
    		new Button("Afbreken")
    	};
    	
    	for (int i=0; i<1; i++)
    	{
    		hbox.getChildren().add(options[i]);
    	}
    	
    	return hbox;
    }
}