package fr.anthony.chessGame.model.Pieces;

import fr.anthony.chessGame.model.Deplacement;


public abstract class Piece {
	
	private boolean available;
	private String imagePath;
	private int color;
	
	public String getImagePath() {
		return imagePath;
	}


	public void setImagePath(String getImagePath) {
		this.imagePath = getImagePath;
	}

	
	public int getColor() {
		return color;
	}
	
	public void setColor(int color) {
		this.color = color;
	}


	public boolean isAvailable() {
		return available;
	}
	
	
	

	public void setAvailable(boolean available) {
		this.available = available;
	}


	public Piece(boolean pAvailable, String pimagePath, int color) {
		setAvailable(pAvailable);
		imagePath = pimagePath;
		this.color = color;
		
	}
	
	public abstract int[][] deplacement(Deplacement[][] joueur, int ligne, int colonne);
	
	
}
