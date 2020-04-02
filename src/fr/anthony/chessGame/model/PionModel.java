package fr.anthony.chessGame.model;

import javafx.scene.effect.ImageInput;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;

public class PionModel extends PieceModel {
	
	
	public Image pion1 = new Image("/fr/anthony/chessGame/items/pawnBlack.png");
	public ImageInput pionBlack = new ImageInput(pion1,10,10);
	public Image pion2 = new Image("/fr/anthony/chessGame/items/pawnWhite.png");
	public ImageInput pionWhite = new ImageInput(pion2,10,10);
	
	public PionModel(boolean pAvailable, StackPane square, boolean color) {
		super(pAvailable, square);
		if(color == true) {
			square.setEffect(getPionBlack());
		}else {
			square.setEffect(getPionWhite());
		}
	}
	
	public ImageInput getPionBlack() {
		return pionBlack;
	}
	
	public ImageInput getPionWhite() {
		return pionWhite;
	}
}
