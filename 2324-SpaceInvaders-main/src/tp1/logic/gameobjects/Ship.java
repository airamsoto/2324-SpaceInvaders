package tp1.logic.gameobjects;

import tp1.logic.Game;
import tp1.logic.Position;
import tp1.logic.gameobjects.GameObject;

public abstract class Ship extends GameObject {
    public Ship(Game game, Position pos, int life) {

        super(game, pos, life);
    }

    @Override
    protected String getStatus() {
        return getSymbol();
    }
}
