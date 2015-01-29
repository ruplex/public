package test;

import java.awt.event.WindowAdapter;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
 
public class Controller extends Main {
	
    @FXML
    private AnchorPane pane; 
    
    public void onClickMethod() throws Exception {
  	
    	load_path_interface("/test/JavaFX/template/header/add_paragraphs.fxml");
    	
    	
    }
    
    public void close() {
    	
    	Stage stage = (Stage) pane.getScene().getWindow();
    	
    	stage.close();
    
    }
     
   
}