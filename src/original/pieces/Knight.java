package original.pieces;

import original.Board;
import original.Tile;

public class Knight extends AbstractPiece {
	
	Knight(Tile position) {
		super(position);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move(Board board, int x, int y) {
		// TODO Auto-generated method stub
		board.getTile(x, y);
	}

	@Override
	public void captured() {
		// TODO Auto-generated method stub

	}

}
