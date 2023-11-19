package tp1.logic;

/**
 * Represents the allowed movements in the game
 *
 */
public enum Move {
	LEFT(-1,0), LLEFT(-2,0), RIGHT(1,0), RRIGHT(2,0), DOWN(0,1), UP(0,-1), NONE(0,0);
	
	private int x;
	private int y;
	
	private Move(int x, int y) {
		
		this.x=x;
		this.y=y;
	}
	
	public int getX() {
		
		return x;
	}

	public int getY() {
		
		return y;
	}


	public static Move changeString(String words) { 
		
		Move move;
		switch (words) {
		case "left": 
			move = LEFT;
			break;
		case "lleft": 
			move = LLEFT;
			break;
		case "right": 
			move = RIGHT;
			break;
		case "rright": 
			move = RRIGHT;
			break;
		default: move = null;
		
		}
		
		 return move;
	}
	
	public Move flip () {
		
		if(this == LEFT) {
			return RIGHT;
		} else {
			return LEFT;
		}
	}
	

	
	
}
