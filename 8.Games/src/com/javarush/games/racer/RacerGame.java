package com.javarush.games.racer;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Key;
import com.javarush.games.racer.road.RoadManager;

public class RacerGame extends Game {
    public static final int WIDTH = 64;
    public static final int HEIGHT = 64;
    public static final int ROADSIDE_WIDTH = 14;
    public static final int CENTER_X = WIDTH / 2;
    private static final int RACE_GOAL_CARS_COUNT = 40;
    private RoadMarking roadMarking;
    private RoadManager roadManager;
    private PlayerCar player;
    private boolean isGameStopped;
    private FinishLine finishLine;
    private ProgressBar progressBar;
    private int score;

    @Override
    public void initialize() {
        showGrid(false);
        setScreenSize(WIDTH, HEIGHT);
        createGame();
    }


    private void createGame() {
        roadMarking = new RoadMarking();
        roadManager = new RoadManager();
        player = new PlayerCar();
        isGameStopped = false;
        finishLine = new FinishLine();
        progressBar = new ProgressBar(RACE_GOAL_CARS_COUNT);
        drawScene();
        setTurnTimer(40);
        score = 3500;
    }

    private void drawScene() {
        drawField();
        progressBar.draw(this);
        roadMarking.draw(this);
        roadManager.draw(this);
        player.draw(this);
        finishLine.draw(this);
    }

    private void drawField() {
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                if (x == CENTER_X) {
                    setCellColor(x, y, Color.WHITE);
                } else if (x >= ROADSIDE_WIDTH && x < WIDTH - ROADSIDE_WIDTH) {
                    setCellColor(x, y, Color.DIMGREY);
                } else {
                    setCellColor(x, y, Color.GREEN);
                }
            }
        }

    }

    private void gameOver() {
        isGameStopped = true;
        showMessageDialog(Color.RED, "GameOver!", Color.GREEN, 75);
        stopTurnTimer();
        player.stop();
    }

    @Override
    public void setCellColor(int x, int y, Color color) {
        if (x < 0 || y < 0 || x >= WIDTH || y >= HEIGHT) {
            return;
        }

        super.setCellColor(x, y, color);
    }

    private void moveAll() {
        roadMarking.move(player.speed);
        roadManager.move(player.speed);
        player.move();
        finishLine.move(player.speed);
        progressBar.move(roadManager.getPassedCarsCount());
    }

    @Override
    public void onTurn(int step) {
        if (roadManager.checkCrush(player)) {
            gameOver();
            drawScene();
        } else {
            if (roadManager.getPassedCarsCount() >= RACE_GOAL_CARS_COUNT) {
                finishLine.show();
            }
            if (finishLine.isCrossed(player)) {
                win();

            } else {
                moveAll();
                roadManager.generateNewRoadObjects(this);
                score -= 5;
                setScore(score);
            }
            drawScene();
        }

    }

    @Override
    public void onKeyPress(Key key) {
        if (isGameStopped && key == Key.SPACE) {
            createGame();
            return;
        }
        if (key == Key.UP) {
            player.speed = player.speed == 1 ? 2 : 1;
        }
        if (key == Key.RIGHT) {
            player.setDirection(Direction.RIGHT);
        }
        if (key == Key.LEFT) {
            player.setDirection(Direction.LEFT);
        }
    }

    @Override
    public void onKeyReleased(Key key) {
        if (key == Key.RIGHT && player.getDirection() == Direction.RIGHT) {
            player.setDirection(Direction.NONE);
        }
        if (key == Key.LEFT && player.getDirection() == Direction.LEFT) {
            player.setDirection(Direction.NONE);
        }
    }

    private void win() {
        isGameStopped = true;
        showMessageDialog(Color.BLACK, "YOU WIN", Color.GREEN, 75);
        stopTurnTimer();
    }
}
