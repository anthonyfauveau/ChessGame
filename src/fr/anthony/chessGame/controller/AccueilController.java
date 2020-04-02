package fr.anthony.chessGame.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AccueilController implements Initializable{

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

	
	/**
	 * Quand cette méthode est appelé, l'écran va sur la scene de l'écran Solo
	 * @throws IOException 
	 */
	
	public void changeForSoloButtonPushed(ActionEvent event) throws IOException {
		Parent SoloTableView = FXMLLoader.load(getClass().getResource("/fr/anthony/chessGame/view/SoloView.fxml"));
		Scene SoloTableViewScene = new Scene(SoloTableView);
		
		//cette ligne récupère les informations du Stage
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(SoloTableViewScene);
		window.show();
	}
}
