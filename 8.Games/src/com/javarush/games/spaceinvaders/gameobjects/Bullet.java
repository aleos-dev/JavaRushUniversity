package com.javarush.games.spaceinvaders.gameobjects;

import com.javarush.games.spaceinvaders.Direction;
import com.javarush.games.spaceinvaders.ShapeMatrix;

import static com.javarush.games.spaceinvaders.Direction.UP;

public class Bullet extends GameObject{

    private int dy;
    public boolean isAlive = true;

    public Bullet(double x, double y, Direction direction) {
        super(x, y);
        setMatrix(ShapeMatrix.BULLET);

        dy = direction == UP ? -1 : 1;
    }

    public void move() {
        y += dy;
    }


}
