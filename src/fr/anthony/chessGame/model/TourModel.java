package fr.anthony.chessGame.model;



import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

public class TourModel extends PieceModel{
	
	public Image tourBlack = new Image("/fr/anthony/chessGame/items/tourBlack.png");
	public Image tourWhite = new Image("/fr/anthony/chessGame/items/tourWhite.png");
	public ImageView imageView = new ImageView() ;
	
	
	public TourModel(boolean pAvailable, StackPane square, boolean color) {
		super(pAvailable, square);
		if(color == true) {
			square.getChildren().add(imageView);
			imageView.setImage(getTourBlack());
			imageView.setFitWidth(64);
			imageView.setFitHeight(64);
			imageView.setPreserveRatio(true);
			imageView.setSmooth(true);
		    imageView.setCache(true);
			
			
		}else {
			square.getChildren().add(imageView);
			imageView.setImage(getTourWhite());
			imageView.setFitWidth(64);
			imageView.setFitHeight(64);
			imageView.setPreserveRatio(true);
			imageView.setSmooth(true);
		    imageView.setCache(true);
		}
		
	}
	
	public Image getTourBlack() {
		return tourBlack;
	}
	
	public Image getTourWhite() {
		return tourWhite;
	}
}
