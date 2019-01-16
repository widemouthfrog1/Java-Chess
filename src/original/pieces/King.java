package original.pieces;

import java.util.ArrayList;
import java.util.List;

import original.Board;
import original.Tile;

public class King extends AbstractPiece {

	King(Tile position, int colour) {
		super(position, colour);
	}

	@Override
	public void move(Board board, int x, int y) {
		// TODO Auto-generated method stub

	}

	@Override
	public void captured() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Tile> availableMoves() {
		List<Tile> availableMoves = new ArrayList<Tile>();
		for (int x = -1; x < 2; x++) {
			for (int y = -1; y < 2; y++) {
				if (x != 0 || y != 0) {
					if (this.colour == 1) {
						if (this.position.localTiles[x + 1][y + 1] != null) {
							if (!this.position.localTiles[x + 1][y + 1].controlledByBlack
									&& (this.position.localTiles[x + 1][y + 1].piece == null
											|| this.position.localTiles[x + 1][y + 1].piece.colour == 0)) {
								availableMoves.add(this.position.localTiles[x + 1][y + 1]);
							}
						}
					} else {
						if (this.position.localTiles[x + 1][y + 1] != null) {
							if (!this.position.localTiles[x + 1][y + 1].controlledByWhite
									&& (this.position.localTiles[x + 1][y + 1].piece == null
											|| this.position.localTiles[x + 1][y + 1].piece.colour == 1)) {
								availableMoves.add(this.position.localTiles[x + 1][y + 1]);
							}
						}
					}
				}
			}
		}
		return availableMoves;
	}

}
