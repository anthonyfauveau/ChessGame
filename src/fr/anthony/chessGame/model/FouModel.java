package fr.anthony.chessGame.model;


import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

public class FouModel extends PieceModel {
	
	public Image fouBlack = new Image("/fr/anthony/chessGame/items/bishopBlack.png");
	public Image fouWhite = new Image("/fr/anthony/chessGame/items/bishopWhite.png");
	public ImageView imageView = new ImageView();
	
	public FouModel(boolean pAvailable, StackPane square, boolean color) {
		super(pAvailable, square);
		
		if(color == true) {
			square.getChildren().add(imageView);
			imageView.setImage(getFouBlack());
			imageView.setFitWidth(64);
			imageView.setFitHeight(64);
			imageView.setPreserveRatio(true);
			imageView.setSmooth(true);
		    imageView.setCache(true);
		}else {
			square.getChildren().add(imageView);
			imageView.setImage(getFouWhite());
			imageView.setFitWidth(64);
			imageView.setFitHeight(64);
			imageView.setPreserveRatio(true);
			imageView.setSmooth(true);
		    imageView.setCache(true);
		}
	}
	
	public Image getFouBlack() {
		return fouBlack;
	}
	
	public Image getFouWhite() {
		return fouWhite;
	}
}
