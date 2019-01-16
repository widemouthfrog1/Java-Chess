package original;

import original.pieces.AbstractPiece;

public class Tile {
	public AbstractPiece piece;
	public Tile[][] localTiles;
	int colour;
	public boolean controlledByWhite;
	public boolean controlledByBlack;
	Tile(int colour){
		this.colour = colour;
		this.piece = null;
		this.localTiles = new Tile[3][3];
	}
	
}
