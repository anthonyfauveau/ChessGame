package fr.anthony.chessGame.model.Pieces;


import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

public class Reine extends Piece{
	
	public Image reineBlack = new Image("/fr/anthony/chessGame/items/queenBlack.png");
	public Image reineWhite = new Image("/fr/anthony/chessGame/items/queenWhite.png");
	public ImageView imageView = new ImageView();
	
	public Reine(boolean pAvailable, StackPane square,boolean color) {
		super(pAvailable, square);
		if(color == true) {
			square.getChildren().add(imageView);
			imageView.setImage(getReineBlack());
			imageView.setFitWidth(64);
			imageView.setFitHeight(64);
			imageView.setPreserveRatio(true);
			imageView.setSmooth(true);
		    imageView.setCache(true);
		}else {
			square.getChildren().add(imageView);
			imageView.setImage(getReineWhite());
			imageView.setFitWidth(64);
			imageView.setFitHeight(64);
			imageView.setPreserveRatio(true);
			imageView.setSmooth(true);
		    imageView.setCache(true);
		}
	}
	
	public Image getReineBlack() {
		return reineBlack;
	}
	
	public Image getReineWhite() {
		return reineWhite;
	}
}
