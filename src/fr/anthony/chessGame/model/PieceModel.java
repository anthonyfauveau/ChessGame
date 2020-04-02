package fr.anthony.chessGame.model;

import javafx.scene.layout.StackPane;

public class PieceModel {
	
	private boolean available;
	private StackPane square;
	
	public boolean isAvailable() {
		return available;
	}
	
	public StackPane getSquare() {
		return square;
	}

	public void setSquare(StackPane square) {
		this.square = square;
	}

	

	public void setAvailable(boolean available) {
		this.available = available;
	}


	public PieceModel(boolean pAvailable, StackPane square) {
		setAvailable(pAvailable);
		setSquare(square);
		
	}
}
