package tp1.logic.gameobjects;

import tp1.logic.Position;
import tp1.logic.*;

public interface GameItem {
	
	
	public boolean performAttack(GameItem other);
	
	public boolean receiveAttack(EnemyWeapon weapon);
	public boolean receiveAttack(UCMWeapon weapon);

	public boolean isAlive();
	public boolean isOnPosition(Position pos);



	public String toString (Position pos);
	public void performMovement (Move dir);

}
