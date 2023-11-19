package tp1.logic.gameobjects;
import tp1.logic.*;
import tp1.view.*;


public class DestroyerAlien extends AlienShip {
	public static int DAMAGE = 1;
	public static int POINTS = 10;
	public static int ARMOUR  = 1;

	private boolean canShoot;
	private boolean bomReady;


	
	public DestroyerAlien (Game game, Position pos, AlienManager alienManager) {
		super(game, pos, ARMOUR, alienManager);
		this.pos = new Position (pos.getCol(), pos.getRow());
		life = ARMOUR;
		this.alienManager = alienManager;
		canShoot = true;
		bomReady = false;
	}

	@Override
	protected String getSymbol() {

		return Messages.DESTROYER_ALIEN_SYMBOL;
	}

	@Override
	protected int getDamage() {

		return DAMAGE;
	}

	@Override
	protected int getArmour() {

		return ARMOUR;
	}

	/*public void computerAction() {

		if( canShoot && cyclesToMove != speed && isBomReady()) {
			Bomb bomb = new Bomb(game, pos, this);
			canShoot = false;
			//game.addObject(bomb);
		}

	}*/
	
	/*public boolean isInFinalRow() {

		return this.pos.getRow() == Game.DIM_Y -1;
	}*/
	


	public String toString (Position pos) {
		
		if(isOnPosition(pos)) {
			return Messages.status(getSymbol(), life);
		} else {
			return "";
		}
			
	}

	@Override
	protected int getPoints() {
		return POINTS;
	}

	public static String getDescription() {
		return  Messages.alienDescription(Messages.DESTROYER_ALIEN_DESCRIPTION, POINTS, 0,ARMOUR);
	}

	public boolean isBomReady () {
		
		bomReady = game.getRandom().nextDouble() < game.getLevel().getShootFrequency();
		return bomReady;
		
	}
	public void enable() {

		canShoot = true;
	}


	/*public boolean receiveAttack(UCMLaser laser) {

		this.receiveDamage(laser.DAMAGE);
		laser.onDelete();
		return isAlive(); 
	}

	public void receiveShockwave(){
		
		life--;
	}
	
*/
	

}
