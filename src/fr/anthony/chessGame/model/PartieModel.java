package fr.anthony.chessGame.model;

public class PartieModel {
    private SoloModel plateau = new SoloModel();
    private JoueurModel white;
    private JoueurModel black;
    
    public PartieModel() {
        super();
    }

    public void setColorWhite(JoueurModel joueur) {
        white = joueur;
    }

    public void setColorBlack(JoueurModel joueur) {
        black = joueur;
    }

    public SoloModel getBoard() {
        return plateau;
    }

    public void setBoard(SoloModel pPlateau) {
        plateau = pPlateau;
    }

    public JoueurModel getWhite() {
        return white;
    }

    public void setWhite(JoueurModel pWhite) {
        white = pWhite;
    }

    public JoueurModel getBlack() {
        return black;
    }

    public void setBlack(JoueurModel pBlack) {
        black = pBlack;
    }

    public boolean initializeBoardGivenPlayers() {
        if(black == null || white == null)
            return false;
        plateau = new SoloModel();
        for(int i=0; i<black.getPieces().size(); i++){
            plateau.getSpot(black.getPieces().get(i).getX(), black.getPieces().get(i).getY()).occupySpot(black.getPieces().get(i));
        }
        return true;
    }
}
