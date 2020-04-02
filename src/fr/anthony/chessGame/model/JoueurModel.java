package fr.anthony.chessGame.model;

import java.util.ArrayList;
import java.util.List;

public class JoueurModel {
	
	 public final int PION = 8;
	    public final int FOU = 2;
	    public final int TOUR = 2;
	    public boolean couleur;

	    private List<PieceModel> pieces = new ArrayList<>();

	    public JoueurModel(boolean pCouleur) {
	        
	        couleur = pCouleur;
	    }

	    public List<PieceModel> getPieces() {
	        return pieces;
	    }


	    public void initializePiecesPlayer(){
	    
	    }
	    
}
