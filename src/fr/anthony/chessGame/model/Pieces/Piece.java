package fr.anthony.chessGame.model.Pieces;

import javafx.scene.layout.StackPane;

public class Piece {
	
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


	public Piece(boolean pAvailable, StackPane square) {
		setAvailable(pAvailable);
		setSquare(square);
		
	}
}
