package fr.anthony.chessGame.model.Pieces;


import fr.anthony.chessGame.model.Deplacement;


public class Cavalier extends Piece{


	public Cavalier(boolean pAvailable,String imagePath, int color) {
		super(pAvailable,imagePath, color);
	
	}
	
	
	@Override
	public int[][] deplacement(Deplacement[][] joueur, int ligne, int colonne) {
		int[][] result = new int[8][8];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				result[i][j] = 0;
			}
		}

		// D�placement haut x 2 + droite x 1
		if (colonne - 2 >= 0 && ligne + 1 <= 7 && checkCase(joueur, ligne + 1,colonne - 2)) {
			result[ligne + 1][colonne - 2] = 1;
		}

		// D�placement droite x 2 + haut x 1
		if (colonne - 1 >= 0 && ligne + 2 <= 7 && checkCase(joueur, ligne + 2, colonne - 1)) {
			result[ligne + 2][colonne - 1] = 1;
		}

		// D�placement doite x 2 + bas x 1
		if (colonne + 1 <= 7 && ligne + 2 <= 7 && checkCase(joueur, ligne + 2,colonne + 1)) {
			result[ligne + 2][colonne + 1] = 1;
		}

		// D�placement bas x 2 + droite x 1
		if (colonne + 2 <= 7 && ligne + 1 <= 7 && checkCase(joueur, ligne + 1,colonne + 2)) {
			result[ligne + 1][colonne + 2] = 1;
		}

		// D�placement bas x 2 + gauche x 1
		if (colonne + 2 <= 7 && ligne - 1 >= 0 && checkCase(joueur, ligne - 1,colonne + 2)) {
			result[ligne - 1][colonne + 2] = 1;
		}

		// D�placement gauche x 2 + bas x 1
		if (colonne + 1 <= 7 && ligne - 2 >= 0 && checkCase(joueur, ligne - 2,colonne + 1)) {
			result[ligne - 2][colonne + 1] = 1;
		}

		// D�placement gauche x 2 + haut x 1
		if (colonne - 1 >= 0 && ligne - 2 >= 0 && checkCase(joueur, ligne - 2,colonne - 1)) {
			result[ligne - 2][colonne - 1] = 1;
		}

		// D�placement haut x 2 + gauche x 1
		if (colonne - 2 >= 0 && ligne - 1 >= 0 && checkCase(joueur, ligne - 1, colonne - 2)) {
			result[ligne - 1][colonne - 2] = 1;
		}

		return result;
	}
	
	private boolean checkCase(Deplacement[][] joueur, int ligne, int colonne) {
		return joueur[ligne][colonne].getPiece() == null || joueur[ligne][colonne].getPiece().getColor() != getColor();
	}
}
