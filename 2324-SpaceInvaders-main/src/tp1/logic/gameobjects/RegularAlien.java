package tp1.logic.gameobjects;
import tp1.logic.*;
import tp1.view.Messages;
/**
*
* Class representing a regular alien
*
*/


public class RegularAlien extends AlienShip {
	
	public static int POINTS = 5;
	public static int ARMOUR = 2;

	public RegularAlien (Game game, Position pos, AlienManager alienManager) {
		super(game, pos , ARMOUR, alienManager);
		
		this.pos = new Position (pos.getCol(), pos.getRow());
		this.cyclesToMove = 0;
		life = ARMOUR;
		dir = Move.LEFT;
		this.speed = game.getLevel().getSpeed();
		this.alienManager = alienManager;

		
	}
	@Override
	protected int getArmour() {

		return ARMOUR;
	}

	@Override
	protected String getSymbol() {

		return Messages.REGULAR_ALIEN_SYMBOL;
	}

	@Override
	protected int getDamage() {

		return 0;
	}

	@Override
	protected int getPoints() {

		return POINTS;
	}


	public static  String getDescription() {
		return Messages.alienDescription(Messages.REGULAR_ALIEN_DESCRIPTION, POINTS, 0,ARMOUR);
	}


	/*
	public boolean isInFinalRow() {

		return pos.getRow() == Game.DIM_Y-1;
	}


	private boolean isInBorder() {
		
		return pos.getCol() == 0 || pos.getCol() == Game.DIM_X -1;
	}
	
	public boolean receiveAttack(UCMLaser laser) {

		this.receiveDamage(laser.DAMAGE);
		laser.onDelete();
		return this.isAlive();
	}
	
	public void receiveShockwave(){

		life--;
	}


*/


}
