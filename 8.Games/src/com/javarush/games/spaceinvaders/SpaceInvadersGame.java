package com.javarush.games.spaceinvaders;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Key;
import com.javarush.games.spaceinvaders.gameobjects.Bullet;
import com.javarush.games.spaceinvaders.gameobjects.EnemyFleet;
import com.javarush.games.spaceinvaders.gameobjects.PlayerShip;
import com.javarush.games.spaceinvaders.gameobjects.Star;

import java.util.ArrayList;
import java.util.List;

import static com.javarush.games.spaceinvaders.Direction.*;

public class SpaceInvadersGame extends Game {
    public static final int WIDTH = 64;
    public static final int HEIGHT = 64;
    public static final int COMPLEXITY = 5;
    private static final int PLAYER_BULLETS_MAX = 1;

    private List<Star> stars;
    private EnemyFleet enemyFleet;
    private List<Bullet> enemyBullets;
    private PlayerShip playerShip;
    private boolean isGameStopped;
    private int animationsCount;
    private List<Bullet> playerBullets;
    private int score;


    @Override
    public void initialize() {
        setScreenSize(WIDTH, HEIGHT);
        createGame();
    }

    @Override
    public void onTurn(int step) {
        moveSpaceObjects();
        check();
        setScore(score);
        Bullet bullet = enemyFleet.fire(this);
        if (bullet != null) {
            enemyBullets.add(bullet);
        }
        drawScene();
    }

    @Override
    public void onKeyPress(Key key) {
        if (isGameStopped && key == Key.SPACE) {
            createGame();
        } else if (key == Key.LEFT) {
            if (playerShip.getDirection() == LEFT) {
                playerShip.setDirection(UP);
            } else {
                playerShip.setDirection(LEFT);
            }
        } else if (key == Key.RIGHT) {
            if (playerShip.getDirection() == RIGHT) {
                playerShip.setDirection(UP);
            } else {
                playerShip.setDirection(RIGHT);
            }
        } else if (key == Key.SPACE) {
            Bullet shot = playerShip.fire();
            if (shot != null && playerBullets.size() < PLAYER_BULLETS_MAX) {
                playerBullets.add(shot);
            }
        }
    }

    @Override
    public void onKeyReleased(Key key) {
        if (Key.LEFT == key && playerShip.getDirection() == Direction.LEFT) {
            playerShip.setDirection(Direction.UP);
        }
        if (Key.RIGHT == key && playerShip.getDirection() == Direction.RIGHT) {
            playerShip.setDirection(Direction.UP);
        }
    }

    private void createGame() {
        createStars();
        score = 0;
        isGameStopped = false;
        animationsCount = 0;
        enemyFleet = new EnemyFleet();
        enemyBullets = new ArrayList<>();
        playerBullets = new ArrayList<>();
        playerShip = new PlayerShip();
        drawScene();
        setTurnTimer(40);
    }

    private void drawScene() {

        drawField();
        playerShip.draw(this);
        enemyFleet.draw(this);

        for (Bullet bullet : enemyBullets) {
            bullet.draw(this);
        }

        for (Bullet bullet : playerBullets) {
            bullet.draw(this);
        }
    }

    private void drawField() {
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++)
                setCellValueEx(x, y, Color.BLACK, "");
        }

        for (Star star : stars) {
            star.draw(this);
        }
    }

    private void createStars() {
        stars = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            stars.add(new Star((5 + i * 37) / 64, (17 + i * 19) / 64));
        }
    }

    private void moveSpaceObjects() {
        enemyFleet.move();
        playerShip.move();

        for (Bullet bullet : enemyBullets) {
            bullet.move();
        }

        for (Bullet bullet : playerBullets) {
            bullet.move();
        }
    }

    private void stopGame(boolean isWin) {
        isGameStopped = true;
        stopTurnTimer();
        if (isWin) {
            showMessageDialog(Color.BLUE, "WIN", Color.GREEN, 100);
        } else {
            showMessageDialog(Color.BLUE, "WIN", Color.RED, 100);
        }
    }

    private void stopGameWithDelay() {
        animationsCount++;
        if (animationsCount >= 10) {
            stopGame(playerShip.isAlive);
        }
    }

    private void removeDeadBullets() {

        for (int i = 0; i < enemyBullets.size(); i++) {

            Bullet bullet = enemyBullets.get(i);
            if (!bullet.isAlive || bullet.y >= HEIGHT - 1) {
                enemyBullets.remove(bullet);
            }
        }

        for (Bullet bullet : new ArrayList<>(playerBullets)) {
            if (!bullet.isAlive || bullet.y + bullet.height < 0) {
                playerBullets.remove(bullet);
            }
        }
    }

    private void check() {
        playerShip.verifyHit(enemyBullets);
        score += enemyFleet.verifyHit(playerBullets);
        enemyFleet.deleteHiddenShips();
        if (enemyFleet.getBottomBorder() >= playerShip.y) {
            playerShip.kill();
        }
        if (enemyFleet.getShipsCount() == 0) {
            playerShip.win();
            stopGameWithDelay();
        }
        removeDeadBullets();
        if (!playerShip.isAlive) {
            stopGameWithDelay();
        }
    }

    @Override
    public void setCellValueEx(int x, int y, Color color, String value) {
        if (x < 0 || y < 0 || x >= WIDTH || y >= HEIGHT) {
            return;
        }

        super.setCellValueEx(x, y, color, value);
    }

}
