package fr.anthony.chessGame.controller;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import fr.anthony.chessGame.model.Deplacement;
import fr.anthony.chessGame.model.Game;
import fr.anthony.chessGame.model.Pieces.Piece;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SoloController implements Initializable{
	
	@FXML
	private GridPane chessboard;
	
	
	@FXML
	private StackPane square_0_0, square_1_0, square_2_0, square_3_0, square_4_0, square_5_0, square_6_0, square_7_0;
	@FXML
	private StackPane square_0_1, square_1_1, square_2_1, square_3_1, square_4_1, square_5_1, square_6_1, square_7_1;
	@FXML
	private StackPane square_0_2, square_1_2, square_2_2, square_3_2, square_4_2, square_5_2, square_6_2, square_7_2;
	@FXML
	private StackPane square_0_3, square_1_3, square_2_3, square_3_3, square_4_3, square_5_3, square_6_3, square_7_3;
	@FXML
	private StackPane square_0_4, square_1_4, square_2_4, square_3_4, square_4_4, square_5_4, square_6_4, square_7_4;
	@FXML
	private StackPane square_0_5, square_1_5, square_2_5, square_3_5, square_4_5, square_5_5, square_6_5, square_7_5;
	@FXML
	private StackPane square_0_6, square_1_6, square_2_6, square_3_6, square_4_6, square_5_6, square_6_6, square_7_6;
	@FXML
	private StackPane square_0_7, square_1_7, square_2_7, square_3_7, square_4_7, square_5_7, square_6_7, square_7_7;

	@FXML
	private Label labelTurn;
	
	private StackPane stackPanes[][];
	private StackPane firstStackPaneClicked;
	private StackPane secondStackPaneClicked;
	
	private Map<Piece, ImageView> piecesImageView;
	private Game partie;
   
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		stackPanes = new StackPane[8][8];
		StackPane[] panes0 = { square_0_0, square_1_0, square_2_0, square_3_0, square_4_0, square_5_0, square_6_0, square_7_0 };
		StackPane[] panes1 = { square_0_1, square_1_1, square_2_1, square_3_1, square_4_1, square_5_1, square_6_1, square_7_1 };
		StackPane[] panes2 = { square_0_2, square_1_2, square_2_2, square_3_2, square_4_2, square_5_2, square_6_2, square_7_2 };
		StackPane[] panes3 = { square_0_3, square_1_3, square_2_3, square_3_3, square_4_3, square_5_3, square_6_3, square_7_3 };
		StackPane[] panes4 = { square_0_4, square_1_4, square_2_4, square_3_4, square_4_4, square_5_4, square_6_4, square_7_4};
		StackPane[] panes5 = { square_0_5, square_1_5, square_2_5, square_3_5, square_4_5, square_5_5, square_6_5, square_7_5 };
		StackPane[] panes6 = { square_0_6, square_1_6, square_2_6, square_3_6, square_4_6, square_5_6, square_6_6, square_7_6};
		StackPane[] panes7 = { square_0_7, square_1_7, square_2_7, square_3_7, square_4_7, square_5_7, square_6_7, square_7_7 };
		stackPanes[0] = panes0;
		stackPanes[1] = panes1;
		stackPanes[2] = panes2;
		stackPanes[3] = panes3;
		stackPanes[4] = panes4;
		stackPanes[5] = panes5;
		stackPanes[6] = panes6;
		stackPanes[7] = panes7;
		
		
		piecesImageView = new HashMap<>();
		
		partie = new Game();
		initPiecesImageView();
		initGame();
		
		firstStackPaneClicked = null;
		secondStackPaneClicked = null;
		
		labelTurn.setText("Blancs");
		   
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
	
	private void initPiecesImageView() {

		for (Piece piece : partie.getJoueur().getPiecesBlack()) {
			piecesImageView.put(piece, new ImageView(piece.getImagePath()));
		}

		for (Piece piece : partie.getJoueur().getPiecesWhite()) {
			piecesImageView.put(piece, new ImageView(piece.getImagePath()));
		}
	}
	
	private void initGame() {

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				Deplacement d = partie.getJoueur().getDeplacement(i, j);
				if (d.getPiece() != null) {
					stackPanes[i][j].getChildren().add(piecesImageView.get(d.getPiece()));
				}
			}
		}
	}
	
	public void clickRelaodGame(ActionEvent event) throws IOException{
		
		Parent SoloTableView = FXMLLoader.load(getClass().getResource("/fr/anthony/chessGame/view/SoloView.fxml"));
		Scene SoloTableViewScene = new Scene(SoloTableView);
		
		//cette ligne récupère les informations du Stage
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(SoloTableViewScene);
		window.show();
	}
	
	@FXML
	private void clickStackPane(MouseEvent event) {

		if (firstStackPaneClicked == null) {
			StackPane stackPaneClicked = (StackPane) event.getSource();

			int ligne = numeroLigne(stackPaneClicked);
			int colonne = numeroColonne(stackPaneClicked);

			Deplacement caseClicked = partie.getJoueur().getDeplacement(ligne, colonne);

			if (caseClicked.getPiece() != null && caseClicked.getPiece().getColor() == partie.getTour()) {
				// Il y a bien une pièce sur cette case et elle est de la couleur du joueur
				firstStackPaneClicked = stackPaneClicked;
				setBackground();
			}

		} else if (firstStackPaneClicked == (StackPane) event.getSource()) {

			// La case sélectionnée est relachée
			firstStackPaneClicked = null;
			setBackground();

		} else if (secondStackPaneClicked == null) {

			int ligneCase1 = numeroLigne(firstStackPaneClicked);
			int colonneCase1 = numeroColonne(firstStackPaneClicked);

			int[][] result = partie.getJoueur().deplacementPossible(ligneCase1, colonneCase1);

			StackPane paneClicked = (StackPane) event.getSource();
			int ligneCase2 = numeroLigne(paneClicked);
			int colonneCase2 = numeroColonne(paneClicked);

			if (result[ligneCase2][colonneCase2] == 1) {
				// On a cliqué sur une case dont le déplacement était possible

				// On supprime l'image de ce pane
				firstStackPaneClicked.getChildren().remove(0);
				firstStackPaneClicked = null;

				secondStackPaneClicked = paneClicked;

				Deplacement case1 = partie.getJoueur().getDeplacement(ligneCase1, colonneCase1);
				Deplacement case2 = partie.getJoueur().getDeplacement(ligneCase2, colonneCase2);

				// On supprme l'image du pane cliqué dans le cas ou il y avait une pièce adverse
				if (case2.getPiece() != null) {
					secondStackPaneClicked.getChildren().remove(0);
				}

				// On ajoute la nouvelle image au pane cliqué
				secondStackPaneClicked.getChildren().add(piecesImageView.get(case1.getPiece()));
				secondStackPaneClicked = null;

				// On informe le modèle du déplacement
				partie.deplacement(case1, case2);

				labelTurn.setText(partie.getTour() == 0 ? "Blancs" : "Noirs");
				setBackground();
			}
		}
	}
	
	private void setBackground() {
		for (int i = 0; i < stackPanes.length; i++) {
			for (int j = 0; j < stackPanes.length; j++) {
				if ((i + j) % 2 == 1) {
					stackPanes[i][j].setStyle("-fx-background-color: #ECFAFF;");
				} else {
					stackPanes[i][j].setStyle("-fx-background-color: #F4F4F4;");
				}
			}
		}

		if (firstStackPaneClicked != null) {
			firstStackPaneClicked.setStyle("-fx-background-color: #AAAAAA;");
			int ligne = numeroLigne(firstStackPaneClicked);
			int colonne = numeroColonne(firstStackPaneClicked);

			int[][] result = partie.getJoueur().deplacementPossible(ligne, colonne);

			if (result != null) {
				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 8; j++) {
						if (result[i][j] == 1) {
							stackPanes[i][j].setStyle("-fx-background-color: #FFAE9D;");
						}
					}
				}
			}
		}

	}
	
	private int numeroLigne(StackPane stackPane) {
		for (int i = 0; i < 8; i++)
			for (int j = 0; j < 8; j++)
				if (stackPanes[i][j].getId().equals(stackPane.getId()))
					return i;

		return -1;
	}

	private int numeroColonne(StackPane stackPane) {
		for (int i = 0; i < 8; i++)
			for (int j = 0; j < 8; j++)
				if (stackPanes[i][j].getId().equals(stackPane.getId()))
					return j;

		return -1;
	}


	
}
