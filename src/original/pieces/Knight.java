package original.pieces;

import java.util.List;

import original.Board;
import original.Tile;

public class Knight extends AbstractPiece {
	
	Knight(Tile position, int colour) {
		super(position, colour);
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

	@Override
	public List<Tile> availableMoves() {
		// TODO Auto-generated method stub
		return null;
	}

}
