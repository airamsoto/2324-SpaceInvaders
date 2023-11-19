package tp1.logic;

import tp1.logic.gameobjects.*;
import tp1.logic.gameobjects.GameItem;



/**
 * 
 * Manages alien initialization and
 * used by aliens to coordinate movement
 *
 */
public class AlienManager {
	
	private Level level;
	private Game game;
	private int remainingAliens;
	private boolean squadInFinalRow;
	private int shipsOnBorder;
	private boolean onBorder;
	

	public GameObjectContainer initialize () {
		GameObjectContainer container = new GameObjectContainer();
		initializeOvni(container);



		return container;
	}
	private void initializeOvni(GameObjectContainer container) {
		//hay que ver lo del constructor del ufo
		// container.add(new Ufo(game));
	}

	public AlienManager(Game game, Level level) {
		
		this.level = level;
		this.game = game;
		remainingAliens = 0;
		onBorder = false;
		shipsOnBorder = 0;
	} 
	
	//CONSTRUCTOR CON LAS LISTAS?
		
	// INITIALIZER METHODS 
	
	
	/**
	 * Initializes the list of regular aliens
	 * @return the initial list of regular aliens according to the current level
	 */
	/*protected RegularAlienList initializeRegularAliens() {

		RegularAlienList regularAlienList = new RegularAlienList(level.getRegularAliens());
		remainingAliens+=level.getRegularAliens();
		for(int j=0; j< level.getnumRowsRegularAliens(); j++) {
			for (int i = 0; i < level.getRegularAliens() / level.getnumRowsRegularAliens(); i++) {
	
			RegularAlien regularAlien = new RegularAlien (game, new Position (i+2, 1+j), this);
			regularAlienList.add(regularAlien);
			}
		}
		return regularAlienList;
	}
	
	/**
	 * Initializes the list of destroyer aliens
	 * @return the initial list of destroyer aliens according to the current level
	 */
	/*protected  DestroyerAlienList initializeDestroyerAliens() {

		DestroyerAlienList destroyerAlienList = new DestroyerAlienList(level.getDestroyerAliens());
		remainingAliens+=level.getDestroyerAliens();
		for (int i = 0; i < level.getDestroyerAliens(); i++) {
			DestroyerAlien destroyerAlien = new DestroyerAlien (game, new Position (i+((Game.DIM_X+1)/(level.getDestroyerAliens()+1)), level.getnumRowsRegularAliens()+1), this);
			destroyerAlienList.add(destroyerAlien);
		}
		return destroyerAlienList;
	}
	*/


	// CONTROL METHODS
	public void decreaseOnBorder() {

		shipsOnBorder--;
		if(shipsOnBorder == 0) {
			onBorder = false;
		}
		
	}
		
	public void shipOnBorder() {

		if(!onBorder) {
			onBorder = true;
			shipsOnBorder = remainingAliens;
		}
	}

	public boolean onBorder() {

		return onBorder;
	}

	public void eliminated () {
		
		remainingAliens--;
	}
	

	
	public int aliensLeft() {

		return remainingAliens;
	}

	public void arrive() {

		squadInFinalRow = true;
	}

	public boolean squadIsInFinalRow () {
		return squadInFinalRow;
	}





}
