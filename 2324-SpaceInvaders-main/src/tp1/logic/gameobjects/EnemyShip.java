package tp1.logic.gameobjects;

import tp1.logic.Game;
import tp1.logic.Move;
import tp1.logic.Position;
import tp1.view.Messages;

public abstract class EnemyShip extends Ship {
    protected Move dir;
    protected int cyclesToMove;
    protected int speed;
    public EnemyShip(Game game, Position pos, int life) {
        super(game, pos, life);
        cyclesToMove = 0;
        this.dir = dir.LEFT;
    }
    protected abstract int getPoints();

    @Override
    protected String getStatus() {
        return Messages.status(getSymbol(), life);
    }
}
