package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class Main extends Application {
	
	Stage window;
	Button button1, button2;
	Scene scena1, scena2;
	Label lbl1, lbl2;
	
	@Override
	public void start(Stage primaryStage) {
		//finestra
		this.window = primaryStage;		
		window.setTitle("Hello JavaFX");
		//pagina 1
		lbl1 = new Label("Benvenuto in home page");
		button1 = new Button("Vai alla scena 2");
		
		Circle c1 = new Circle(150,150,100);
		c1.setFill(Color.YELLOWGREEN);
		
		//pagina 2
		lbl2 = new Label("Pagina 2");
		button2 = new Button("Vai alla scena 1");
		
		VBox layout1 = new VBox(20);
		layout1.getChildren().addAll(lbl1, button1, c1);
		
		
		HBox layout2 = new HBox(20);
		c1.setScaleX(0.2);
		layout2.getChildren().addAll(lbl2, button2, c1);
		
		scena1 = new Scene(layout1, 400, 300, Color.FIREBRICK);
		scena2 = new Scene(layout2, 640, 480, Color.PINK);

		
		button1.setOnAction(e->window.setScene(scena2));
		button2.setOnAction(e->window.setScene(scena1));
		
		window.setScene(scena1);
		window.show();
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
