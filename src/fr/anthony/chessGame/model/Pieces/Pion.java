package fr.anthony.chessGame.model.Pieces;


import fr.anthony.chessGame.model.Deplacement;

public class Pion extends Piece {

	public Pion(boolean pAvailable,String imagepath, int color) {
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

		// Déplacement des blanc (vers le haut)
		if (getColor() == 0) {

			// Départ déplacement de deux cases
			if (ligne == 6 && joueur[ligne - 1][colonne].getPiece() == null
					&& joueur[ligne - 2][colonne].getPiece() == null) {
				result[ligne - 2][colonne] = 1;
			}

			// Déplacement normal avant la dernière ligne
			if (ligne > 0 && joueur[ligne - 1][colonne].getPiece() == null) {
				result[ligne - 1][colonne] = 1;
			}

			// Manger une pièce à gauche
			if (ligne > 0 && colonne > 0 && joueur[ligne - 1][colonne - 1].getPiece() != null
					&& joueur[ligne - 1][colonne - 1].getPiece().getColor() != getColor()) {
				result[ligne - 1][colonne - 1] = 1;
			}

			// Manger une pièce à droite
			if (ligne > 0 && colonne < 7 && joueur[ligne - 1][colonne + 1].getPiece() != null
					&& joueur[ligne - 1][colonne + 1].getPiece().getColor() != getColor()) {
				result[ligne - 1][colonne + 1] = 1;
			}
		} else {

			// Départ déplacement de deux cases
			if (ligne == 1 && joueur[ligne + 1][colonne].getPiece() == null
					&& joueur[ligne + 2][colonne].getPiece() == null) {
				result[ligne + 2][colonne] = 1;
			}

			// Déplacement normal avant la dernière ligne
			if (ligne < 7 && joueur[ligne + 1][colonne].getPiece() == null) {
				result[ligne + 1][colonne] = 1;
			}

			// Manger une pièce à gauche
			if (ligne < 7 && colonne > 0 && joueur[ligne + 1][colonne - 1].getPiece() != null
					&& joueur[ligne + 1][colonne - 1].getPiece().getColor() != getColor()) {
				result[ligne + 1][colonne - 1] = 1;
			}

			// Manger une pièce à droite
			if (ligne < 7 && colonne < 7 && joueur[ligne + 1][colonne + 1].getPiece() != null
					&& joueur[ligne + 1][colonne + 1].getPiece().getColor() != getColor()) {
				result[ligne + 1][colonne + 1] = 1;
			}
			
		}
		return result;
	}
}
