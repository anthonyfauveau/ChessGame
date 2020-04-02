package fr.anthony.chessGame.model;


import javafx.scene.effect.ImageInput;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;

public class TourModel extends PieceModel{
	
	public Image tour1 = new Image("/fr/anthony/chessGame/items/tourBlack.png");
	public ImageInput tourBlack = new ImageInput(tour1,10,10);
	public Image tour2 = new Image("/fr/anthony/chessGame/items/tourWhite.png");
	public ImageInput tourWhite = new ImageInput(tour2,10,10);
	
	
	public TourModel(boolean pAvailable, StackPane square, boolean color) {
		super(pAvailable, square);
		if(color == true) {
			square.setEffect(getTourBlack());
		}else {
			square.setEffect(getTourWhite());
		}
		
	}
	
	public ImageInput getTourBlack() {
		return tourBlack;
	}
	
	public ImageInput getTourWhite() {
		return tourWhite;
	}
}
