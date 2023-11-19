package tp1.logic.gameobjects;

import tp1.logic.AlienManager;
import tp1.logic.Game;
import tp1.logic.Move;
import tp1.logic.Position;

public abstract class AlienShip extends EnemyShip {

    protected AlienManager alienManager;

    public AlienShip(Game game, Position pos, int life, AlienManager alienManager) {
        super(game, pos, life);
        this.alienManager = alienManager;
        cyclesToMove = 0;
        speed = game.getLevel().getSpeed();
        dir = Move.LEFT;
    }
    public void descent() {

        alienManager.decreaseOnBorder();
        pos = pos.move(Move.DOWN);
        dir = dir.flip();
        //game.checkAttacksTo(this);

    }
    public void onDelete() {
        alienManager.eliminated();
        game.receivePoints(getPoints());
    }
    public void automaticMove() {
        if(this.cyclesToMove == game.getLevel().getSpeed()) {
            performMovement(dir);
            this.cyclesToMove = 0;
            if(pos.isOnBoard()) alienManager.shipOnBorder();
        }
        else if(this.alienManager.onBorder()) {
            descent();
            if(isInFinalRow()) alienManager.arrive();
        }
        else this.cyclesToMove++;

    }

    public boolean isInFinalRow() {

        return this.pos.getRow() == Game.DIM_Y -1;
    }

}
