package fr.anthony.chessGame.model.Pieces;

import fr.anthony.chessGame.model.Deplacement;

public class Roi extends Piece{
	

	public Roi(boolean pAvailable, String imagepath, int color) {
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
		if (colonne - 1 >= 0 && checkCase(joueur, ligne, colonne - 1)) {
			result[ligne][colonne - 1] = 1;
		}

		// Déplacement gauche - bas
		if (colonne - 1 >= 0 && ligne + 1 <= 7 && checkCase(joueur, ligne + 1, colonne - 1)) {
			result[ligne + 1][colonne - 1] = 1;
		}

		// Déplacement bas
		if (ligne + 1 <= 7 && checkCase(joueur, ligne + 1, colonne)) {
			result[ligne + 1][colonne] = 1;
		}

		// Déplacement bas - droite
		if (ligne + 1 <= 7 && colonne + 1 <= 7 && checkCase(joueur, ligne + 1, colonne + 1)) {
			result[ligne + 1][colonne + 1] = 1;
		}

		// Déplacement droite
		if (colonne + 1 <= 7 && checkCase(joueur, ligne, colonne + 1)) {
			result[ligne][colonne + 1] = 1;
		}

		// Déplacement droite - haut
		if (colonne + 1 <= 7 && ligne - 1 >= 0 && checkCase(joueur, ligne - 1, colonne + 1)) {
			result[ligne - 1][colonne + 1] = 1;
		}

		// Déplacement haut
		if (ligne - 1 >= 0 && checkCase(joueur, ligne - 1, colonne)) {
			result[ligne - 1][colonne] = 1;
		}

		// Déplacement haut - gauche
		if (colonne - 1 >= 0 && ligne - 1 >= 0 && checkCase(joueur, ligne - 1, colonne - 1)) {
			result[ligne - 1][colonne - 1] = 1;
		}

		return result;
	}
	private boolean checkCase(Deplacement[][] joueur, int ligne, int colonne) {
		return joueur[ligne][colonne].getPiece() == null || joueur[ligne][colonne].getPiece().getColor() != getColor();
	}
}
