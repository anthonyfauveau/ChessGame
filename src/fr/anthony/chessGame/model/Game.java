package fr.anthony.chessGame.model;

public class Game {
	private Joueur joueur;
	
	private int tour;
	
	public Game() {
		joueur= new Joueur();
		
		tour= 0;
	}
	
	public Joueur getJoueur() {
		return joueur;
	}

	public void deplacement(Deplacement caseSelectionnee, Deplacement nouvelleCase) {

		joueur.deplacement(caseSelectionnee, nouvelleCase);
		
		tour = tour == 0 ? 1 : 0;
	}
	
	public int getTour() {
		return tour;
	}
}
