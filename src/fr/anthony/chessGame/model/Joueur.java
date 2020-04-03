package fr.anthony.chessGame.model;

import java.util.ArrayList;
import java.util.List;

import fr.anthony.chessGame.model.Pieces.Cavalier;
import fr.anthony.chessGame.model.Pieces.Fou;
import fr.anthony.chessGame.model.Pieces.Piece;
import fr.anthony.chessGame.model.Pieces.Pion;
import fr.anthony.chessGame.model.Pieces.Reine;
import fr.anthony.chessGame.model.Pieces.Roi;
import fr.anthony.chessGame.model.Pieces.Tour;


public class Joueur {
	
	 public final int PION = 8;
	    public final int FOU = 2;
	    public final int TOUR = 2;
	    public boolean white;
	    

	    private List<Piece> piecesBlack;
		private List<Piece> piecesWhite;
		private Deplacement[][] deplacements;


	    public Joueur() {
	    
			deplacements = new Deplacement[8][8];
			
			for (int i = 0; i < deplacements.length; i++) {
				for (int j = 0; j < deplacements.length; j++) {
					deplacements[i][j] = new Deplacement(null);
				}
			}
			
			
			piecesBlack = new ArrayList<>();
			piecesWhite = new ArrayList<>();
			
			//piece black
			  piecesBlack.add(new Tour(true, "/fr/anthony/chessGame/items/tourBlack.png",1));
			  piecesBlack.add(new Cavalier(true, "/fr/anthony/chessGame/items/cavalierBlack.png",1));
			  piecesBlack.add(new Fou(true, "/fr/anthony/chessGame/items/bishopBlack.png",1));
			  piecesBlack.add(new Reine(true,"/fr/anthony/chessGame/items/queenBlack.png",1));
			  piecesBlack.add(new Roi(true, "/fr/anthony/chessGame/items/kingBlack.png",1));
			  piecesBlack.add(new Fou(true, "/fr/anthony/chessGame/items/bishopBlack.png",1));
			  piecesBlack.add(new Cavalier(true, "/fr/anthony/chessGame/items/cavalierBlack.png",1));
			  piecesBlack.add(new Tour(true, "/fr/anthony/chessGame/items/tourBlack.png", 1));
			  piecesBlack.add(new Pion(true, "/fr/anthony/chessGame/items/pawnBlack.png",1));
	          piecesBlack.add(new Pion(true, "/fr/anthony/chessGame/items/pawnBlack.png",1));
	          piecesBlack.add(new Pion(true, "/fr/anthony/chessGame/items/pawnBlack.png",1));
	          piecesBlack.add(new Pion(true, "/fr/anthony/chessGame/items/pawnBlack.png",1));
	          piecesBlack.add(new Pion(true, "/fr/anthony/chessGame/items/pawnBlack.png",1));
	          piecesBlack.add(new Pion(true, "/fr/anthony/chessGame/items/pawnBlack.png",1));
	          piecesBlack.add(new Pion(true, "/fr/anthony/chessGame/items/pawnBlack.png",1));
	          piecesBlack.add(new Pion(true, "/fr/anthony/chessGame/items/pawnBlack.png",1));
	  
	          
	           
	      //Piece white

	            piecesWhite.add(new Tour(true, "/fr/anthony/chessGame/items/tourWhite.png",0));
	            piecesWhite.add(new Cavalier(true, "/fr/anthony/chessGame/items/cavalierWhite.png",0));
	            piecesWhite.add(new Fou(true, "/fr/anthony/chessGame/items/bishopWhite.png",0));
	            piecesWhite.add(new Reine(true, "/fr/anthony/chessGame/items/queenWhite.png",0));
	            piecesWhite.add(new Roi(true, "/fr/anthony/chessGame/items/kingWhite.png",0));
	            piecesWhite.add(new Fou(true, "/fr/anthony/chessGame/items/bishopWhite.png",0));
	            piecesWhite.add(new Cavalier(true, "/fr/anthony/chessGame/items/cavalierWhite.png",0));
	            piecesWhite.add(new Tour(true, "/fr/anthony/chessGame/items/tourWhite.png",0)); 
	            piecesWhite.add(new Pion(true, "/fr/anthony/chessGame/items/pawnWhite.png",0));
	            piecesWhite.add(new Pion(true, "/fr/anthony/chessGame/items/pawnWhite.png",0));
	            piecesWhite.add(new Pion(true, "/fr/anthony/chessGame/items/pawnWhite.png",0));
	            piecesWhite.add(new Pion(true, "/fr/anthony/chessGame/items/pawnWhite.png",0));
	            piecesWhite.add(new Pion(true, "/fr/anthony/chessGame/items/pawnWhite.png",0));
	            piecesWhite.add(new Pion(true, "/fr/anthony/chessGame/items/pawnWhite.png",0));
	            piecesWhite.add(new Pion(true, "/fr/anthony/chessGame/items/pawnWhite.png",0));
	            piecesWhite.add(new Pion(true, "/fr/anthony/chessGame/items/pawnWhite.png",0));
	            
	           
	            
	           
	            
	            initializePiecesPlayer();
	        
	      
	    }
	    
	  

	 
	    public void initializePiecesPlayer(){

			for (int i = 0; i < 8; i++)
				deplacements[0][i].setPiece(piecesBlack.get(i));

			for (int i = 0; i < 8; i++)
				deplacements[1][i].setPiece(piecesBlack.get(i + 8));

			for (int i = 0; i < 8; i++)
				deplacements[6][i].setPiece(piecesWhite.get(i + 8));

			for (int i = 0; i < 8; i++)
				deplacements[7][i].setPiece(piecesWhite.get(i));

	    }
	    
	    public Deplacement getDeplacement(int i, int j) {

			return deplacements[i][j];
		}

		public Deplacement[][] getCases() {
			return deplacements;
		}

	   public List<Piece> getPiecesBlack() {
	        return piecesBlack;
	    }
	    
	    public List<Piece> getPiecesWhite() {
	        return piecesWhite;
	    }

	    public void deplacement(Deplacement caseSelectionnee, Deplacement nouvelleCase) {

			nouvelleCase.setPiece(caseSelectionnee.getPiece());
			caseSelectionnee.setPiece(null);
		}
	    
	

		public int[][] deplacementPossible(int ligne, int colonne) {

			return deplacements[ligne][colonne].getPiece().deplacement(deplacements, ligne, colonne);
		}
	    
}
