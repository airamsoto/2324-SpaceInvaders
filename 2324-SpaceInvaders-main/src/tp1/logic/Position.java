package tp1.logic;

/**
 * 
 * Immutable class to encapsulate and manipulate positions in the game board
 * 
 */
public class Position {

	private final int col;
	private final int row;

	//TODO fill your code
	
	
	public Position (int x, int y) {
		
		this.col = x;
		this.row = y;
		
	}
	public Position (Position pos) {
		
		this.col = pos.col;
		this.row = pos.row;
	}
	
	public boolean equals (Position pos) {
		
		return this.col == pos.col && this.row == pos.row;
	}

	public int getCol () {

		return this.col;
	}
	
	public int getRow () {
		
		return this.row;
	}
	
	public Position move (Move move) {
		
		return new Position (move.getX() + col, move.getY() + row);
	}
	
	public boolean isOnBoard () {
		
		return (col>=0 && col < Game.DIM_X && row >= 0 && row < Game.DIM_Y);
	}
	

	 

}
