package test;

import java.awt.event.WindowAdapter;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
public class Controller extends Main {
	
    @FXML
    private AnchorPane pane; 
    private Text data_desc;
    
    public void onClickMethod() throws Exception {
  	
    	//load_path_interface("/test/JavaFX/template/header/add_paragraphs.fxml");
    	data_desc.setText("Поле сообщения");
    	
    }
    
    public void close() {
    	
    	Stage stage = (Stage) pane.getScene().getWindow();
    	
    	stage.close();
    
    }
     
   
}