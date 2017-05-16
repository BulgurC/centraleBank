import javafx.animation.*;
import javafx.collections.*;
import javafx.css.*;
import javafx.embed.swing.*;
import javafx.fxml.*;
import javafx.print.*;
import javafx.scene.canvas.*;
import javafx.scene.chart.*;
import javafx.scene.control.cell.*;
import javafx.scene.media.*;
import javafx.scene.paint.*;
import javafx.scene.transform.*;
import javafx.scene.web.*;
import javafx.util.*;
import javafx.util.converter.*;     
import netscape.javascript.*;
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
import javafx.scene.shape.*;

public class Gui extends Application
{
	Stage primaryStage;
	Scene Welkom, Cardcode, Home, Saldo, Pinnen, Ander, Biljet, Bon, CardcodeEN, HomeEN, SaldoEN, PinnenEN, AnderEN, BiljetEN, BonEN;
	PasswordField pincode, pincodeNL;
	TextField userTextField, userTextFieldNL;
	Label geld, geldNL;
	
	//EventHandler<KeyEvent>(KeyCode.NUMBER_SIGN = KeyCode.TAB);//KeyCode.TAB = KeyCode.NUMBER_SIGN;
	//KeyCode.BACK_SPACE == KeyCode.Asterisk;
	//private KeyCode.NUMBER_SIGN equals(KeyCode.TAB);
	
	public static void main(String[] args)
	{
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage)
	{
		this.primaryStage = primaryStage;
		primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.initStyle(StageStyle.UNDECORATED);

        int width = (int) Screen.getPrimary().getBounds().getWidth();
        int height = (int) Screen.getPrimary().getBounds().getHeight();

		BorderPane Welkom1 = new BorderPane();
        Welkom1.setTop(addHBoxTop());
        Welkom1.setCenter(addStackPane());
        Welkom1.setBottom(addHBoxWelkom());
        
        Welkom = new Scene(Welkom1, width, height);
        
        BorderPane Cardcode1 = new BorderPane();
    	Cardcode1.setTop(addHBoxTop());
    	Cardcode1.setCenter(addGridPaneCardcode());
    	Cardcode1.setBottom(addHBoxCardcode());
    	
    	Cardcode = new Scene(Cardcode1, width, height);
    	
    	BorderPane Home1 = new BorderPane();
        Home1.setTop(addHBoxTop());
        Home1.setLeft(addVBoxHome());
        Home1.setCenter(addStackPane());
        Home1.setBottom(addHBoxCardcode());

        Home = new Scene(Home1, width, height);
        
    	BorderPane Saldo1 = new BorderPane();
    	Saldo1.setTop(addHBoxTop());
        Saldo1.setLeft(addVBoxSaldo());
        Saldo1.setCenter(addGridPaneSaldo());
        Saldo1.setBottom(addHBoxBottom());
        
    	Saldo = new Scene(Saldo1, width, height);
    	
    	BorderPane Pinnen1 = new BorderPane();
    	Pinnen1.setTop(addHBoxTop());
        Pinnen1.setLeft(addVBoxPinnenl());
        Pinnen1.setCenter(addStackPane());
        Pinnen1.setRight(addVBoxPinnenr());
        Pinnen1.setBottom(addHBoxBottom());
        
    	Pinnen = new Scene(Pinnen1, width, height);
    	
    	BorderPane Ander1 = new BorderPane();
    	Ander1.setTop(addHBoxTop());
        Ander1.setCenter(addGridPaneAnder());
        Ander1.setBottom(addHBoxBottom());
        
    	Ander = new Scene(Ander1, width, height);
    	
    	BorderPane Biljet1 = new BorderPane();
    	Biljet1.setTop(addHBoxTop());
        Biljet1.setLeft(addVBoxBiljet());
        Biljet1.setCenter(addStackPane());
        Biljet1.setBottom(addHBoxBottom());
        
    	Biljet = new Scene(Biljet1, width, height);
    	
    	BorderPane Bon1 = new BorderPane();
    	Bon1.setTop(addHBoxTop());
        Bon1.setCenter(addGridPaneBon());
        Bon1.setBottom(addHBoxBottom());
        
    	Bon = new Scene(Bon1, width, height);
    	
    	BorderPane CardcodeEN1 = new BorderPane();
    	CardcodeEN1.setTop(addHBoxTop());
    	CardcodeEN1.setCenter(addGridPaneCardcodeEN());
    	CardcodeEN1.setBottom(addHBoxCardcodeEN());
    	
    	CardcodeEN = new Scene(CardcodeEN1, width, height);
    	
    	BorderPane HomeEN1 = new BorderPane();
        HomeEN1.setTop(addHBoxTop());
        HomeEN1.setLeft(addVBoxHomeEN());
        HomeEN1.setCenter(addStackPane());
        HomeEN1.setBottom(addHBoxCardcodeEN());

        HomeEN = new Scene(HomeEN1, width, height);
        
    	BorderPane SaldoEN1 = new BorderPane();
    	SaldoEN1.setTop(addHBoxTop());
        SaldoEN1.setLeft(addVBoxSaldoEN());
        SaldoEN1.setCenter(addGridPaneSaldoEN());
        SaldoEN1.setBottom(addHBoxDown());
        
    	SaldoEN = new Scene(SaldoEN1, width, height);
    	
    	BorderPane PinnenEN1 = new BorderPane();
    	PinnenEN1.setTop(addHBoxTop());
        PinnenEN1.setLeft(addVBoxPinnenENl());
        PinnenEN1.setCenter(addStackPane());
        PinnenEN1.setRight(addVBoxPinnenENr());
        PinnenEN1.setBottom(addHBoxDown());
        
    	PinnenEN = new Scene(PinnenEN1, width, height);
    	
    	BorderPane AnderEN1 = new BorderPane();
    	AnderEN1.setTop(addHBoxTop());
        AnderEN1.setCenter(addGridPaneAnderEN());
        AnderEN1.setBottom(addHBoxDown());
        
    	AnderEN = new Scene(AnderEN1, width, height);
    	
    	BorderPane BiljetEN1 = new BorderPane();
    	BiljetEN1.setTop(addHBoxTop());
        BiljetEN1.setLeft(addVBoxBiljetEN());
        BiljetEN1.setCenter(addStackPane());
        BiljetEN1.setBottom(addHBoxDown());
        
    	BiljetEN = new Scene(BiljetEN1, width, height);
    	
    	BorderPane BonEN1 = new BorderPane();
    	BonEN1.setTop(addHBoxTop());
        BonEN1.setCenter(addGridPaneBonEN());
        BonEN1.setBottom(addHBoxDown());
        
    	BonEN = new Scene(BonEN1, width, height);
    	
    	primaryStage.setFullScreen(true);
        primaryStage.setTitle("Geek Incorporated");
        primaryStage.setScene(Welkom);
        primaryStage.show();
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
    		new Button("NL  (A)"),
    		new Button("EN  (B)")
    	};
    	
    	options[0].setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			public void handle(KeyEvent event)
    			{
    				if (event.getCode() == KeyCode.A)
    				{
    					primaryStage.setScene(Cardcode);
    					primaryStage.setFullScreen(true);
    				}
    			}
    		});
    	
    	options[1].setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			public void handle(KeyEvent event)
    			{
    				if (event.getCode() == KeyCode.B)
    				{
    					primaryStage.setScene(CardcodeEN);
    					primaryStage.setFullScreen(true);
    				}
    			}
    		});
    	options[0].setStyle("-fx-font-size: 20pt;");
    	options[1].setStyle("-fx-font-size: 20pt;");
    	
    	options[0].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	options[1].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	
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
    	scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 40));
    	grid.add(scenetitle, 0, 0, 2, 1);
    	
    	ImageView Logo = new ImageView("file:Geek Inc icon.png");
    	Logo.setPreserveRatio(true);
    	grid.add(Logo, 0, 0);
    	
    	Label pw = new Label("Pincode:");
    	pw.setFont(Font.font("Tahoma", 40));
    	grid.add(pw, 0, 1);
    	
    	pincodeNL = new PasswordField()
    	{
            public void replaceText(int start, int end, String text)
            {
                if (!text.matches("[a-z, A-Z, #, *]"))
                {
                    super.replaceText(start, end, text);   
                }
            }
 
            public void replaceSelection(String text)
            {
                if (!text.matches("[a-z, A-Z, #, *]"))
                {
                    super.replaceSelection(text);
                }
            }
        };
    	grid.add(pincodeNL, 1, 1);
    	
    	Button ok = new Button("OK  (A)");
    	ok.setStyle("-fx-font-size: 20pt;");
    	ok.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	grid.add(ok, 2, 2);
    	
    	for(int i=0;i<3;i++){
    	ok.setOnKeyPressed(new EventHandler<KeyEvent>()
    	{
    		public void handle(KeyEvent event)
    		{
    			if (event.getCode() == KeyCode.A)
    			{
    				int i = 0;
    				
    					if (pincodeNL.getText().equals("1234") && i<2)
    					{
    						pincodeNL.clear();
    						primaryStage.setScene(Home);
    						primaryStage.setFullScreen(true);
    						System.out.println("i1:"+i);
    						i=0;
    					}
    					
    					else if (!pincodeNL.getText().equals("1234") && i<2)
    					{
    						pincodeNL.clear();

    						Popup popup = new Popup();
    						popup.show(primaryStage);
    						
    						Label la = new Label();
    						la.setText("Verkeerde Pincode"+i);
    						la.setFont(Font.font("Tahoma", 40));
    						
    						Button close =new Button("Sluiten  (A)");
    						close.setOnKeyPressed(new EventHandler<KeyEvent>()
    							{
    								@Override
    								public void handle(KeyEvent event)
    								{
    									if (event.getCode() == KeyCode.A)
    									{
    										popup.hide();
    									}
    								}
    							});
    						VBox vbox = new VBox(10);
    						vbox.getChildren().addAll(la, close);
    						
    						int width = (int) Screen.getPrimary().getBounds().getWidth();
    						int height = (int) Screen.getPrimary().getBounds().getHeight();
    						popup.setX(width/2);
    						popup.setY(height/2);
    						popup.getContent().addAll(new Rectangle(500, 100, Color.AQUAMARINE), vbox);
    						
    						System.out.println("i2:"+i);
    						i++;
    					}
    					
    					else if (!pincodeNL.getText().equals("1234") && i==2)
                        {
                            pincodeNL.clear();
                            
                            Popup popup = new Popup();
    						popup.show(primaryStage);
    						
    						Label la = new Label();
    						la.setText("Pas geblokkeerd");
    						la.setFont(Font.font("Tahoma", 40));
    						
    						Button close =new Button("Sluiten  (A)");
    						close.setOnKeyPressed(new EventHandler<KeyEvent>()
    							{
    								@Override
    								public void handle(KeyEvent event)
    								{
    									if (event.getCode() == KeyCode.A)
    									{
    										popup.hide();
    									}
    								}
    							});
    						VBox vbox = new VBox(10);
    						vbox.getChildren().addAll(la, close);
    						
    						int width = (int) Screen.getPrimary().getBounds().getWidth();
    						int height = (int) Screen.getPrimary().getBounds().getHeight();
    						popup.setX(width/2);
    						popup.setY(height/2);
    						popup.getContent().addAll(new Rectangle(500, 100, Color.AQUAMARINE), vbox);
    						
                            primaryStage.setScene(Welkom);
                            primaryStage.setFullScreen(true);
                            System.out.println("i3:"+i);
                           i=3;
                        }
    				}
    			}
    		
    	});}
    	return grid;
    }
    
    public HBox addHBoxCardcode()
    {
    	HBox hbox = new HBox();
    	hbox.setSpacing(8);
    	
    	Button Afbreken = new Button("Afbreken  (D)");
    	
    	Afbreken.setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			public void handle(KeyEvent event)
    			{
    				if (event.getCode() == KeyCode.D)
    				{
    					pincodeNL.clear();
    					primaryStage.setScene(Welkom);
    					primaryStage.setFullScreen(true);
    				}
    			}
    		});
    	
    	Afbreken.setStyle("-fx-font-size: 20pt;");
    	Afbreken.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	hbox.getChildren().add(Afbreken);
    	
    	return hbox;
    }
    
    public VBox addVBoxHome()
    {
    	VBox vbox = new VBox();
    	vbox.setSpacing(8);
    	
    	Button options[] = new Button[]
    	{
    		new Button("Geld Opnemen  (1)"),
    		new Button("Saldo  (2)"),
    		new Button("Snel Pinnen €70  (3)")
    	};
    	
    	options[0].setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			public void handle(KeyEvent event)
    			{
    				if (event.getCode() == KeyCode.NUMPAD1)
    				{
    					primaryStage.setScene(Pinnen);
    					primaryStage.setFullScreen(true);
    				}
    			}
    		});
    	
    	options[1].setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			public void handle(KeyEvent event)
    			{
    				if (event.getCode() == KeyCode.NUMPAD2)
    				{
    					primaryStage.setScene(Saldo);
    					primaryStage.setFullScreen(true);
    				}
    			}
    		});
    	
    	options[2].setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			public void handle(KeyEvent event)
    			{
    				if (event.getCode() == KeyCode.NUMPAD3)
    				{
    					primaryStage.setScene(Welkom);
    					primaryStage.setFullScreen(true);
    				}
    			}
    		});
    	
    	options[0].setStyle("-fx-font-size: 20pt;");
    	options[1].setStyle("-fx-font-size: 20pt;");
    	options[2].setStyle("-fx-font-size: 20pt;");
    	
    	options[0].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	options[1].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	options[2].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	
    	for (int i=0; i<3; i++)
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
    		new Button("Terug Naar Beginscherm  (C)"),
    		new Button("Afbreken  (D)")
    	};
    	
    	options[0].setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			public void handle(KeyEvent event)
    			{
    				if (event.getCode() == KeyCode.C)
    				{
    					geldNL.setText(null);
    					userTextFieldNL.clear();
    					primaryStage.setScene(Home);
    					primaryStage.setFullScreen(true);
    				}
    			}
    		});
    	
    	options[1].setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			public void handle(KeyEvent event)
    			{
    				if (event.getCode() == KeyCode.D)
    				{
    					geldNL.setText(null);
    					userTextFieldNL.clear();
    					primaryStage.setScene(Welkom);
    					primaryStage.setFullScreen(true);
    				}
    			}
    		});
    	
    	options[0].setStyle("-fx-font-size: 20pt;");
    	options[1].setStyle("-fx-font-size: 20pt;");
    	
    	options[0].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	options[1].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	
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
    	scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 40));
    	grid.add(scenetitle, 0, 0, 2, 1);

    	Label userName = new Label("€");
    	userName.setFont(Font.font("Tahoma", 40));
    	grid.add(userName, 0, 1);

    	geldNL = new Label()
    	{
            //@Override
            public void replaceText(int start, int end, String text)
            {
                if (!text.matches("[a-z, A-Z, #, *]"))
                {
                    replaceText(start, end, text);   
                }
            }
 
            //@Override
            public void replaceSelection(String text)
            {
                if (!text.matches("[a-z, A-Z, #, *]"))
                {
                    replaceSelection(text);
                }  
            }
        };
        
        geldNL.setFont(Font.font("Tahoma", 40));
    	grid.add(geldNL, 1, 1);
    	
    	return grid;
    }
    
    public VBox addVBoxSaldo()
    {
    	VBox vbox = new VBox();
    	vbox.setSpacing(8);

    	Button options[] = new Button[]
    	{
    		new Button("Geld Opnemen  (A)")
    	};
    	
    	options[0].setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			public void handle(KeyEvent event)
    			{
    				if (event.getCode() == KeyCode.A)
    				{
    					geldNL.setText(null);
    					primaryStage.setScene(Pinnen);
    					primaryStage.setFullScreen(true);
    				}
    			}
    		});
    	
    	options[0].setStyle("-fx-font-size: 20pt;");
    	options[0].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	
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
    		new Button("€10  (0)"),
    		new Button("€20  (1)"),
    		new Button("€50  (2)")
    	};
    	
    	options[0].setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			public void handle(KeyEvent event)
    			{
    				if (event.getCode() == KeyCode.NUMPAD0)
    				{
    					primaryStage.setScene(Biljet);
    					primaryStage.setFullScreen(true);
    				}
    			}
    		});
    	
    	options[1].setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			public void handle(KeyEvent event)
    			{
    				if (event.getCode() == KeyCode.NUMPAD1)
    				{
    					primaryStage.setScene(Biljet);
    					primaryStage.setFullScreen(true);
    				}
    			}
    		});
    	
    	options[2].setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			public void handle(KeyEvent event)
    			{
    				if (event.getCode() == KeyCode.NUMPAD2)
    				{
    					primaryStage.setScene(Biljet);
    					primaryStage.setFullScreen(true);
    				}
    			}
    		});
    	
    	options[0].setStyle("-fx-font-size: 20pt;");
    	options[1].setStyle("-fx-font-size: 20pt;");
    	options[2].setStyle("-fx-font-size: 20pt;");
    	
    	options[0].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	options[1].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	options[2].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	
    	for (int i=0; i<3; i++)
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
    		new Button("€100  (3)"),
    		new Button("€250  (4)"),
    		new Button("Ander Bedrag  (5)")
    	};
    	
    	options[0].setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			public void handle(KeyEvent event)
    			{
    				if (event.getCode() == KeyCode.NUMPAD3)
    				{
    					primaryStage.setScene(Biljet);
    					primaryStage.setFullScreen(true);
    				}
    			}
    		});
    	
    	options[1].setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			public void handle(KeyEvent event)
    			{
    				if (event.getCode() == KeyCode.NUMPAD4)
    				{
    					primaryStage.setScene(Biljet);
    					primaryStage.setFullScreen(true);
    				}
    			}
    		});
    	
    	options[2].setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			public void handle(KeyEvent event)
    			{
    				if (event.getCode() == KeyCode.NUMPAD5)
    				{
    					primaryStage.setScene(Ander);
    					primaryStage.setFullScreen(true);
    				}
    			}
    		});
    	
    	options[0].setStyle("-fx-font-size: 20pt;");
    	options[1].setStyle("-fx-font-size: 20pt;");
    	options[2].setStyle("-fx-font-size: 20pt;");
    	
    	options[0].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	options[1].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	options[2].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	
    	for (int i=0; i<3; i++)
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
    	scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 40));
    	grid.add(scenetitle, 0, 0, 2, 1);

    	Label userName = new Label("€");
    	userName.setFont(Font.font("Tahoma", 40));
    	grid.add(userName, 0, 1);

    	userTextFieldNL = new TextField()
    	{
            public void replaceText(int start, int end, String text)
            {
                if (!text.matches("[a-z, A-Z, #, *]"))
                {
                    super.replaceText(start, end, text);   
                }
            }
 
            public void replaceSelection(String text)
            {
                if (!text.matches("[a-z, A-Z, #, *]"))
                {
                    super.replaceSelection(text);
                }  
            }
        };
        
        userTextFieldNL.setFont(Font.font("Tahoma", 40));
    	grid.add(userTextFieldNL, 1, 1);
    	
    	Button ok = new Button("OK  (A)");
    	ok.setStyle("-fx-font-size: 20pt;");
    	ok.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	grid.add(ok, 2, 2);
    	
    	ok.setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			public void handle(KeyEvent event)
    			{
    				if (event.getCode() == KeyCode.A)
    				{
    					int x = Integer.parseInt(userTextFieldNL.getText());
    					if(x%10==0)
    					{
    						userTextFieldNL.clear();
    						primaryStage.setScene(Biljet);
    						primaryStage.setFullScreen(true);
    					}
    					
    					else
    					{
    						userTextFieldNL.clear();
    					}
    				}
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
    		new Button("€10  (0)"),
    		new Button("€20  (1)"),
    		new Button("€50  (2)")
    	};
    	
    	options[0].setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			public void handle(KeyEvent event)
    			{
    				if (event.getCode() == KeyCode.NUMPAD0)
    				{
    					//if()
    					//{
    						Popup popup = new Popup();
    						popup.show(primaryStage);
    						
    						Label la = new Label();
    						la.setText("Weinig geld");
    						la.setFont(Font.font("Tahoma", 40));
    						
    						Button close =new Button("Sluiten  (A)");
    						close.setOnKeyPressed(new EventHandler<KeyEvent>()
    							{
    								@Override
    								public void handle(KeyEvent event)
    								{
    									if (event.getCode() == KeyCode.A)
    									{
    										popup.hide();
    									}
    								}
    							});
    						VBox vbox = new VBox(10);
    						vbox.getChildren().addAll(la, close);
    						
    						int width = (int) Screen.getPrimary().getBounds().getWidth();
    						int height = (int) Screen.getPrimary().getBounds().getHeight();
    						popup.setX(width/2);
    						popup.setY(height/2);
    						popup.getContent().addAll(new Rectangle(500, 100, Color.AQUAMARINE), vbox);
    					//}
    					
    					//else
    					//{
    						primaryStage.setScene(Bon);
    						primaryStage.setFullScreen(true);
    					//}
    				}
    			}
    		});
    	
    	options[1].setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			public void handle(KeyEvent event)
    			{
    				if (event.getCode() == KeyCode.NUMPAD1)
    				{
    					//if()
    					//{
    						Popup popup = new Popup();
    						popup.show(primaryStage);
    						
    						Label la = new Label();
    						la.setText("Weinig geld");
    						la.setFont(Font.font("Tahoma", 40));
    						
    						Button close =new Button("Sluiten  (A)");
    						close.setOnKeyPressed(new EventHandler<KeyEvent>()
    							{
    								@Override
    								public void handle(KeyEvent event)
    								{
    									if (event.getCode() == KeyCode.A)
    									{
    										popup.hide();
    									}
    								}
    							});
    						VBox vbox = new VBox(10);
    						vbox.getChildren().addAll(la, close);
    						
    						int width = (int) Screen.getPrimary().getBounds().getWidth();
    						int height = (int) Screen.getPrimary().getBounds().getHeight();
    						popup.setX(width/2);
    						popup.setY(height/2);
    						popup.getContent().addAll(new Rectangle(500, 100, Color.AQUAMARINE), vbox);
    					//}
    					
    					//else
    					//{
    						primaryStage.setScene(Bon);
    						primaryStage.setFullScreen(true);
    					//}
    				}
    			}
    		});
    	
    	options[2].setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			public void handle(KeyEvent event)
    			{
    				if (event.getCode() == KeyCode.NUMPAD2)
    				{
    					//if()
    					//{
    						Popup popup = new Popup();
    						popup.show(primaryStage);
    						
    						Label la = new Label();
    						la.setText("Weinig geld");
    						la.setFont(Font.font("Tahoma", 40));
    						
    						Button close =new Button("Sluiten  (A)");
    						close.setOnKeyPressed(new EventHandler<KeyEvent>()
    							{
    								@Override
    								public void handle(KeyEvent event)
    								{
    									if (event.getCode() == KeyCode.A)
    									{
    										popup.hide();
    									}
    								}
    							});
    						VBox vbox = new VBox(10);
    						vbox.getChildren().addAll(la, close);
    						
    						int width = (int) Screen.getPrimary().getBounds().getWidth();
    						int height = (int) Screen.getPrimary().getBounds().getHeight();
    						popup.setX(width/2);
    						popup.setY(height/2);
    						popup.getContent().addAll(new Rectangle(500, 100, Color.AQUAMARINE), vbox);
    					//}
    					
    					//else
    					//{
    						primaryStage.setScene(Bon);
    						primaryStage.setFullScreen(true);
    					//}
    				}
    			}
    		});
    	
    	options[0].setStyle("-fx-font-size: 20pt;");
    	options[1].setStyle("-fx-font-size: 20pt;");
    	options[2].setStyle("-fx-font-size: 20pt;");
    	
    	options[0].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	options[1].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	options[2].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	
    	for (int i=0; i<3; i++)
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
    	scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 40));
    	grid.add(scenetitle, 0, 0, 2, 1);

    	Button Ja = new Button("JA  (A)");
    	grid.add(Ja, 1, 1);

    	Button Nee = new Button("NEE  (B)");
    	grid.add(Nee, 2, 1);

    	Ja.setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			public void handle(KeyEvent event)
    			{
    				if (event.getCode() == KeyCode.A)
    				{
    					primaryStage.setScene(Welkom);
    					primaryStage.setFullScreen(true);
    				}
    			}
    		});
    	
    	Nee.setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			public void handle(KeyEvent event)
    			{
    				if (event.getCode() == KeyCode.B)
    				{
    					primaryStage.setScene(Welkom);
    					primaryStage.setFullScreen(true);
    				}
    			}
    		});
    	
    	Ja.setStyle("-fx-font-size: 20pt;");
    	Nee.setStyle("-fx-font-size: 20pt;");
    	
    	Ja.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	Nee.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	
    	return grid;
    }
    
    public GridPane addGridPaneCardcodeEN()
    {
    	GridPane grid = new GridPane();
    	grid.setHgap(10);
    	grid.setVgap(10);

    	Text scenetitle = new Text("Enter PIN");
    	scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 40));
    	grid.add(scenetitle, 0, 0, 2, 1);

    	ImageView Logo = new ImageView("file:Geek Inc icon.png");
    	Logo.setPreserveRatio(true);
    	grid.add(Logo, 0, 0);
    	
    	Label pw = new Label("PIN:");
    	pw.setFont(Font.font("Tahoma", 40));
    	grid.add(pw, 0, 1);

    	pincode = new PasswordField()
    	{
            //@Override
            public void replaceText(int start, int end, String text)
            {
                if (!text.matches("[a-z, A-Z, #, *]"))
                {
                    super.replaceText(start, end, text);   
                }
            }
 
            //@Override
            public void replaceSelection(String text)
            {
                if (!text.matches("[a-z, A-Z, #, *]"))
                {
                    super.replaceSelection(text);
                }  
            }
        };
    	grid.add(pincode, 1, 1);
    	
    	Button ok = new Button("OK  (A)");
    	ok.setStyle("-fx-font-size: 20pt;");
    	ok.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	grid.add(ok, 2, 2);
    	
    	ok.setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			public void handle(KeyEvent event)
    			{
    				if (event.getCode() == KeyCode.A)
    				{
    					int i = 0;
    				
    					if (pincode.getText().equals("1234") && i<2)
    					{
    						pincode.clear();
    						primaryStage.setScene(HomeEN);
    						primaryStage.setFullScreen(true);
    						System.out.println("i1:"+i);
    						i=0;
    					}
    					
    					else if (!pincode.getText().equals("1234") && i<2)
    					{
    						pincode.clear();

    						Popup popup = new Popup();
    						popup.show(primaryStage);
    						
    						Label la = new Label();
    						la.setText("Wrong PIN"+i);
    						la.setFont(Font.font("Tahoma", 40));
    						
    						Button close =new Button("Sluiten  (A)");
    						close.setOnKeyPressed(new EventHandler<KeyEvent>()
    							{
    								@Override
    								public void handle(KeyEvent event)
    								{
    									if (event.getCode() == KeyCode.A)
    									{
    										popup.hide();
    									}
    								}
    							});
    						VBox vbox = new VBox(10);
    						vbox.getChildren().addAll(la, close);
    						
    						int width = (int) Screen.getPrimary().getBounds().getWidth();
    						int height = (int) Screen.getPrimary().getBounds().getHeight();
    						popup.setX(width/2);
    						popup.setY(height/2);
    						popup.getContent().addAll(new Rectangle(500, 100, Color.AQUAMARINE), vbox);
    						
    						System.out.println("i2:"+i);
    						i++;
    					}
    					
    					else if (!pincode.getText().equals("1234") && i==2)
                        {
                            pincode.clear();
                            
                            Popup popup = new Popup();
    						popup.show(primaryStage);
    						
    						Label la = new Label();
    						la.setText("Pas Blocked");
    						la.setFont(Font.font("Tahoma", 40));
    						
    						Button close =new Button("Sluiten  (A)");
    						close.setOnKeyPressed(new EventHandler<KeyEvent>()
    							{
    								@Override
    								public void handle(KeyEvent event)
    								{
    									if (event.getCode() == KeyCode.A)
    									{
    										popup.hide();
    									}
    								}
    							});
    						VBox vbox = new VBox(10);
    						vbox.getChildren().addAll(la, close);
    						
    						int width = (int) Screen.getPrimary().getBounds().getWidth();
    						int height = (int) Screen.getPrimary().getBounds().getHeight();
    						popup.setX(width/2);
    						popup.setY(height/2);
    						popup.getContent().addAll(new Rectangle(500, 100, Color.AQUAMARINE), vbox);
    						
                            primaryStage.setScene(Welkom);
                            primaryStage.setFullScreen(true);
                            System.out.println("i3:"+i);
                           i=3;
                        }
    				}
    			}
    		});
    	
    	return grid;
    }
    
    public HBox addHBoxCardcodeEN()
    {
    	HBox hbox = new HBox();
    	hbox.setSpacing(8);
    	
    	Button Afbreken = new Button("Abort  (D)");
    	
    	Afbreken.setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			public void handle(KeyEvent event)
    			{
    				if (event.getCode() == KeyCode.D)
    				{
    					pincode.clear();
    					primaryStage.setScene(Welkom);
    					primaryStage.setFullScreen(true);
    				}
    			}
    		});
    	
    	Afbreken.setStyle("-fx-font-size: 20pt;");
    	Afbreken.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	
    	hbox.getChildren().add(Afbreken);
    	
    	return hbox;
    }
    
    public VBox addVBoxHomeEN()
    {
    	VBox vbox = new VBox();
    	vbox.setSpacing(8);
    	
    	Button options[] = new Button[]
    	{
    		new Button("Withdraw Money  (1)"),
    		new Button("Balance  (2)"),
    		new Button("Withdraw Money Fast €70  (3)")
    	};
    	
    	options[0].setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			public void handle(KeyEvent event)
    			{
    				if (event.getCode() == KeyCode.NUMPAD1)
    				{
    					primaryStage.setScene(PinnenEN);
    					primaryStage.setFullScreen(true);
    				}
    			}
    		});
    	
    	options[1].setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			public void handle(KeyEvent event)
    			{
    				if (event.getCode() == KeyCode.NUMPAD2)
    				{
    					primaryStage.setScene(SaldoEN);
    					primaryStage.setFullScreen(true);
    				}
    			}
    		});
    	
    	options[2].setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			public void handle(KeyEvent event)
    			{
    				if (event.getCode() == KeyCode.NUMPAD3)
    				{
    					primaryStage.setScene(Welkom);
    					primaryStage.setFullScreen(true);
    				}
    			}
    		});
    	
    	options[0].setStyle("-fx-font-size: 20pt;");
    	options[1].setStyle("-fx-font-size: 20pt;");
    	options[2].setStyle("-fx-font-size: 20pt;");
    	
    	options[0].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	options[1].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	options[2].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	
    	for (int i=0; i<3; i++)
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
    		new Button("Return To Home Screen  (C)"),
    		new Button("Abort  (D)")
    	};
    	
    	options[0].setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			public void handle(KeyEvent event)
    			{
    				if (event.getCode() == KeyCode.C)
    				{
    					geld.setText(null);
    					userTextField.clear();
    					primaryStage.setScene(HomeEN);
    					primaryStage.setFullScreen(true);
    				}
    			}
    		});
    	
    	options[1].setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			public void handle(KeyEvent event)
    			{
    				if (event.getCode() == KeyCode.D)
    				{
    					geld.setText(null);
    					userTextField.clear();
    					primaryStage.setScene(Welkom);
    					primaryStage.setFullScreen(true);
    				}
    			}
    		});
    	
    	options[0].setStyle("-fx-font-size: 20pt;");
    	options[1].setStyle("-fx-font-size: 20pt;");
    	
    	options[0].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	options[1].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	
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
    	scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 40));
    	grid.add(scenetitle, 0, 0, 2, 1);

    	Label userName = new Label("€");
    	userName.setFont(Font.font("Tahoma", 40));
    	grid.add(userName, 0, 1);

    	geld = new Label()
    	{
            //@Override
            public void replaceText(int start, int end, String text)
            {
                if (!text.matches("[a-z, A-Z, #, *]"))
                {
                    replaceText(start, end, text);   
                }
            }
 
            //@Override
            public void replaceSelection(String text)
            {
                if (!text.matches("[a-z, A-Z, #, *]"))
                {
                    replaceSelection(text);
                }  
            }
        };
        
        geld.setFont(Font.font("Tahoma", 40));
    	grid.add(geld, 1, 1);
    	
    	return grid;
    }
    
    public VBox addVBoxSaldoEN()
    {
    	VBox vbox = new VBox();
    	vbox.setSpacing(8);

    	Button options[] = new Button[]
    	{
    		new Button("Withdraw Money  (A)")
    	};
    	
    	options[0].setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			public void handle(KeyEvent event)
    			{
    				if (event.getCode() == KeyCode.A)
    				{
    					geld.setText(null);
    					primaryStage.setScene(PinnenEN);
    					primaryStage.setFullScreen(true);
    				}
    			}
    		});
    	
    	options[0].setStyle("-fx-font-size: 20pt;");
    	options[0].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	
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
    		new Button("€10  (0)"),
    		new Button("€20  (1)"),
    		new Button("€50  (2)")
    	};
    	
    	options[0].setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			public void handle(KeyEvent event)
    			{
    				if (event.getCode() == KeyCode.NUMPAD0)
    				{
    					primaryStage.setScene(BiljetEN);
    					primaryStage.setFullScreen(true);
    				}
    			}
    		});
    	
    	options[1].setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			public void handle(KeyEvent event)
    			{
    				if (event.getCode() == KeyCode.NUMPAD1)
    				{
    					primaryStage.setScene(BiljetEN);
    					primaryStage.setFullScreen(true);
    				}
    			}
    		});
    	
    	options[2].setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			public void handle(KeyEvent event)
    			{
    				if (event.getCode() == KeyCode.NUMPAD2)
    				{
    					primaryStage.setScene(BiljetEN);
    					primaryStage.setFullScreen(true);
    				}
    			}
    		});
    	
    	options[0].setStyle("-fx-font-size: 20pt;");
    	options[1].setStyle("-fx-font-size: 20pt;");
    	options[2].setStyle("-fx-font-size: 20pt;");
    	
    	options[0].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	options[1].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	options[2].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	
    	for (int i=0; i<3; i++)
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
    		new Button("€100  (3)"),
    		new Button("€250  (4)"),
    		new Button("Another Amount  (5)")
    	};
    	
    	options[0].setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			public void handle(KeyEvent event)
    			{
    				if (event.getCode() == KeyCode.NUMPAD3)
    				{
    					primaryStage.setScene(BiljetEN);
    					primaryStage.setFullScreen(true);
    				}
    			}
    		});
    	
    	options[1].setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			public void handle(KeyEvent event)
    			{
    				if (event.getCode() == KeyCode.NUMPAD4)
    				{
    					primaryStage.setScene(BiljetEN);
    					primaryStage.setFullScreen(true);
    				}
    			}
    		});
    	
    	options[2].setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			public void handle(KeyEvent event)
    			{
    				if (event.getCode() == KeyCode.NUMPAD5)
    				{
    					primaryStage.setScene(AnderEN);
    					primaryStage.setFullScreen(true);
    				}
    			}
    		});
    	
    	options[0].setStyle("-fx-font-size: 20pt;");
    	options[1].setStyle("-fx-font-size: 20pt;");
    	options[2].setStyle("-fx-font-size: 20pt;");
    	
    	options[0].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	options[1].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	options[2].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	
    	for (int i=0; i<3; i++)
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
    	scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 40));
    	grid.add(scenetitle, 0, 0, 2, 1);

    	Label userName = new Label("€");
    	userName.setFont(Font.font("Tahoma", 40));
    	grid.add(userName, 0, 1);

    	userTextField = new TextField()
    	{
            public void replaceText(int start, int end, String text)
            {
                if (!text.matches("[a-z, A-Z, #, *]"))
                {
                    super.replaceText(start, end, text);   
                }
            }
            
            public void replaceSelection(String text)
            {
                if (!text.matches("[a-z, A-Z, #, *]"))
                {
                    super.replaceSelection(text);
                }  
            }
        };
    	grid.add(userTextField, 1, 1);
    	
    	Button ok = new Button("OK  (A)");
    	ok.setStyle("-fx-font-size: 20pt;");
    	ok.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	grid.add(ok, 2, 2);
    	
    	
    	ok.setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			public void handle(KeyEvent event)
    			{
    				if (event.getCode() == KeyCode.A)
    				{
    					int x = Integer.parseInt(userTextField.getText());
    					if(x%10==0)
    					{
    						userTextField.clear();
    						primaryStage.setScene(BiljetEN);
    						primaryStage.setFullScreen(true);
    					}
    					
    					else
    					{
    						userTextField.clear();
    					}
    				}
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
    		new Button("€10  (0)"),
    		new Button("€20  (1)"),
    		new Button("€50  (2)")
    	};
    	
    	options[0].setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			public void handle(KeyEvent event)
    			{
    				if (event.getCode() == KeyCode.NUMPAD0)
    				{
    					//if()
    					//{
    						Popup popup = new Popup();
    						popup.show(primaryStage);
    						
    						Label la = new Label();
    						la.setText("NO money");
    						la.setFont(Font.font("Tahoma", 40));
    						
    						Button close =new Button("Sluiten  (A)");
    						close.setOnKeyPressed(new EventHandler<KeyEvent>()
    							{
    								@Override
    								public void handle(KeyEvent event)
    								{
    									if (event.getCode() == KeyCode.A)
    									{
    										popup.hide();
    									}
    								}
    							});
    						VBox vbox = new VBox(10);
    						vbox.getChildren().addAll(la, close);
    						
    						int width = (int) Screen.getPrimary().getBounds().getWidth();
    						int height = (int) Screen.getPrimary().getBounds().getHeight();
    						popup.setX(width/2);
    						popup.setY(height/2);
    						popup.getContent().addAll(new Rectangle(500, 100, Color.AQUAMARINE), vbox);
    					//}
    					
    					//else
    					//{
    						primaryStage.setScene(BonEN);
    						primaryStage.setFullScreen(true);
    					//}
    				}
    			}
    		});
    	
    	options[1].setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			public void handle(KeyEvent event)
    			{
    				if (event.getCode() == KeyCode.NUMPAD1)
    				{
    					//if()
    					//{
    						Popup popup = new Popup();
    						popup.show(primaryStage);
    						
    						Label la = new Label();
    						la.setText("NO money");
    						la.setFont(Font.font("Tahoma", 40));
    						
    						Button close =new Button("Sluiten  (A)");
    						close.setOnKeyPressed(new EventHandler<KeyEvent>()
    							{
    								@Override
    								public void handle(KeyEvent event)
    								{
    									if (event.getCode() == KeyCode.A)
    									{
    										popup.hide();
    									}
    								}
    							});
    						VBox vbox = new VBox(10);
    						vbox.getChildren().addAll(la, close);
    						
    						int width = (int) Screen.getPrimary().getBounds().getWidth();
    						int height = (int) Screen.getPrimary().getBounds().getHeight();
    						popup.setX(width/2);
    						popup.setY(height/2);
    						popup.getContent().addAll(new Rectangle(500, 100, Color.AQUAMARINE), vbox);
    					//}
    					
    					//else
    					//{
    						primaryStage.setScene(BonEN);
    						primaryStage.setFullScreen(true);
    					//}
    				}
    			}
    		});
    	
    	options[2].setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			public void handle(KeyEvent event)
    			{
    				if (event.getCode() == KeyCode.NUMPAD2)
    				{
    					//if()
    					//{
    						Popup popup = new Popup();
    						popup.show(primaryStage);
    						
    						Label la = new Label();
    						la.setText("NO money");
    						la.setFont(Font.font("Tahoma", 40));
    						
    						Button close =new Button("Sluiten  (A)");
    						close.setOnKeyPressed(new EventHandler<KeyEvent>()
    							{
    								@Override
    								public void handle(KeyEvent event)
    								{
    									if (event.getCode() == KeyCode.A)
    									{
    										popup.hide();
    									}
    								}
    							});
    						VBox vbox = new VBox(10);
    						vbox.getChildren().addAll(la, close);
    						
    						int width = (int) Screen.getPrimary().getBounds().getWidth();
    						int height = (int) Screen.getPrimary().getBounds().getHeight();
    						popup.setX(width/2);
    						popup.setY(height/2);
    						popup.getContent().addAll(new Rectangle(500, 100, Color.AQUAMARINE), vbox);
    					//}
    					
    					//else
    					//{
    						primaryStage.setScene(BonEN);
    						primaryStage.setFullScreen(true);
    					//}
    				}
    			}
    		});
    	
    	options[0].setStyle("-fx-font-size: 20pt;");
    	options[1].setStyle("-fx-font-size: 20pt;");
    	options[2].setStyle("-fx-font-size: 20pt;");
    	
    	options[0].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	options[1].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	options[2].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	
    	for (int i=0; i<3; i++)
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
    	scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 40));
    	grid.add(scenetitle, 0, 0, 2, 1);

    	Button Ja = new Button("YES  (A)");
    	grid.add(Ja, 1, 1);

    	Button Nee = new Button("NO  (B)");
    	grid.add(Nee, 2, 1);

    	Ja.setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			public void handle(KeyEvent event)
    			{
    				if (event.getCode() == KeyCode.A)
    				{
    					primaryStage.setScene(Welkom);
    					primaryStage.setFullScreen(true);
    				}
    			}
    		});
    	
    	Nee.setOnKeyPressed(new EventHandler<KeyEvent>()
    		{
    			public void handle(KeyEvent event)
    			{
    				if (event.getCode() == KeyCode.B)
    				{
    					primaryStage.setScene(Welkom);
    					primaryStage.setFullScreen(true);
    				}
    			}
    		});
    	
    	Nee.setStyle("-fx-font-size: 20pt;");
    	Ja.setStyle("-fx-font-size: 20pt;");
    	Nee.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	Ja.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    	
    	return grid;
    }
}