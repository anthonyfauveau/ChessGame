package fr.anthony.chessGame.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import fr.anthony.chessGame.model.CavalierModel;
import fr.anthony.chessGame.model.FouModel;
import fr.anthony.chessGame.model.JoueurModel;
import fr.anthony.chessGame.model.PieceModel;
import fr.anthony.chessGame.model.PionModel;
import fr.anthony.chessGame.model.ReineModel;
import fr.anthony.chessGame.model.RoiModel;
import fr.anthony.chessGame.model.TourModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.ImageInput;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SoloController implements Initializable{
	
	@FXML
	private GridPane chessboard;
	
//region SQUAREStackPane
	
	@FXML
	private StackPane square_0_0;
	@FXML
	private StackPane square_1_0;
	@FXML
	private StackPane square_2_0;
	@FXML
	private StackPane square_3_0;
	@FXML
	private StackPane square_4_0;
	@FXML
	private StackPane square_5_0;
	@FXML
	private StackPane square_6_0;
	@FXML
	private StackPane square_7_0;
	
	@FXML
	private StackPane square_0_1;
	@FXML
	private StackPane square_1_1;
	@FXML
	private StackPane square_2_1;
	@FXML
	private StackPane square_3_1;
	@FXML
	private StackPane square_4_1;
	@FXML
	private StackPane square_5_1;
	@FXML
	private StackPane square_6_1;
	@FXML
	private StackPane square_7_1;
	
	@FXML
	private StackPane square_0_2;
	@FXML
	private StackPane square_1_2;
	@FXML
	private StackPane square_2_2;
	@FXML
	private StackPane square_3_2;
	@FXML
	private StackPane square_4_2;
	@FXML
	private StackPane square_5_2;
	@FXML
	private StackPane square_6_2;
	@FXML
	private StackPane square_7_2;
	
	@FXML
	private StackPane square_0_3;
	@FXML
	private StackPane square_1_3;
	@FXML
	private StackPane square_2_3;
	@FXML
	private StackPane square_3_3;
	@FXML
	private StackPane square_4_3;
	@FXML
	private StackPane square_5_3;
	@FXML
	private StackPane square_6_3;
	@FXML
	private StackPane square_7_3;
	
	@FXML
	private StackPane square_0_4;
	@FXML
	private StackPane square_1_4;
	@FXML
	private StackPane square_2_4;
	@FXML
	private StackPane square_3_4;
	@FXML
	private StackPane square_4_4;
	@FXML
	private StackPane square_5_4;
	@FXML
	private StackPane square_6_4;
	@FXML
	private StackPane square_7_4;
	
	@FXML
	private StackPane square_0_5;
	@FXML
	private StackPane square_1_5;
	@FXML
	private StackPane square_2_5;
	@FXML
	private StackPane square_3_5;
	@FXML
	private StackPane square_4_5;
	@FXML
	private StackPane square_5_5;
	@FXML
	private StackPane square_6_5;
	@FXML
	private StackPane square_7_5;
	
	@FXML
	private StackPane square_0_6;
	@FXML
	private StackPane square_1_6;
	@FXML
	private StackPane square_2_6;
	@FXML
	private StackPane square_3_6;
	@FXML
	private StackPane square_4_6;
	@FXML
	private StackPane square_5_6;
	@FXML
	private StackPane square_6_6;
	@FXML
	private StackPane square_7_6;
	
	@FXML
	private StackPane square_0_7;
	@FXML
	private StackPane square_1_7;
	@FXML
	private StackPane square_2_7;
	@FXML
	private StackPane square_3_7;
	@FXML
	private StackPane square_4_7;
	@FXML
	private StackPane square_5_7;
	@FXML
	private StackPane square_6_7;
	@FXML
	private StackPane square_7_7;
//enregion

	public final int PION = 8;
    public final int FOU = 2;
    public final int TOUR = 2;
    public boolean couleur = true;

    private List<PieceModel> pieces = new ArrayList<>();

   

    public List<PieceModel> getPieces() {
        return pieces;
    }
    
    public Image roi1 = new Image("/fr/anthony/chessGame/items/kingBlack.png");
	public ImageInput roiBlack = new ImageInput(roi1,10,10);
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	
		
		if(couleur == true){
           
            pieces.add(new PionModel(true,square_0_1, couleur));
            pieces.add(new PionModel(true,square_1_1, couleur));
            pieces.add(new PionModel(true,square_2_1, couleur));
            pieces.add(new PionModel(true,square_3_1, couleur));
            pieces.add(new PionModel(true,square_4_1, couleur));
            pieces.add(new PionModel(true,square_5_1, couleur));
            pieces.add(new PionModel(true,square_6_1, couleur));
            pieces.add(new PionModel(true,square_7_1, couleur));
           
            pieces.add(new TourModel(true, square_0_0, couleur));
            pieces.add(new TourModel(true, square_7_0, couleur));
            pieces.add(new FouModel(true, square_2_0, couleur));
            pieces.add(new FouModel(true, square_5_0, couleur));
            pieces.add(new CavalierModel(true, square_1_0, couleur));
            pieces.add(new CavalierModel(true, square_6_0, couleur));
            pieces.add(new ReineModel(true, square_3_0, couleur));
            pieces.add(new RoiModel(true, square_4_0, couleur));
           
        }
        else
        {
           
            pieces.add(new PionModel(true,square_0_6, couleur));
            pieces.add(new PionModel(true,square_1_6, couleur));
            pieces.add(new PionModel(true,square_2_6, couleur));
            pieces.add(new PionModel(true,square_3_6, couleur));
            pieces.add(new PionModel(true,square_4_6, couleur));
            pieces.add(new PionModel(true,square_5_6, couleur));
            pieces.add(new PionModel(true,square_6_6, couleur));
            pieces.add(new PionModel(true,square_7_6, couleur));
          
            pieces.add(new TourModel(true, square_0_7, couleur));
            pieces.add(new TourModel(true, square_7_7, couleur));
            pieces.add(new FouModel(true, square_2_7, couleur));
            pieces.add(new FouModel(true, square_5_7, couleur));
            pieces.add(new CavalierModel(true, square_1_7, couleur));
            pieces.add(new CavalierModel(true, square_6_7, couleur));
            pieces.add(new ReineModel(true, square_3_7, couleur));
            pieces.add(new RoiModel(true, square_4_7, couleur));
           
        }
		   
	}
	
	/**
	 * Quand cette méthode est appelé, l'écran va sur la scene de l'écran d'Accueil
	 * @throws IOException 
	 */
	
	public void changeForAccueilButtonPushed(ActionEvent event) throws IOException {
		Parent AccueilTableView = FXMLLoader.load(getClass().getResource("/fr/anthony/chessGame/view/AccueilView.fxml"));
		Scene AccueilTableViewScene = new Scene(AccueilTableView);
		
		//cette ligne récupère les informations du Stage
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(AccueilTableViewScene);
		window.show();
	}

}
