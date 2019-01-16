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
	}
	public Tile getTile(int x, int y) {
		return tiles.get(x).get(y);
	}
}
