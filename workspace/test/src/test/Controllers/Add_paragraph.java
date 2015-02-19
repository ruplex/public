package test.Controllers;


import java.awt.event.WindowAdapter;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.sql.*;

import test.Main;
import test.modules.notice.*;

public class Add_paragraph extends Main {
	
	@FXML
    private TextArea content;
	
	@FXML
    private TextArea nTrue;
	
	@FXML
    private TextArea nFalse;
	
    public void add_Paragraph() throws Exception {
    	
    	String _content = new String(content.getText());
    	
    	String ntrue = new String(nTrue.getText());
    	
    	String nfalse = new String(nFalse.getText());
    	
    	open_notice("Заголовок", "Описание");
    	
    }
   
}