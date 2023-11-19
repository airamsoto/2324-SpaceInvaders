package tp1.logic.gameobjects;

import tp1.logic.Game;

import tp1.logic.Move;
import tp1.logic.Position;
import tp1.view.*;


public class Bomb extends EnemyWeapon {
	public static int DAMAGE = 1;
	public static int ARMOUR = 1;
	
	private Move dir;
	private DestroyerAlien destroyerAlien;

	
	public Bomb (Game game, Position pos, DestroyerAlien destroyerAlien) {
		super(game, pos, ARMOUR);
		dir = Move.DOWN;
		life = ARMOUR;
		this.destroyerAlien = destroyerAlien;
	}

	@Override
	protected String getSymbol() {
		return Messages.BOMB_SYMBOL;
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
		destroyerAlien.enable();
	}

	@Override
	public void automaticMove() {
		performMovement(dir);
		if(destroyerAlien.isOnPosition(this.pos)) { //Mejor sin el getPos
			//isOnPosition(destroyerAlien.getPosition()
			performMovement(dir);
		}
		if(isOut()) {
			die();
			onDelete();
		}
	}

	@Override
	protected boolean isOut() {
		return pos.getRow() >= Game.DIM_Y;
	}




	public boolean performAttack(UCMShip player) {
		if(player.isAlive() && this.isAlive() && player.isOnPosition(this.pos)) { //ASI MEJOR QUE EL GETPOSITIOM
			weaponAttack(player);
			die();
			return true;

		} else {
			return false;

		}
	}
	 private boolean weaponAttack (UCMShip player) {

	//	return player.receiveAttack(this);
		 return true;
	 }

	public boolean receiveAttack (UCMLaser laser) {

		receiveDamage(laser.getDamage());
		laser.onDelete();
		return true;
	}




}