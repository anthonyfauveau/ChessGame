package fr.anthony.chessGame.model.Pieces;



import fr.anthony.chessGame.model.Deplacement;

public class Tour extends Piece{
	
	
	
	
	public Tour(boolean pAvailable, String imagepath, int color) {
		super(pAvailable,imagepath, color);
		
	}
	
	
	@Override
	public int[][] deplacement(Deplacement[][] joueur, int ligne, int colonne) {
		int[][] result = new int[8][8];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				result[i][j] = 0;
			}
		}

		// Déplacement gauche
		for (int i = colonne - 1; i >= 0; i--) {
			if (joueur[ligne][i].getPiece() == null) {
				result[ligne][i] = 1;
			} else if (joueur[ligne][i].getPiece().getColor() != getColor()) {
				result[ligne][i] = 1;
				break;
			} else {
				break;
			}
		}

		// Déplacement bas
		for (int i = ligne + 1; i <= 7; i++) {
			if (joueur[i][colonne].getPiece() == null) {
				result[i][colonne] = 1;
			} else if (joueur[i][colonne].getPiece().getColor() != getColor()) {
				result[i][colonne] = 1;
				break;
			} else {
				break;
			}
		}

		// Déplacement droite
		for (int i = colonne + 1; i <= 7; i++) {
			if (joueur[ligne][i].getPiece() == null) {
				result[ligne][i] = 1;
			} else if (joueur[ligne][i].getPiece().getColor() != getColor()) {
				result[ligne][i] = 1;
				break;
			} else {
				break;
			}
		}
		// Déplacement haut
		for (int i = ligne - 1; i >= 0; i--) {
			if (joueur[i][colonne].getPiece() == null) {
				result[i][colonne] = 1;
			} else if (joueur[i][colonne].getPiece().getColor() != getColor()) {
				result[i][colonne] = 1;
				break;
			} else {
				break;
			}
		}

		return result;
	}
}
