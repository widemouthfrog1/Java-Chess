package original.pieces;

import java.util.List;

import original.Piece;
import original.Tile;

public abstract class AbstractPiece implements Piece {

	Tile position;
	AbstractPiece(Tile position){
		this.position = position;
	}
	
	public void take(List<Piece> graveyard) {
		this.position = null;
		graveyard.add(this);
	}

}
