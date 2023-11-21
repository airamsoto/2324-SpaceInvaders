package tp1.logic.gameobjects;

import tp1.logic.Game;
import tp1.logic.GameStatus;
import tp1.logic.Move;
import tp1.logic.Position;
import tp1.view.Messages;

public abstract class GameObject implements GameItem {

	protected Position pos;
	protected int life;
	protected Game game;
	
	public GameObject(Game game, Position pos, int life) {	
		this.pos = pos;
		this.game = game;
		this.life = life;
	}
	
	@Override
	public boolean isAlive() {

		return this.life > 0;
	}

	protected int getLife() {

		return this.life;
	}

	@Override
	public boolean isOnPosition(Position pos) {

		return this.pos.equals(pos);
	}
	@Override
	public String toString (Position pos) {

		if(isOnPosition(pos)) {
			return getStatus();

		} else {
			return "";
		}

	}
	protected void die () {

		life = 0;
	}
	public void performMovement (Move dir) {

		Position posAux = pos.move(dir);
	}

	public  void receiveDamage(int damage) {
		life-=damage;
	}

	//public boolean isOnBoard() {
	//	return (pos <= Game.DIM_X && pos >= 0 && pos )
	//}



	
	protected abstract String getSymbol();
	protected abstract String getStatus();
	protected abstract int getDamage();
	protected abstract int getArmour();

	
			
	public abstract void onDelete();
	public abstract void automaticMove();
	public void computerAction() {



	};
	
	//TODO fill with your code
	
	@Override
	public boolean performAttack(GameItem other) {return false;}
	
	@Override
	public boolean receiveAttack(EnemyWeapon weapon) {return false;}

	@Override
	public boolean receiveAttack(UCMWeapon weapon) {return false;}

}
