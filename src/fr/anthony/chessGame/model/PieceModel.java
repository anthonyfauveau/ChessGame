package fr.anthony.chessGame.model;

public class PieceModel {
	
	private boolean available;
	private int x;
	private int y;
	
	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public PieceModel(boolean pAvailable, int pX, int pY) {
		setAvailable(pAvailable);
		setX(pX);
		setY(pY);
		
	}
}
