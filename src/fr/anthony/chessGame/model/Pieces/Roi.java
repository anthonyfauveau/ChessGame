package fr.anthony.chessGame.model.Pieces;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

public class Roi extends Piece{
	
	public Image roiBlack = new Image("/fr/anthony/chessGame/items/kingBlack.png");
	public Image roiWhite = new Image("/fr/anthony/chessGame/items/kingWhite.png");
	public ImageView imageView = new ImageView();
	
	public Roi(boolean pAvailable, StackPane square, boolean color) {
		super(pAvailable, square);
		
		if(color == true) {
			square.getChildren().add(imageView);
			imageView.setImage(getRoiBlack());
			imageView.setFitWidth(64);
			imageView.setFitHeight(64);
			imageView.setPreserveRatio(true);
			imageView.setSmooth(true);
		    imageView.setCache(true);
		}else {
			square.getChildren().add(imageView);
			imageView.setImage(getRoiWhite());
			imageView.setFitWidth(64);
			imageView.setFitHeight(64);
			imageView.setPreserveRatio(true);
			imageView.setSmooth(true);
		    imageView.setCache(true);
		}
	}
	
	public Image getRoiBlack() {
		return roiBlack;
	}
	
	public Image getRoiWhite() {
		return roiWhite;
	}
	
}
