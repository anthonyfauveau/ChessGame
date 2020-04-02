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

/*
	    public void initializePieces(){
	        if(couleur == true){
	            for(int i=0; i<PION; i++){ // draw pawns
	                pieces.add(new PionModel(true,square_+i+_2));
	            }
	            pieces.add(new TourModel(true, square_0_0));
	            pieces.add(new TourModel(true, square_7_0));
	            pieces.add(new FouModel(true, square_2_0));
	            pieces.add(new FouModel(true, square_5_0));
	            pieces.add(new CavalierModel(true, square_1_0));
	            pieces.add(new CavalierModel(true, square_6_0));
	            pieces.add(new ReineModel(true, square_3_0));
	            pieces.add(new RoiModel(true, square_4_0));
	        }
	        else{
	            for(int i=0; i<PION; i++){ // draw pawns
	                pieces.add(new PionModel(true,square_+i+_6));
	            }
	            pieces.add(new TourModel(true, square_0_7));
	            pieces.add(new TourModel(true, square_7_7));
	            pieces.add(new FouModel(true, square_2_7));
	            pieces.add(new FouModel(true, square_5_7));
	            pieces.add(new CavalierModel(true, square_1_7));
	            pieces.add(new CavalierModel(true, square_6_7));
	            pieces.add(new ReineModel(true, square_3_7));
	            pieces.add(new RoiModel(true, square_4_7));
	        }

	    }
	    */
}
