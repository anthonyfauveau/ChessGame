package fr.anthony.chessGame.model;

import javafx.scene.effect.ImageInput;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;

public class RoiModel extends PieceModel{
	
	public Image roi1 = new Image("/fr/anthony/chessGame/items/kingBlack.png");
	public ImageInput roiBlack = new ImageInput(roi1,10,10);
	public Image roi2 = new Image("/fr/anthony/chessGame/items/kingWhite.png");
	public ImageInput roiWhite = new ImageInput(roi2,10,10);
	
	public RoiModel(boolean pAvailable, StackPane square, boolean color) {
		super(pAvailable, square);
		
		if(color == true) {
			square.setEffect(getRoiBlack());
		}else {
			square.setEffect(getRoiWhite());
		}
	}
	
	public ImageInput getRoiBlack() {
		return roiBlack;
	}
	
	public ImageInput getRoiWhite() {
		return roiWhite;
	}
	
}
