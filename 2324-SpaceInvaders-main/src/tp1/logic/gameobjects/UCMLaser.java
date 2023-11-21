package tp1.logic.gameobjects;

import tp1.logic.Game;

import tp1.logic.Move;
import tp1.logic.Position;
import tp1.view.*;
/**
 * 
 * Class that represents the laser fired by {@link UCMShip}
 *
 */
public class UCMLaser extends UCMWeapon {
	public static int DAMAGE = 1;
	public static int ARMOUR = 3;

	private Move dir;

	

	public UCMLaser (Game game, Position pos) {
		super(game, pos, ARMOUR);
		dir = Move.UP;
		life = ARMOUR;
	}

	@Override
	protected String getSymbol() {
		return Messages.LASER_SYMBOL;
	}


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
		game.enableLaser();
		die();

	}

	@Override
	public void automaticMove() {
		performMovement(dir);
		if(isOut()) {
			die();
			onDelete();
		}
	}

	@Override
	protected boolean isOut() {
		return pos.getRow() < 0;
	}


	/**
	 * Method that implements the attack by the laser to a regular alien.
	 * It checks whether both objects are alive and in the same position.
	 * If so call the "actual" attack method {@link weaponAttack}.
	 * @param other the regular alien possibly under attack
	 * @return <code>true</code> if the alien has been attacked by the laser.
	 */
	/*public boolean performAttack(RegularAlien other) {
		if(other.isAlive() && this.isAlive() && this.pos.equals(other.getPosition())) {
			weaponAttack(other);
			return true;
		} else {
			return false;
		}
	}*/

	/**
	 * Method that implements the attack by the laser to a destroyer alien.
	 * It checks whether both objects are alive and in the same position.
	 * If so call the "actual" attack method {@link weaponAttack}.
	 * @param other the destroyer alien possibly under attack
	 * @return <code>true</code> if the alien has been attacked by the laser.
	 */

	
	/*public boolean performAttack(DestroyerAlien other) {
		//TODO fill your code
		if(other.isAlive() && this.isAlive() &&  other.isOnPosition(this.pos)) {   //this.pos.equals(other.getPosition())){ CAMBIO DEL GET
			weaponAttack(other);
			return true;
		} else {
			return false;
		}
	}

	public boolean performAttack (Ufo other) {
		if(other.isAlive() && this.isAlive() && other.isOnPosition(this.pos)){
			weaponAttack(other);
			return true;
		} else {
			return false;
		}
	}

	public boolean performAttack (Bomb other) {
		Position aux = new Position(pos.getCol(), (pos.getRow())+1);
		if(other.isAlive() && this.isAlive() && (other.isOnPosition(this.pos) || other.isOnPosition(aux))) { //ASI MEJOR QUE EL GETPOS
			weaponAttack(other);
			return true;
		} else {
			return false;
		}
	}
	*/
	
	//TODO fill your code


	//ACTUAL ATTACK METHODS
	

	/**
	 * 
	 * @param other regular alien under attack by the laser
	 * @return always returns <code>true</code>
	 */
	/*private boolean weaponAttack(RegularAlien other) {

		return other.receiveAttack(this);
	}
	private boolean weaponAttack(DestroyerAlien other) {

		return other.receiveAttack(this);
	}
	private boolean weaponAttack (Ufo ufo) {

		return ufo.receiveAttack(this);
	}

	private boolean weaponAttack (Bomb bomb) {

		return bomb.receiveAttack(this);

	}*/

	//TODO fill your code


	// RECEIVE ATTACK METHODS
	
	/**
	 * Method to implement the effect of bomb attack on a laser
	 * @param weapon the received bomb
	 * @return always returns <code>true</code>
	 */



}