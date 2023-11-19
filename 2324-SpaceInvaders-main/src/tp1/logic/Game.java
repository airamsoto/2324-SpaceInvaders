package tp1.logic;
import java.io.PipedOutputStream;
import java.util.Random;
import tp1.logic.gameobjects.*;
import tp1.view.Messages;
import tp1.logic.*;

// TODO implementarlo
public class Game implements GameStatus, GameModel, GameWorld  {
	public static final int DIM_X = 9;
	public static final int DIM_Y = 8;
	//TODO fill your code
	private UCMShip player;
	private Level level;
	private int currentCycle;
	private Random rand;
	private long seed;
	private boolean doExit;
	private AlienManager alienManager;
	private boolean hasShockwave;
	private GameObjectContainer container;




	@Override
	public String positionToString(int x, int y) {
		Position pos =new Position (x, y);
	//	String sr = new String ("");
		return container.toString(pos);
	//	return sr;


	}

	@Override
	public String infoToString() {
		return UCMShip.getDescription() + "\n" + RegularAlien.getDescription() + "\n" + DestroyerAlien.getDescription() + "\n" + Ufo.getDescription();
	}

	@Override
	public String stateToString() {
		return player.stateToString();
	}

	@Override
	public boolean playerWin() {
		return getRemainingAliens() == 0;
	}

	@Override
	public boolean aliensWin() {
		return !player.isAlive() || alienManager.squadIsInFinalRow();
	}

	@Override
	public int getCycle() {
		return currentCycle;
	}

	@Override
	public int getRemainingAliens() {
		return alienManager.aliensLeft();
	}











	public Level getLevel() {

		return level;
	}

	public void receivePoints (int points) {

		player.receivePoints(points);
	}

	public Random getRandom() {

		return rand;
	}
	public void enableLaser() {

		//player.enableLaser();
	}
	
	public Game(Level level, long seed) {
	
		this.level = level;
		this.seed = seed;
		initGame();
	}
	private void initGame () {
		container = new GameObjectContainer();
		rand = new Random(seed);
		player = new UCMShip(this);
		container.add(player);
		alienManager = new AlienManager (this, level);
		currentCycle = 0;
		container = alienManager.initialize();
	}
	
	public void reset(){

		initGame();
	}

	/*public void addObject (UCMLaser laser) {

		this.laser = laser;

	}
	public void addObject (Bomb b) {

		bombs.add(b, this);
	}
*/





	

	
	//public void enableLaser() {

	//	player.enableLaser();
	//}
	
	public void enableShockwave() {
		hasShockwave = true;
	}

	public void getShockwave () {

		//if(!ufo.isAlive()) {
		//	hasShockwave = true;
		//}
	}
	
	public boolean hasShockwave () {

		return hasShockwave;
	}
	
	public void disableShockWave () {

		hasShockwave = false;
		
	}
	
	public boolean move (Move move) {

		return player.move(move);
	}

	public boolean shootLaser () {

		//return player.shootLaser();
		return true;
	}

	public void automaticMoves () {
		container.automaticMoves();
		/*
		if(laser != null) {
			if (laser.isAlive()) {
			laser.automaticMove();
			}
		}*/
	}

	private void computerActions() {

		//destroyerAliens.computerAction();
		//ufo.computerAction();
	}
	
	public void update () {

		this.currentCycle++;
		computerActions();
		automaticMoves();
		//if(laser != null) {
		//	this.performAttack(laser);
		//}
	//	checkAttacks(player);
	//	removeDead();
	}
	
	public void removeDead() {
		
	//	regularAliens.removeDead();
	//	destroyerAliens.removeDead();
		//bombs.removeDead();
	}
	
	public void performAttack(UCMLaser weapon) {
	//	this.regularAliens.checkAttacks(weapon);
		//this.destroyerAliens.checkAttacks(weapon);
		//checkAttacks(ufo);
		//bombs.checkAttacks(weapon);
	}

	public void shockwaveAttack () {
		
	//	regularAliens.checkShockwave();
	//	destroyerAliens.checkShockwave();
	}


	public String getInfo() {
return "";
		//return player.getInfo() + "\n" +regularAliens.getInfo() + "\n" + destroyerAliens.getInfo() + "\n" + ufo.getInfo();
	}
	
	public void checkAttacksTo(RegularAlien regularAlien) {

		//if(laser != null) laser.performAttack(regularAlien);
	}
	
	public void checkAttacksTo(DestroyerAlien destroyerAlien) {

		//if(laser != null) laser.performAttack(destroyerAlien);
	}

	public void checkAttacks(Ufo ufo) {
//
		//if (laser != null) laser.performAttack(ufo);
	}

	public void checkAttacks (UCMShip player) {

		//bombs.checkAttacks(player);
	}



	//public void receivePoints (int points) {

	//	player.receivePoints(points);
	//}


	public boolean isFinished() {
		return aliensWin() ||playerWin();
	}








	//codigo nuevo para la practica 2







}



