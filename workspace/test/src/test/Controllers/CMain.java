package test.Controllers;

import java.awt.TextArea;
import java.awt.event.WindowAdapter;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.sql.*;

import test.Main;
import test.modules.notice.Error;

public class CMain extends Main {
	
    @FXML
    private AnchorPane pane;

    @FXML
    private Text data_title;
    
    @FXML
    private Text data_desc;
    
    public void initialize() throws Exception {
    	
    	String[] data = get_data_in_plan(1);
    	
    	main_paragraph(data);

    }
    
    public void main_paragraph(String[] data) {
    	
    	data_title.setText(data[1]);
    	
    	data_desc.setText(data[2]);
    	
    }
    
    public void onClickMethod() throws Exception {
  	
    	load_path_interface("/test/JavaFX/template/header/add_paragraphs.fxml");
    	
    }
    
    public void close() {
    	
    	Stage stage = (Stage) pane.getScene().getWindow();
    	
    	stage.close();
    
    }
  
}