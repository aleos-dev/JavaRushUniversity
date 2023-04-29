package com.javarush.games.spaceinvaders.gameobjects;

import com.javarush.games.spaceinvaders.Direction;
import com.javarush.games.spaceinvaders.ShapeMatrix;
import com.javarush.games.spaceinvaders.SpaceInvadersGame;

import java.util.List;

import static com.javarush.games.spaceinvaders.Direction.LEFT;
import static com.javarush.games.spaceinvaders.Direction.RIGHT;

public class PlayerShip extends Ship {

    private Direction direction = Direction.UP;

    public PlayerShip() {
        super(SpaceInvadersGame.WIDTH / 2,
                SpaceInvadersGame.HEIGHT - ShapeMatrix.PLAYER.length - 1);
        setStaticView(ShapeMatrix.PLAYER);
    }

    public void verifyHit(List<Bullet> bullets) {

        if (bullets.isEmpty()) {
            return;
        }

        for (Bullet bullet : bullets) {
            if (isAlive && bullet.isAlive && isCollision(bullet)) {
                kill();
                bullet.kill();
            }
        }
    }

    public void move() {
        if (!isAlive) {
            return;
        }

        if (direction == LEFT) {
            x--;
        } else if (direction == RIGHT) {
            x++;
        }

        x = x < 0 ? 0 :
                x + width > SpaceInvadersGame.WIDTH ? SpaceInvadersGame.WIDTH - width : x;

    }

    @Override
    public Bullet fire() {
        if (!isAlive) {
            return null;
        }

        return new Bullet(x + 2, y - ShapeMatrix.BULLET.length, Direction.UP);
    }

    @Override
    public void kill() {
        if (!isAlive) {
            return;
        }

        isAlive = false;
        setAnimatedView(false,
                ShapeMatrix.KILL_PLAYER_ANIMATION_FIRST,
                ShapeMatrix.KILL_PLAYER_ANIMATION_SECOND,
                ShapeMatrix.KILL_PLAYER_ANIMATION_THIRD,
                ShapeMatrix.DEAD_PLAYER
        );
    }

    public void win() {
        setStaticView(ShapeMatrix.WIN_PLAYER);
    }

    public void setDirection(Direction newDirection) {
        if (newDirection == Direction.DOWN) {
            return;
        }
        direction = newDirection;
    }

    public Direction getDirection() {
        return direction;
    }

}
