package test.modules.notice;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import sun.launcher.resources.launcher;
import test.Main;

public class Error extends Main {
	
	@FXML
    private Text notice_title;
    
    @FXML
    private Text notice_desc;
	
	public String title = "Некоторые пункты незаполнены";
	
	public String desc = "Вы забыли";

	public void generate_interface(String path, String title) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource(path));
		
		Scene scene = new Scene(root);
		
		stage.setTitle(title);
		
		stage.setScene(scene);
		
		stage.show();
		
	}
	
	public void initialize() throws Exception {
	    
		
		
		main_paragraph();
		
	}
	
	public void main_paragraph() {
    	
		notice_title.setText(title);
    	
		notice_desc.setText(desc);
    	
    }

}