package fr.anthony.chessGame.model.Pieces;


import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

public class Pion extends Piece {
	
	
	public Image pionBlack = new Image("/fr/anthony/chessGame/items/pawnBlack.png");
	public Image pionWhite = new Image("/fr/anthony/chessGame/items/pawnWhite.png");
	public ImageView imageView = new ImageView();
	
	public Pion(boolean pAvailable, StackPane square, boolean color) {
		super(pAvailable, square);
		if(color == true) {
			square.getChildren().add(imageView);
			imageView.setImage(getPionBlack());
			imageView.setFitWidth(64);
			imageView.setFitHeight(64);
			imageView.setPreserveRatio(true);
			imageView.setSmooth(true);
		    imageView.setCache(true);
		}else {
			square.getChildren().add(imageView);
			imageView.setImage(getPionWhite());
			imageView.setFitWidth(64);
			imageView.setFitHeight(64);
			imageView.setPreserveRatio(true);
			imageView.setSmooth(true);
		    imageView.setCache(true);
		}
	}
	
	public Image getPionBlack() {
		return pionBlack;
	}
	
	public Image getPionWhite() {
		return pionWhite;
	}
}
