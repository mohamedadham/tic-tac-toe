package playscreen;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
		Parent root = loader.load();
		primaryStage.setScene(new Scene(root));
		primaryStage.setMinWidth(200);
        primaryStage.setMinHeight(120);
        primaryStage.show();
        
        FXMLDocumentController cl = (FXMLDocumentController)loader.getController();
        //cl.setActionListener();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
