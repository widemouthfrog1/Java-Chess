package original.pieces;

import java.util.List;

import original.Piece;
import original.Tile;

public abstract class AbstractPiece implements Piece {

	protected Tile position;
	protected int colour;
	AbstractPiece(Tile position, int colour){
		this.position = position;
		this.colour = colour;
	}
	
	public void take(List<Piece> graveyard) {
		graveyard.add(this);
		this.position = null;
		
	}

}
