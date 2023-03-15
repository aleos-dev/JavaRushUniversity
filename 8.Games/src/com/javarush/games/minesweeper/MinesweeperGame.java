package com.javarush.games.minesweeper;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

import java.util.ArrayList;
import java.util.List;

public class MinesweeperGame extends Game {
    private static final int SIDE = 9;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];
    private int countMinesOnField;
    private static final String MINE = "💣";
    private static final String FLAG = "\uD83D\uDEA9";
    private int countFlags;
    private int countClosedTiles = SIDE*SIDE;
    private int score;


    private boolean isGameStopped;

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
    }

    private void createGame() {
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                boolean isMine = getRandomNumber(10) < 1;
                if (isMine) {
                    countMinesOnField++;
                }
                gameField[y][x] = new GameObject(x, y, isMine);
                setCellColor(x, y, Color.ORANGE);
                setCellValue(x, y, "");
            }
        }
        countMineNeighbors();
        countFlags = countMinesOnField;
    }

    private List<GameObject> getNeighbors(GameObject gameObject) {
        List<GameObject> result = new ArrayList<>();
        for (int y = gameObject.y - 1; y <= gameObject.y + 1; y++) {
            for (int x = gameObject.x - 1; x <= gameObject.x + 1; x++) {
                if (y < 0 || y >= SIDE) {
                    continue;
                }
                if (x < 0 || x >= SIDE) {
                    continue;
                }
                if (gameField[y][x] == gameObject) {
                    continue;
                }
                result.add(gameField[y][x]);
            }
        }
        return result;
    }

    private void countMineNeighbors() {
        for (int x = 0; x < SIDE; x++) {
            for (int y = 0; y < SIDE; y++) {
                GameObject currentObject = gameField[x][y];
                if (currentObject.isMine) {
                    continue;
                }
                for (GameObject checkingObject : getNeighbors(currentObject)) {
                    if (checkingObject.isMine) {
                        currentObject.countMineNeighbors++;
                    }
                }
            }
        }
    }

    private void openTile(int x, int y) {
        if (gameField[y][x].isOpen == true || isGameStopped || gameField[y][x].isFlag) {
            return;
        } else {
            gameField[y][x].isOpen = true;
            countClosedTiles--;
            if (gameField[y][x].isFlag) {
                gameField[y][x].isFlag = false;
                countFlags++;
            }
        }
        setCellColor(x, y, Color.GREEN);
        if (gameField[y][x].isMine) {
                setCellValueEx(x, y, Color.RED, MINE);
                gameOver();
        } else {
            if (countClosedTiles == countMinesOnField) win();
            score += 5;
            setScore(score);
            int mineAround = gameField[y][x].countMineNeighbors;
            if (mineAround == 0) {
                setCellValue(x, y, "");
                List<GameObject> neighbors = getNeighbors(gameField[y][x]);
                for (int i = 0; i < neighbors.size(); i++) {
                    openTile(neighbors.get(i).x, neighbors.get(i).y);
                }
            } else {
                setCellNumber(x, y, mineAround);
            }
        }
    }

    @Override
    public void onMouseLeftClick(int x, int y) {
        if (isGameStopped) {
            restart();
            return;
        }
        openTile(x, y);
    }
    @Override
    public void onMouseRightClick(int x, int y) {
        markTile(x, y);
    }

    private void markTile(int x, int y) {
        GameObject tile = gameField[y][x];
        if (isGameStopped) return;
        if (tile.isOpen || (countFlags == 0 && tile.isFlag == false)) {
            return;
        }


        if (tile.isFlag) {
            tile.isFlag = false;
            countFlags++;
            setCellValue(x, y, "");
            setCellColor(x, y, Color.ORANGE);
        } else {
            tile.isFlag = true;
            countFlags--;
            setCellValue(x, y, FLAG);
            setCellColor(x, y, Color.YELLOW);
        }

    }

    private void gameOver() {
        isGameStopped = true;
        showMessageDialog(Color.RED, "GAME OVER", Color.BLACK, 50);
    }

    private void win() {
       isGameStopped = true;
       showMessageDialog(Color.WHITE, "GRATZ", Color.BLACK, 50);
    }

    private void restart() {
        isGameStopped = false;
        score = 0;
        setScore(score);
        countClosedTiles = SIDE*SIDE;
        countMinesOnField = 0;
        createGame();
    }
}