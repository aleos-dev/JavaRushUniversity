package com.javarush.games.moonlander;

import com.javarush.engine.cell.*;

public class MoonLanderGame extends Game {
    public static final int WIDTH = 64;
    public static final int HEIGHT = 64;
    private Rocket rocket;
    private GameObject landscape;
    private boolean isUpPressed;
    private boolean isLeftPressed;
    private boolean isRightPressed;

    @Override
    public void initialize() {
        showGrid(false);
        setScreenSize(WIDTH, HEIGHT);
        createGame();
    }

    private void createGame() {
        isUpPressed = false;
        isLeftPressed = false;
        isRightPressed = false;
        setTurnTimer(50);
        createGameObjects();
        drawScene();
    }

    private void drawScene() {
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                setCellColor(x, y, Color.BLACK);
            }
        }

        rocket.draw(this);
        landscape.draw(this);
    }

    private void createGameObjects() {
        rocket = new Rocket(WIDTH / 2.0, 0);
        landscape = new GameObject(0, 25, ShapeMatrix.LANDSCAPE);

    }

    @Override
    public void onTurn(int turn) {
       rocket.move(isUpPressed, isLeftPressed, isRightPressed);
       drawScene();
    }

    @Override
    public void setCellColor(int x, int y, Color color) {
        if (x >= WIDTH || x < 0 || y >= HEIGHT || y < 0) return;
        super.setCellColor(x, y, color);
    }

    @Override
    public void onKeyPress(Key key) {
        switch(key) {
            case UP: {
                isUpPressed = true;
                break;
            }
            case LEFT: {
                isRightPressed = false;
                isLeftPressed = true;
                break;
            }
            case RIGHT: {
                isLeftPressed = false;
                isRightPressed = true;
            }
        }
    }

    @Override
    public void onKeyReleased(Key key) {
       switch (key) {
           case UP: {
               isUpPressed = false;
               break;
           }
           case LEFT: {
               isLeftPressed = false;
               break;
           }
           case RIGHT: {
               isRightPressed = false;
           }
       }
    }
}
