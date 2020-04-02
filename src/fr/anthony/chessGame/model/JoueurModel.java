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


	    public void initializePieces(){
	        if(couleur == true){
	            for(int i=0; i<PION; i++){ // draw pawns
	                pieces.add(new PionModel(true,i,2));
	            }
	            pieces.add(new TourModel(true, 0, 0));
	            pieces.add(new TourModel(true, 7, 0));
	            pieces.add(new FouModel(true, 2, 0));
	            pieces.add(new FouModel(true, 5, 0));
	            pieces.add(new CavalierModel(true, 1, 0));
	            pieces.add(new CavalierModel(true, 6, 0));
	            pieces.add(new ReineModel(true, 3, 0));
	            pieces.add(new RoiModel(true, 4, 0));
	        }
	        else{
	            for(int i=0; i<PION; i++){ // draw pawns
	                pieces.add(new PionModel(true,i,6));
	            }
	            pieces.add(new TourModel(true, 0, 7));
	            pieces.add(new TourModel(true, 7, 7));
	            pieces.add(new FouModel(true, 2, 7));
	            pieces.add(new FouModel(true, 5, 7));
	            pieces.add(new CavalierModel(true, 1, 7));
	            pieces.add(new CavalierModel(true, 6, 7));
	            pieces.add(new ReineModel(true, 3, 7));
	            pieces.add(new RoiModel(true, 4, 7));
	        }

	    }
}
