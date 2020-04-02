package fr.anthony.chessGame.model;

public class PositionModel {
	int x;
    int y;
    PieceModel piece;

    public PositionModel(int x, int y) {
        super();
        this.x = x;
        this.y = y;
        piece = null;
    }

    public void occupySpot(PieceModel piece){
        //if piece already here, delete it, i. e. set it dead
        if(this.piece != null)
            this.piece.setAvailable(false);
        //place piece here
        this.piece = piece;
    }

    public boolean isOccupied() {
        if(piece != null)
            return true;
        return false;
    }

    public PieceModel releaseSpot() {
        PieceModel releasedPiece = this.piece;
        this.piece = null;
        return releasedPiece;
    }
}
