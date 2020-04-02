package fr.anthony.chessGame.model;

public class SoloModel {
	
	private PositionModel[][] position = new PositionModel[8][8];

    public SoloModel() {
        
        for(int i=0; i<position.length; i++){
            for(int j=0; j<position.length; j++){
                this.position[i][j] = new PositionModel(i, j);
            }
        }
    }

    public PositionModel getSpot(int x, int y) {
        return position[x][y];
    }
}
 