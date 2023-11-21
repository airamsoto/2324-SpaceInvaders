package tp1.logic.gameobjects;

import tp1.logic.*;
import tp1.view.Messages;


public class Ufo extends EnemyShip {

	//TODO fill your code

	private boolean enabled;
	public static int POINTS = 25;
	public static int ARMOUR  = 1;

	public  Ufo (Game game){
		super(game, new Position (Game.DIM_X,0), ARMOUR);
		this.speed = game.getLevel().getSpeed();
		dir = Move.LEFT;
		life = ARMOUR;
		cyclesToMove = 0;
		enabled = false;

		
	}

	@Override
	protected int getPoints() {

		return POINTS;
	}


	public static String getDescription() {
		return Messages.alienDescription(Messages.UFO_DESCRIPTION, POINTS, 0, ARMOUR);
	}

	@Override
	protected String getSymbol() {

		return Messages.UFO_SYMBOL;
	}

	@Override
	protected int getDamage() {

		return 0;
	}

	@Override
	protected int getArmour() {
		return ARMOUR;
	}

	@Override
	public void onDelete() {
		enabled = false;
		pos = new Position(Game.DIM_X,0);

	}

	@Override
	public void automaticMove() {
		//game.checkAttacks(this);
		if(enabled) {
			performMovement(dir);
			if(pos.getCol() < 0) {
				onDelete();
			}
		}

	}
	private void enable() {

		enabled = true;
	}

	private boolean canGenerateRandomUfo(){

		return game.getRandom().nextDouble() < game.getLevel().getUfoFrequency();
	}
	/*
	
	public void computerAction() {
		
		if(!enabled && canGenerateRandomUfo()) {
			enable();
			life = ARMOUR;
		}
	}

	public boolean receiveAttack(UCMLaser laser) {

		receiveDamage(laser.getDamage());
		laser.onDelete();
		onDelete();
		game.receivePoints(getPoints());
		game.enableShockwave();
		return isAlive();
	}
	




*/
	/**
	 * Checks if the game should generate an ufo.
	 * 
	 * @return <code>true</code> if an ufo should be generated.
	 */

	
}