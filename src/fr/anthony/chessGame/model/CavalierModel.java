package fr.anthony.chessGame.model;

import javafx.scene.effect.ImageInput;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;

public class CavalierModel extends PieceModel{
	
	public Image cavalier1 = new Image("/fr/anthony/chessGame/items/cavalierBlack.png");
	public ImageInput cavalierBlack = new ImageInput(cavalier1,10,10);
	public Image cavalier2 = new Image("/fr/anthony/chessGame/items/cavalierWhite.png");
	public ImageInput cavalierWhite = new ImageInput(cavalier2,10,10);

	public CavalierModel(boolean pAvailable, StackPane square, boolean color) {
		super(pAvailable, square);
		
		if(color == true) {
			square.setEffect(getCavalierBlack());
		}else {
			square.setEffect(getCavalierWhite());
		}
	}
	
	public ImageInput getCavalierBlack() {
		return cavalierBlack;
	}
	
	public ImageInput getCavalierWhite() {
		return cavalierWhite;
	}
}
