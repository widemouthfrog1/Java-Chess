package original;

import java.util.List;

public interface Piece {

	public void move(Board board, int x, int y);
	public void captured();
	public List<Tile> availableMoves();
}
