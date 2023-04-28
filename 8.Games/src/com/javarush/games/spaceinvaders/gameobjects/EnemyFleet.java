package com.javarush.games.spaceinvaders.gameobjects;

import com.javarush.engine.cell.Game;
import com.javarush.games.spaceinvaders.Direction;
import com.javarush.games.spaceinvaders.ShapeMatrix;
import com.javarush.games.spaceinvaders.SpaceInvadersGame;

import java.util.ArrayList;
import java.util.List;

import static com.javarush.games.spaceinvaders.Direction.*;

public class EnemyFleet {
    private static final int ROWS_COUNT = 3;
    private static final int COLUMNS_COUNT = 10;
    private static final int STEP = ShapeMatrix.ENEMY.length + 1;
    private List<EnemyShip> ships;
    private Direction direction = RIGHT;

    public EnemyFleet() {
        createShips();
    }

    public void draw(Game game) {
        for (Ship ship : ships) {
            ship.draw(game);
        }
    }

    public void move() {
        if (ships.isEmpty()) return;

        Direction shipDirection = DOWN;
        if (direction == LEFT && getLeftBorder() < 0) {
            direction = RIGHT;
        } else if (direction == RIGHT && getRightBorder() > SpaceInvadersGame.WIDTH) {
            direction = LEFT;
        } else {
            shipDirection = direction;
        }

        for (Ship ship : ships) {
            ship.move(shipDirection, getSpeed());
        }

    }

    public Bullet fire(Game game)
    {
        if (ships.isEmpty()) return null;

        int rnd = game.getRandomNumber(100 / SpaceInvadersGame.COMPLEXITY);
        if (rnd > 0) return null;

        int index = game.getRandomNumber(ships.size());
        
        return ships.get(index).fire();
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
