package fr.anthony.chessGame.model;

import javafx.scene.effect.ImageInput;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;

public class ReineModel extends PieceModel{
	
	public Image reine1 = new Image("/fr/anthony/chessGame/items/queenBlack.png");
	public ImageInput reineBlack = new ImageInput(reine1,10,10);
	public Image reine2 = new Image("/fr/anthony/chessGame/items/queenWhite.png");
	public ImageInput reineWhite = new ImageInput(reine2,10,10);
	
	public ReineModel(boolean pAvailable, StackPane square,boolean color) {
		super(pAvailable, square);
		if(color == true) {
			square.setEffect(getReineBlack());
		}else {
			square.setEffect(getReineWhite());
		}
	}
	
	public ImageInput getReineBlack() {
		return reineBlack;
	}
	
	public ImageInput getReineWhite() {
		return reineWhite;
	}
}
