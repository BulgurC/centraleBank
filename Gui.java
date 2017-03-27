import javafx.application.*;
import javafx.event.*;
import javafx.scene.layout.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.scene.text.*;
import javafx.scene.effect.*;
import javafx.scene.image.*;

public class Gui extends Application
{
	Stage window;
	Scene Welkom, Cardcode, Home, Snelpin, Saldo, Pinnen, Ander, Biljet, Bon, CardcodeEN, HomeEN, SnelpinEN, SaldoEN, PinnenEN, AnderEN, BiljetEN, BonEN;
	
	public static void main(String[] args)
	{
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage)
	{
		window = primaryStage;
		
		BorderPane Welkom1 = new BorderPane();
        Welkom1.setTop(addHBoxTop());
        Welkom1.setCenter(addStackPane());
        Welkom1.setBottom(addHBoxWelkom());
        
        Welkom = new Scene(Welkom1, 300, 250);
        
        BorderPane Cardcode1 = new BorderPane();
    	Cardcode1.setTop(addHBoxTop());
    	Cardcode1.setCenter(addGridPaneCardcode());
    	Cardcode1.setBottom(addHBoxCardcode());
    	
    	Cardcode = new Scene(Cardcode1, 300, 250);
    	
    	BorderPane Home1 = new BorderPane();
        Home1.setTop(addHBoxTop());
        Home1.setLeft(addVBoxHome());
        Home1.setCenter(addStackPane());
        Home1.setBottom(addHBoxCardcode());

        Home = new Scene(Home1, 300, 250);
        
        BorderPane Snelpin1 = new BorderPane();
    	Snelpin1.setTop(addHBoxTop());
        Snelpin1.setLeft(addVBoxSnelpinl());
        Snelpin1.setCenter(addStackPane());
        Snelpin1.setRight(addVBoxSnelpinr());
        Snelpin1.setBottom(addHBoxBottom());
        
    	Snelpin = new Scene(Snelpin1, 300, 250);
    	
    	BorderPane Saldo1 = new BorderPane();
    	Saldo1.setTop(addHBoxTop());
        Saldo1.setLeft(addVBoxSaldo());
        Saldo1.setCenter(addGridPaneSaldo());
        Saldo1.setBottom(addHBoxBottom());
        
    	Saldo = new Scene(Saldo1, 300, 250);
    	
    	BorderPane Pinnen1 = new BorderPane();
    	Pinnen1.setTop(addHBoxTop());
        Pinnen1.setLeft(addVBoxPinnenl());
        Pinnen1.setCenter(addStackPane());
        Pinnen1.setRight(addVBoxPinnenr());
        Pinnen1.setBottom(addHBoxBottom());
        
    	Pinnen = new Scene(Pinnen1, 300, 250);
    	
    	BorderPane Ander1 = new BorderPane();
    	Ander1.setTop(addHBoxTop());
        Ander1.setCenter(addGridPaneAnder());
        Ander1.setBottom(addHBoxBottom());
        
    	Ander = new Scene(Ander1, 300, 250);
    	
    	BorderPane Biljet1 = new BorderPane();
    	Biljet1.setTop(addHBoxTop());
        Biljet1.setLeft(addVBoxBiljet());
        Biljet1.setCenter(addStackPane());
        Biljet1.setBottom(addHBoxBottom());
        
    	Biljet = new Scene(Biljet1, 300, 250);
    	
    	BorderPane Bon1 = new BorderPane();
    	Bon1.setTop(addHBoxTop());
        Bon1.setCenter(addGridPaneBon());
        Bon1.setBottom(addHBoxBottom());
        
    	Bon = new Scene(Bon1, 300, 250);
    	
    	BorderPane CardcodeEN1 = new BorderPane();
    	CardcodeEN1.setTop(addHBoxTop());
    	CardcodeEN1.setCenter(addGridPaneCardcodeEN());
    	CardcodeEN1.setBottom(addHBoxCardcodeEN());
    	
    	CardcodeEN = new Scene(CardcodeEN1, 300, 250);
    	
    	BorderPane HomeEN1 = new BorderPane();
        HomeEN1.setTop(addHBoxTop());
        HomeEN1.setLeft(addVBoxHomeEN());
        HomeEN1.setCenter(addStackPane());
        HomeEN1.setBottom(addHBoxCardcodeEN());

        HomeEN = new Scene(HomeEN1, 300, 250);
        
        BorderPane SnelpinEN1 = new BorderPane();
    	SnelpinEN1.setTop(addHBoxTop());
        SnelpinEN1.setLeft(addVBoxSnelpinENl());
        SnelpinEN1.setCenter(addStackPane());
        SnelpinEN1.setRight(addVBoxSnelpinENr());
        SnelpinEN1.setBottom(addHBoxDown());
        
    	SnelpinEN = new Scene(SnelpinEN1, 300, 250);
    	
    	BorderPane SaldoEN1 = new BorderPane();
    	SaldoEN1.setTop(addHBoxTop());
        SaldoEN1.setLeft(addVBoxSaldoEN());
        SaldoEN1.setCenter(addGridPaneSaldoEN());
        SaldoEN1.setBottom(addHBoxDown());
        
    	SaldoEN = new Scene(SaldoEN1, 300, 250);
    	
    	BorderPane PinnenEN1 = new BorderPane();
    	PinnenEN1.setTop(addHBoxTop());
        PinnenEN1.setLeft(addVBoxPinnenENl());
        PinnenEN1.setCenter(addStackPane());
        PinnenEN1.setRight(addVBoxPinnenENr());
        PinnenEN1.setBottom(addHBoxDown());
        
    	PinnenEN = new Scene(PinnenEN1, 300, 250);
    	
    	BorderPane AnderEN1 = new BorderPane();
    	AnderEN1.setTop(addHBoxTop());
        AnderEN1.setCenter(addGridPaneAnderEN());
        AnderEN1.setBottom(addHBoxDown());
        
    	AnderEN = new Scene(AnderEN1, 300, 250);
    	
    	BorderPane BiljetEN1 = new BorderPane();
    	BiljetEN1.setTop(addHBoxTop());
        BiljetEN1.setLeft(addVBoxBiljetEN());
        BiljetEN1.setCenter(addStackPane());
        BiljetEN1.setBottom(addHBoxDown());
        
    	BiljetEN = new Scene(BiljetEN1, 300, 250);
    	
    	BorderPane BonEN1 = new BorderPane();
    	BonEN1.setTop(addHBoxTop());
        BonEN1.setCenter(addGridPaneBonEN());
        BonEN1.setBottom(addHBoxDown());
        
    	BonEN = new Scene(BonEN1, 300, 250);
    	
    	window.setFullScreen(true);
        window.setTitle("Geek Incorporated");
        window.setScene(Welkom);
        window.show();
	}
	
	public HBox addHBoxTop()
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
        
    public HBox addHBoxWelkom()
    {
    	HBox hbox = new HBox();
    	hbox.setSpacing(8);
    	
    	Button options[] = new Button[]
    	{
    		new Button("NL"),
    		new Button("EN")
    	};
    	
    	options[0].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(Cardcode);
    				window.setFullScreen(true);
    			}
    		});
    	
    	options[1].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(CardcodeEN);
    				window.setFullScreen(true);
    			}
    		});
    	
    	for (int i=0; i<2; i++)
    	{
    		hbox.getChildren().add(options[i]);
    	}
    	
    	return hbox;
    }
    
    public GridPane addGridPaneCardcode()
    {
    	GridPane grid = new GridPane();
    	grid.setHgap(10);
    	grid.setVgap(10);

    	Text scenetitle = new Text("Pincode Invoeren");
    	scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
    	grid.add(scenetitle, 0, 0, 2, 1);

    	ImageView Logo = new ImageView("file:Geek Inc icon.png");
    	Logo.setPreserveRatio(true);
    	grid.add(Logo, 0, 0);
    	
    	Label pw = new Label("Pincode:");
    	grid.add(pw, 0, 1);

    	PasswordField pincode = new PasswordField();
    	grid.add(pincode, 1, 1);

    	Button ok = new Button("OK");
    	grid.add(ok, 2, 2);
    	
    	ok.setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(Home);
    				window.setFullScreen(true);
    			}
    		});
    	
    	return grid;
    }
    
    public HBox addHBoxCardcode()
    {
    	HBox hbox = new HBox();
    	hbox.setSpacing(8);
    	
    	Button Afbreken = new Button("Afbreken");
    	
    	Afbreken.setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(Welkom);
    				window.setFullScreen(true);
    			}
    		});
    	
    	hbox.getChildren().add(Afbreken);
    	
    	return hbox;
    }
    
    public VBox addVBoxHome()
    {
    	VBox vbox = new VBox();
    	vbox.setSpacing(8);
    	
    	Button options[] = new Button[]
    	{
    		new Button("Geld Opnemen"),
    		new Button("Saldo"),
    		new Button("Snel Pinnen")
    	};
    	
    	options[0].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(Pinnen);
    				window.setFullScreen(true);
    			}
    		});
    	
    	options[1].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(Saldo);
    				window.setFullScreen(true);
    			}
    		});
    	
    	options[2].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(Snelpin);
    				window.setFullScreen(true);
    			}
    		});
    	
    	for (int i=0; i<3; i++)
    	{
    		vbox.getChildren().add(options[i]);
    	}
    	
    	return vbox;
    }
    
    public HBox addHBoxHome()
    {
    	HBox hbox = new HBox();
    	hbox.setSpacing(8);
    	
    	Button options[] = new Button[]
    	{
    		new Button("Afbreken")
    	};
    	
    	options[0].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(Welkom);
    				window.setFullScreen(true);
    			}
    		});
    	
    	for (int i=0; i<1; i++)
    	{
    		hbox.getChildren().add(options[i]);
    	}
    	
    	return hbox;
    }
    
    public VBox addVBoxSnelpinl()
    {
    	VBox vbox = new VBox();
    	vbox.setSpacing(8);

    	Button options[] = new Button[]
    	{
    		new Button("€10"),
    		new Button("€20"),
    		new Button("€30"),
    		new Button("€50")
    	};
    	
    	options[0].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(Bon);
    				window.setFullScreen(true);
    			}
    		});
    	
    	options[1].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(Bon);
    				window.setFullScreen(true);
    			}
    		});
    	
    	options[2].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(Bon);
    				window.setFullScreen(true);
    			}
    		});
    	
    	options[3].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(Bon);
    				window.setFullScreen(true);
    			}
    		});

    	for (int i=0; i<4; i++)
    	{
    		vbox.getChildren().add(options[i]);
    	}

    	return vbox;
    }
    
    public VBox addVBoxSnelpinr()
    {
    	VBox vbox = new VBox();
    	vbox.setSpacing(8);

    	Button options[] = new Button[]
    	{
    		new Button("€75"),
    		new Button("€90"),
    		new Button("€100"),
    		new Button("€250")
    	};
    	
    	options[0].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(Bon);
    				window.setFullScreen(true);
    			}
    		});
    	
    	options[1].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(Bon);
    				window.setFullScreen(true);
    			}
    		});
    	
    	options[2].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(Bon);
    				window.setFullScreen(true);
    			}
    		});
    	
    	options[3].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(Bon);
    				window.setFullScreen(true);
    			}
    		});

    	for (int i=0; i<4; i++)
    	{
    		vbox.getChildren().add(options[i]);
    	}

    	return vbox;
    }
    
    public HBox addHBoxBottom()
    {
    	HBox hbox = new HBox();
    	hbox.setSpacing(8);
    	
    	Button options[] = new Button[]
    	{
    		new Button("Terug Naar Beginscherm"),
    		new Button("Afbreken")
    	};
    	
    	options[0].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(Home);
    				window.setFullScreen(true);
    			}
    		});
    	
    	options[1].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(Welkom);
    				window.setFullScreen(true);
    			}
    		});
    	
    	for (int i=0; i<2; i++)
    	{
    		hbox.getChildren().add(options[i]);
    	}
    	
    	return hbox;
    }
    
    public GridPane addGridPaneSaldo()
    {
    	GridPane grid = new GridPane();
    	grid.setHgap(10);
    	grid.setVgap(10);

    	Text scenetitle = new Text("Uw Saldo");
    	scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
    	grid.add(scenetitle, 0, 0, 2, 1);

    	Label userName = new Label("€");
    	grid.add(userName, 0, 1);

    	Label Saldo = new Label();
    	grid.add(Saldo, 1, 1);
    	
    	return grid;
    }
    
    public VBox addVBoxSaldo()
    {
    	VBox vbox = new VBox();
    	vbox.setSpacing(8);

    	Button options[] = new Button[]
    	{
    		new Button("Geld Opnemen")
    	};
    	
    	options[0].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(Pinnen);
    				window.setFullScreen(true);
    			}
    		});
    	
    	for (int i=0; i<1; i++)
    	{
    		vbox.getChildren().add(options[i]);
    	}

    	return vbox;
    }
    
    public VBox addVBoxPinnenl()
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
    	
    	options[0].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(Biljet);
    				window.setFullScreen(true);
    			}
    		});
    	
    	options[1].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(Biljet);
    				window.setFullScreen(true);
    			}
    		});
    	
    	options[2].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(Biljet);
    				window.setFullScreen(true);
    			}
    		});
    	
    	options[3].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(Biljet);
    				window.setFullScreen(true);
    			}
    		});
    	
    	options[4].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(Biljet);
    				window.setFullScreen(true);
    			}
    		});
    	
    	for (int i=0; i<5; i++)
    	{
    		vbox.getChildren().add(options[i]);
    	}

    	return vbox;
    }
    
    public VBox addVBoxPinnenr()
    {
    	VBox vbox = new VBox();
    	vbox.setSpacing(8);

    	Button options[] = new Button[]
    	{
    		new Button("€90"),
    		new Button("€100"),
    		new Button("€250"),
    		new Button("Ander Bedrag")
    	};
    	
    	options[0].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(Biljet);
    				window.setFullScreen(true);
    			}
    		});
    	
    	options[1].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(Biljet);
    				window.setFullScreen(true);
    			}
    		});
    	
    	options[2].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(Biljet);
    				window.setFullScreen(true);
    			}
    		});
    	
    	options[3].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(Ander);
    				window.setFullScreen(true);
    			}
    		});

    	for (int i=0; i<4; i++)
    	{
    		vbox.getChildren().add(options[i]);
    	}

    	return vbox;
    }
    
    public GridPane addGridPaneAnder()
    {
    	GridPane grid = new GridPane();
    	grid.setHgap(10);
    	grid.setVgap(10);

    	Text scenetitle = new Text("Bedrag Invoeren");
    	scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
    	grid.add(scenetitle, 0, 0, 2, 1);

    	Label userName = new Label("€");
    	grid.add(userName, 0, 1);

    	TextField userTextField = new TextField();
    	grid.add(userTextField, 1, 1);
    	
    	Button ok = new Button("OK");
    	grid.add(ok, 2, 2);
    	
    	ok.setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(Biljet);
    				window.setFullScreen(true);
    			}
    		});
    	
    	return grid;
    }
    
    public VBox addVBoxBiljet()
    {
    	VBox vbox = new VBox();
    	vbox.setSpacing(8);

    	Button options[] = new Button[]
    	{
    		new Button("€5"),
    		new Button("€10"),
    		new Button("€20"),
    		new Button("€50")
    	};
    	
    	options[0].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(Bon);
    				window.setFullScreen(true);
    			}
    		});
    	
    	options[1].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(Bon);
    				window.setFullScreen(true);
    			}
    		});
    	
    	options[2].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(Bon);
    				window.setFullScreen(true);
    			}
    		});
    		
    	options[3].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(Bon);
    				window.setFullScreen(true);
    			}
    		});

    	for (int i=0; i<4; i++)
    	{
    		vbox.getChildren().add(options[i]);
    	}

    	return vbox;
    }
    
    public GridPane addGridPaneBon()
    {
    	GridPane grid = new GridPane();
    	grid.setHgap(10);
    	grid.setVgap(10);

    	Text scenetitle = new Text("Bon?");
    	scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
    	grid.add(scenetitle, 0, 0, 2, 1);

    	Button Ja = new Button("JA");
    	grid.add(Ja, 1, 1);

    	Button Nee = new Button("NEE");
    	grid.add(Nee, 2, 1);

    	Ja.setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(Welkom);
    				window.setFullScreen(true);
    			}
    		});
    	
    	Nee.setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(Welkom);
    				window.setFullScreen(true);
    			}
    		});
    	
    	return grid;
    }
    
    public GridPane addGridPaneCardcodeEN()
    {
    	GridPane grid = new GridPane();
    	grid.setHgap(10);
    	grid.setVgap(10);

    	Text scenetitle = new Text("Enter PIN");
    	scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
    	grid.add(scenetitle, 0, 0, 2, 1);

    	ImageView Logo = new ImageView("file:Geek Inc icon.png");
    	Logo.setPreserveRatio(true);
    	grid.add(Logo, 0, 0);
    	
    	Label pw = new Label("PIN:");
    	grid.add(pw, 0, 1);

    	PasswordField pincode = new PasswordField();
    	grid.add(pincode, 1, 1);

    	Button ok = new Button("OK");
    	grid.add(ok, 2, 2);
    	
    	ok.setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(HomeEN);
    				window.setFullScreen(true);
    			}
    		});
    	
    	return grid;
    }
    
    public HBox addHBoxCardcodeEN()
    {
    	HBox hbox = new HBox();
    	hbox.setSpacing(8);
    	
    	Button Afbreken = new Button("Abort");
    	
    	Afbreken.setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(Welkom);
    				window.setFullScreen(true);
    			}
    		});
    	
    	hbox.getChildren().add(Afbreken);
    	
    	return hbox;
    }
    
    public VBox addVBoxHomeEN()
    {
    	VBox vbox = new VBox();
    	vbox.setSpacing(8);
    	
    	Button options[] = new Button[]
    	{
    		new Button("Withdraw Money"),
    		new Button("Balance"),
    		new Button("Withdraw Money Fast")
    	};
    	
    	options[0].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(PinnenEN);
    				window.setFullScreen(true);
    			}
    		});
    	
    	options[1].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(SaldoEN);
    				window.setFullScreen(true);
    			}
    		});
    	
    	options[2].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(SnelpinEN);
    				window.setFullScreen(true);
    			}
    		});
    	
    	for (int i=0; i<3; i++)
    	{
    		vbox.getChildren().add(options[i]);
    	}
    	
    	return vbox;
    }
    
    public VBox addVBoxSnelpinENl()
    {
    	VBox vbox = new VBox();
    	vbox.setSpacing(8);

    	Button options[] = new Button[]
    	{
    		new Button("€10"),
    		new Button("€20"),
    		new Button("€30"),
    		new Button("€50")
    	};
    	
    	options[0].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(BonEN);
    				window.setFullScreen(true);
    			}
    		});
    	
    	options[1].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(BonEN);
    				window.setFullScreen(true);
    			}
    		});
    	
    	options[2].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(BonEN);
    				window.setFullScreen(true);
    			}
    		});
    	
    	options[3].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(BonEN);
    				window.setFullScreen(true);
    			}
    		});

    	for (int i=0; i<4; i++)
    	{
    		vbox.getChildren().add(options[i]);
    	}

    	return vbox;
    }
    
    public VBox addVBoxSnelpinENr()
    {
    	VBox vbox = new VBox();
    	vbox.setSpacing(8);

    	Button options[] = new Button[]
    	{
    		new Button("€75"),
    		new Button("€90"),
    		new Button("€100"),
    		new Button("€250")
    	};
    	
    	options[0].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(BonEN);
    				window.setFullScreen(true);
    			}
    		});
    	
    	options[1].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(BonEN);
    				window.setFullScreen(true);
    			}
    		});
    	
    	options[2].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(BonEN);
    				window.setFullScreen(true);
    			}
    		});
    	
    	options[3].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(BonEN);
    				window.setFullScreen(true);
    			}
    		});

    	for (int i=0; i<4; i++)
    	{
    		vbox.getChildren().add(options[i]);
    	}

    	return vbox;
    }
    
    public HBox addHBoxDown()
    {
    	HBox hbox = new HBox();
    	hbox.setSpacing(8);
    	
    	Button options[] = new Button[]
    	{
    		new Button("Return To Home Screen"),
    		new Button("Abort")
    	};
    	
    	options[0].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(HomeEN);
    				window.setFullScreen(true);
    			}
    		});
    	
    	options[1].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(Welkom);
    				window.setFullScreen(true);
    			}
    		});
    	
    	for (int i=0; i<2; i++)
    	{
    		hbox.getChildren().add(options[i]);
    	}
    	
    	return hbox;
    }
    
    public GridPane addGridPaneSaldoEN()
    {
    	GridPane grid = new GridPane();
    	grid.setHgap(10);
    	grid.setVgap(10);

    	Text scenetitle = new Text("Your Balance");
    	scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
    	grid.add(scenetitle, 0, 0, 2, 1);

    	Label userName = new Label("€");
    	grid.add(userName, 0, 1);

    	Label SaldoEN = new Label();
    	grid.add(SaldoEN, 1, 1);
    	
    	return grid;
    }
    
    public VBox addVBoxSaldoEN()
    {
    	VBox vbox = new VBox();
    	vbox.setSpacing(8);

    	Button options[] = new Button[]
    	{
    		new Button("Withdraw Money")
    	};
    	
    	options[0].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(PinnenEN);
    				window.setFullScreen(true);
    			}
    		});
    	
    	for (int i=0; i<1; i++)
    	{
    		vbox.getChildren().add(options[i]);
    	}

    	return vbox;
    }
    
    public VBox addVBoxPinnenENl()
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
    	
    	options[0].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(BiljetEN);
    				window.setFullScreen(true);
    			}
    		});
    	
    	options[1].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(BiljetEN);
    				window.setFullScreen(true);
    			}
    		});
    	
    	options[2].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(BiljetEN);
    				window.setFullScreen(true);
    			}
    		});
    	
    	options[3].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(BiljetEN);
    				window.setFullScreen(true);
    			}
    		});
    	
    	options[4].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(BiljetEN);
    				window.setFullScreen(true);
    			}
    		});
    	
    	for (int i=0; i<5; i++)
    	{
    		vbox.getChildren().add(options[i]);
    	}

    	return vbox;
    }
    
    public VBox addVBoxPinnenENr()
    {
    	VBox vbox = new VBox();
    	vbox.setSpacing(8);

    	Button options[] = new Button[]
    	{
    		new Button("€90"),
    		new Button("€100"),
    		new Button("€250"),
    		new Button("Another Amount")
    	};
    	
    	options[0].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(BiljetEN);
    				window.setFullScreen(true);
    			}
    		});
    	
    	options[1].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(BiljetEN);
    				window.setFullScreen(true);
    			}
    		});
    	
    	options[2].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(BiljetEN);
    				window.setFullScreen(true);
    			}
    		});
    	
    	options[3].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(AnderEN);
    				window.setFullScreen(true);
    			}
    		});

    	for (int i=0; i<4; i++)
    	{
    		vbox.getChildren().add(options[i]);
    	}

    	return vbox;
    }
    
    public GridPane addGridPaneAnderEN()
    {
    	GridPane grid = new GridPane();
    	grid.setHgap(10);
    	grid.setVgap(10);

    	Text scenetitle = new Text("Enter Amount");
    	scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
    	grid.add(scenetitle, 0, 0, 2, 1);

    	Label userName = new Label("€");
    	grid.add(userName, 0, 1);

    	TextField userTextField = new TextField();
    	grid.add(userTextField, 1, 1);
    	
    	Button ok = new Button("OK");
    	grid.add(ok, 2, 2);
    	
    	ok.setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(BiljetEN);
    				window.setFullScreen(true);
    			}
    		});
    	
    	return grid;
    }
    
    public VBox addVBoxBiljetEN()
    {
    	VBox vbox = new VBox();
    	vbox.setSpacing(8);

    	Button options[] = new Button[]
    	{
    		new Button("€5"),
    		new Button("€10"),
    		new Button("€20"),
    		new Button("€50")
    	};
    	
    	options[0].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(BonEN);
    				window.setFullScreen(true);
    			}
    		});
    	
    	options[1].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(BonEN);
    				window.setFullScreen(true);
    			}
    		});
    	
    	options[2].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(BonEN);
    				window.setFullScreen(true);
    			}
    		});
    		
    	options[3].setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(BonEN);
    				window.setFullScreen(true);
    			}
    		});

    	for (int i=0; i<4; i++)
    	{
    		vbox.getChildren().add(options[i]);
    	}

    	return vbox;
    }
    
    public GridPane addGridPaneBonEN()
    {
    	GridPane grid = new GridPane();
    	grid.setHgap(10);
    	grid.setVgap(10);

    	Text scenetitle = new Text("Receipt?");
    	scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
    	grid.add(scenetitle, 0, 0, 2, 1);

    	Button Ja = new Button("YES");
    	grid.add(Ja, 1, 1);

    	Button Nee = new Button("NO");
    	grid.add(Nee, 2, 1);

    	Ja.setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(Welkom);
    				window.setFullScreen(true);
    			}
    		});
    	
    	Nee.setOnAction(new EventHandler<ActionEvent>()
    		{
    			public void handle(ActionEvent event)
    			{
    				window.setScene(Welkom);
    				window.setFullScreen(true);
    			}
    		});
    	
    	return grid;
    }
}