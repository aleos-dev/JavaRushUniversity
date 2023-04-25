package com.javarush.games.spaceinvaders.gameobjects;

import com.javarush.engine.cell.Game;
import com.javarush.games.spaceinvaders.Direction;
import com.javarush.games.spaceinvaders.ShapeMatrix;

import java.util.ArrayList;
import java.util.List;

public class EnemyFleet {
    private static final int ROWS_COUNT = 3;
    private static final int COLUMNS_COUNT = 10;
    private static final int STEP = ShapeMatrix.ENEMY.length + 1;
    private List<EnemyShip> ships;
    private Direction direction = Direction.RIGHT;

    public EnemyFleet() {
        createShips();
    }

    public void draw(Game game) {
        for (Ship ship : ships) {
            ship.draw(game);
        }
    }

    public void move() {

    }

    private double getLeftBorder() {
        double leftBorder = ships.get(0).x;
        for (Ship ship : ships) {
            if (ship.x < leftBorder) {
                leftBorder = ship.x;
            }
        }
        return leftBorder;
    }

    private double getRightBorder() {
        double rightBorder = 0;
        for (Ship ship : ships) {
            if (ship.x + ship.width > rightBorder) {
                rightBorder = ship.x + ship.width;
            }
        }
        return rightBorder;

    }

    private void createShips() {
        ships = new ArrayList<>();

        for (int y = 0; y < ROWS_COUNT; y++) {
            for (int x = 0; x < COLUMNS_COUNT; x++) {
                ships.add(new EnemyShip(x * STEP, y * STEP + 12));
            }
        }
    }

    private double getSpeed() {
        return Math.min(2.0, 3.0 / ships.size());
    }
}
