package com.javarush.games.spaceinvaders.gameobjects;

import com.javarush.games.spaceinvaders.Direction;

public class Ship extends GameObject {

    public Ship(double x, double y) {
        super(x, y);
    }

    public void setStaticView(int[][] viewFrame) {
        setMatrix(viewFrame);
    }

    public void move(Direction direction, double speed) {
    }

    public Bullet fire() {
        return null;
    }

}
