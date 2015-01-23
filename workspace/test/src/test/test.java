package test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class test extends Application {
 
	public static void main(String[] args) {
  
		launch(args);
		
	}

	public void start(Stage stage) throws Exception {
	
		load_path_interface("/test/tmp/Основной_интерфейс.fxml", "Заголовок");
		
		load_path_interface("/test/tmp/Добавления_пунтка.fxml");
		
	}
	
	public void load_path_interface(String path, String title) throws Exception {

		Stage stage = new Stage();
		
		Parent root = FXMLLoader.load(getClass().getResource(path));
		
		Scene scene = new Scene(root);
		
		stage.setTitle(title);
		
		stage.setScene(scene);
		
		stage.show();
		
	}
	
	public void load_path_interface(String path) throws Exception {

		Stage stage = new Stage();
		
		Parent root = FXMLLoader.load(getClass().getResource(path));
		
		Scene scene = new Scene(root);
		
		stage.setTitle("Ничего");
		
		stage.setScene(scene);
		
		stage.show();
		
	} 

}