package original;

import java.util.ArrayList;
import java.util.List;

public class Board {
	List<List<Tile>> tiles;
	
	Board(){
		tiles = new ArrayList<List<Tile>>();
		for(int i = 0; i < 8; i++) {
			tiles.add(new ArrayList<Tile>());
		}
		for(int col = 0; col < 8; col++) {
			for(int row = 0; row < 8; row++) {
				tiles.get(col).add(new Tile((col+row)%2));
			}
		}
		linkTiles();
	}
	
	/**
	 * Links all adjacent tiles to each tile, including tiles that are adjacent diagonally,
	 * which are stored in the localTiles field of the tile.
	 */
	private void linkTiles() {
		for(int col = 0; col < tiles.size(); col++) {
			for(int row = 0; row < tiles.get(col).size(); row++) {
				for(int y = -1; y < 2; y++) {
					for(int x = -1; x < 2; x++) {
						if(onBoard(col + x, row + y)) {
							tiles.get(col).get(row).localTiles[x+1][y+1] = tiles.get(col + x).get(row + y);
						}
					}
				}
					
			}
		}
	}
	
	/**
	 * Checks whether a position is on this board by checking it against the size of the board's 2D List.
	 * This means that positions with a null tile are still considered on the board.
	 * @param x 
	 * 			The x component of the position being checked.
	 * @param y 
	 * 			The y component of the position being checked.
	 * @return True if the position is within the bounds of the board, false otherwise.
	 */
	private boolean onBoard(int x, int y) {
		return x >= 0 && y >= 0 && x < tiles.size() && y < tiles.get(x).size();
	}
	
	public Tile getTile(int x, int y) {
		return tiles.get(x).get(y);
	}
}
