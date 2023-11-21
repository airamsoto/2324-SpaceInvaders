package tp1.logic.gameobjects;

import tp1.logic.Game;
import tp1.logic.GameObjectContainer;
import tp1.logic.Move;
import tp1.view.Messages;
import tp1.logic.Position;


public class UCMShip extends  Ship {
	public static int ARMOUR =3;
	public static int DAMAGE = 1;
	private Game game;
	private int points;
	private boolean canShoot;

	

	
	public UCMShip (Game game, Position pos) {
		super(game, pos , ARMOUR);
		canShoot = true;
		points =0;
		this.game =  game;
	}

	@Override
	protected String getSymbol() {
		if(isAlive()) {
			return Messages.UCMSHIP_SYMBOL;
		} else {
			return Messages.UCMSHIP_DEAD_SYMBOL;
		}

	}
/*
	@Override
	protected String getStatus() {
		return getSymbol();
	}
*/
	@Override
	protected int getDamage() {
		return DAMAGE;
	}

	@Override
	protected int getArmour() {
		return ARMOUR;
	}

	@Override
	public void onDelete() {

	}

	@Override
	public void automaticMove() {


	}

	public void receivePoints (int points) {
	
		this.points += points;
	}

	public boolean isInFirstCol() {
	
		return this.pos.getCol() == 0;		
	}
	
	public String stateToString () {

		String aux = "OFF";
		//if(game.hasShockwave()) aux = "ON";
		return "Life: " + getLife() + "\nPoints: " + points +  "\nShockWave: " + aux + "\n";
	}


	
	public static String getDescription() {

		return Messages.ucmShipDescription(Messages.UCMSHIP_DESCRIPTION, DAMAGE, ARMOUR);
	}

	public boolean move (Move move) {
		
		Position posAux = pos.move(move);
		if(posAux.isOnBoard()) {
			this.pos = posAux;
			return true;
		} 
		return false;
	}

	public boolean shootLaser(GameObjectContainer container) {
		if(canShoot) {
			canShoot = false;
			UCMLaser laser = new UCMLaser (game, pos);
			container.add(laser);
			return true;

		} else {
			return false;
		}
	}



	/*

	public void enableLaser() {

		this.canShoot = true;
	}
	public boolean shootLaser() {
		if(canShoot) {
			canShoot = false;
			UCMLaser laser = new UCMLaser (game, pos);
			game.addObject(laser);
			return true;
			
		} else {
			return false;
		}
	}

	public boolean receiveAttack(Bomb bomb) {

		receiveDamage(bomb.getDamage());
		bomb.onDelete();
		return isAlive();
	}

*/
	
}