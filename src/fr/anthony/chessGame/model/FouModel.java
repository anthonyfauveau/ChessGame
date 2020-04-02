package fr.anthony.chessGame.model;

import javafx.scene.effect.ImageInput;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;

public class FouModel extends PieceModel {
	
	public Image fou1 = new Image("/fr/anthony/chessGame/items/bishopBlack.png");
	public ImageInput fouBlack = new ImageInput(fou1,10,10);
	public Image fou2 = new Image("/fr/anthony/chessGame/items/bishopWhite.png");
	public ImageInput fouWhite = new ImageInput(fou2,10,10);
	
	public FouModel(boolean pAvailable, StackPane square, boolean color) {
		super(pAvailable, square);
		
		if(color == true) {
			square.setEffect(getFouBlack());
		}else {
			square.setEffect(getFouWhite());
		}
	}
	
	public ImageInput getFouBlack() {
		return fouBlack;
	}
	
	public ImageInput getFouWhite() {
		return fouWhite;
	}
}
