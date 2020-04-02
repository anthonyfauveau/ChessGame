package fr.anthony.chessGame.model.Pieces;


import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

public class Cavalier extends Piece{
	
	public Image cavalierBlack = new Image("/fr/anthony/chessGame/items/cavalierBlack.png");
	public Image cavalierWhite = new Image("/fr/anthony/chessGame/items/cavalierWhite.png");
	public ImageView imageView = new ImageView();

	public Cavalier(boolean pAvailable, StackPane square, boolean color) {
		super(pAvailable, square);
		
		if(color == true) {
			square.getChildren().add(imageView);
			imageView.setImage(getCavalierBlack());
			imageView.setFitWidth(64);
			imageView.setFitHeight(64);
			imageView.setPreserveRatio(true);
			imageView.setSmooth(true);
		    imageView.setCache(true);
		}else {
			square.getChildren().add(imageView);
			imageView.setImage(getCavalierWhite());
			imageView.setFitWidth(64);
			imageView.setFitHeight(64);
			imageView.setPreserveRatio(true);
			imageView.setSmooth(true);
		    imageView.setCache(true);
		}
	}
	
	public Image getCavalierBlack() {
		return cavalierBlack;
	}
	
	public Image getCavalierWhite() {
		return cavalierWhite;
	}
}
