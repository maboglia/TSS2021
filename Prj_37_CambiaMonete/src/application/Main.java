package application;
	
import java.util.Iterator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import model.Cambiatore;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			VBox root = new VBox(); 
			Button btn = new Button();
			Label testo = new Label("Scrivi nel box sottostante la somma da cambiare");
			Text output = new Text();
			
			Rectangle r = new Rectangle(50, 40, Color.CHOCOLATE);
			
			
			
			TextField tf = new TextField();
			
			btn.setText("cambia");
			btn.setOnAction(new EventHandler<ActionEvent>() {
				
				int contatore = 0;
				
				@Override
				public void handle(ActionEvent arg0) {
					r.setScaleX(contatore*10);
					r.setScaleY(contatore*2);
					
					contatore++;
					
					String input = tf.getText();
					
					try {
						int amount = Integer.parseInt(input);
						int[] tagli = {500, 200, 100, 50, 20, 10, 5, 2, 1};
						int[] result = Cambiatore.cambia(amount);
						
						StringBuilder sb = new StringBuilder("Denaro cambiato: \n");
						
						for (int i = 0; i < result.length; i++) {
							sb.append("Pezzi da "+tagli[i] + ": " + result[i]+"\n");
						}
						
						output.setText(sb.toString());
						
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						System.err.println(e.getMessage());
					} catch (Exception e) {
						System.err.println(e.getMessage());
					}
					
					System.out.println("Hai scritto " + input);
					
				}
			});
			
			root.getChildren().add(testo);
			root.getChildren().add(tf);
			root.getChildren().add(btn);
			root.getChildren().add(output);
			root.getChildren().add(r);
			
			Scene scene = new Scene(root,500,400);
			
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setTitle("Cambia monete");
			primaryStage.setScene(scene);
			primaryStage.show();
		
		
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
