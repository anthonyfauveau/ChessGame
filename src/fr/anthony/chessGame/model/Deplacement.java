package fr.anthony.chessGame.model;

import fr.anthony.chessGame.model.Pieces.Piece;

public class Deplacement {
	
	private Piece piece;
	
	public Deplacement(Piece piece) {
		super();
		this.piece = piece;
	}
	
	public Piece getPiece() {
		return piece;
	}

	public void setPiece(Piece piece) {
		this.piece = piece;
	}
}
