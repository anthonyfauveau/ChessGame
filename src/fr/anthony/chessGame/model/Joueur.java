package fr.anthony.chessGame.model;

import java.util.ArrayList;
import java.util.List;

import fr.anthony.chessGame.model.Pieces.Piece;

public class Joueur {
	
	 public final int PION = 8;
	    public final int FOU = 2;
	    public final int TOUR = 2;
	    public boolean white;

	    private List<Piece> pieces = new ArrayList<>();

	    public Joueur(boolean pCouleur) {
	        
	        white = pCouleur;
	    }

	    public List<Piece> getPieces() {
	        return pieces;
	    }


	    public void initializePiecesPlayer(){
	    
	    }
	    
}
