package com.javarush.games.game2048;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Key;

public class Game2048 extends Game {
    private static final int SIDE = 4;
    private int[][] gameField;
    private boolean isGameStopped = false;
    private int score = 0;

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
        drawScene();
    }

    private void createGame() {
        gameField = new int[SIDE][SIDE];
        score = 0;
        setScore(score);
        createNewNumber();
        createNewNumber();
    }

    private void createNewNumber() {
        if (getMaxTileValue() == 2048) {
            win();
        }
        int x;
        int y;
        do {
            x = getRandomNumber(SIDE);
            y = getRandomNumber(SIDE);
        } while (gameField[x][y] != 0);

        gameField[x][y] = getRandomNumber(10) == 9 ? 4 : 2;
    }

    private void drawScene() {
        for (int y = 0; y < gameField.length; y++) {
            for (int x = 0; x < gameField[y].length; x++) {
                setCellColoredNumber(x, y, gameField[y][x]);
            }
        }
    }

    private void setCellColoredNumber(int x, int y, int cellValue) {
        Color cellColor = getColorByValue(cellValue);
        if (cellValue == 0) {
            setCellValueEx(x, y, cellColor, "");
        } else {
            setCellValueEx(x, y, cellColor, String.valueOf(cellValue));
        }
    }

    private Color getColorByValue(int cellValue) {
        switch (cellValue) {
            case 2:
                return Color.LIGHTGREEN;
            case 4:
                return Color.GREEN;
            case 8:
                return Color.DARKGREEN;
            case 16:
                return Color.ORANGE;
            case 32:
                return Color.DARKORANGE;
            case 64:
                return Color.LIGHTBLUE;
            case 128:
                return Color.BLUE;
            case 256:
                return Color.DARKBLUE;
            case 512:
                return Color.RED;
            case 1024:
                return Color.DARKRED;
            case 2048:
                return Color.PINK;
        }
        ;
        return Color.YELLOW;
    }

    private boolean compressRow(int[] row) {
        boolean isSwapped = false;
        for (int i = 0, insertPlace = 0; i < row.length; i++) {
            int element = row[i];
            if (element > 0) {
                if (i != insertPlace) {
                    row[insertPlace] = element;
                    row[i] = 0;
                    isSwapped = true;
                }
                insertPlace++;
            }
        }
        return isSwapped;
    }

    private boolean mergeRow(int[] row) {
        boolean wasMerge = false;
        for (int i = 0; i < row.length - 1; i++) {
            int currentElement = row[i];
            if (currentElement == 0) continue;
            int nextElement = row[i + 1];
            if (currentElement == nextElement) {
                row[i] = currentElement << 1;
                row[i + 1] = 0;
                score += row[i];
                setScore(score);
                i++;
                wasMerge = true;
            }
        }
        return wasMerge;
    }

    @Override
    public void onKeyPress(Key key) {
        if (isGameStopped) {
            if (key == Key.SPACE) {
                createGame();
                drawScene();
                isGameStopped = false;
            }
            return;
        }
        if (canUserMove() == false) {
            gameOver();
            return;
        }
        switch (key) {
            case LEFT: {
                moveLeft();
                drawScene();
                break;
            }
            case RIGHT: {
                moveRight();
                drawScene();
                break;
            }
            case UP: {
                moveUp();
                drawScene();
                break;
            }
            case DOWN: {
                moveDown();
                drawScene();
                break;
            }
        }
    }

    private void moveLeft() {
        boolean wasCompressedOrMerged = false;
        for (int i = 0; i < gameField.length; i++) {
            if (compressRow(gameField[i]) | mergeRow(gameField[i])) {
                compressRow(gameField[i]);
                wasCompressedOrMerged = true;
            }
        }
        if (wasCompressedOrMerged) {
            createNewNumber();
        }
    }

    private void moveRight() {
        rotateClockwise();
        rotateClockwise();
        moveLeft();
        rotateClockwise();
        rotateClockwise();
    }

    private void moveUp() {
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
        moveLeft();
        rotateClockwise();
    }

    private void moveDown() {
        rotateClockwise();
        moveLeft();
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
    }

    private void rotateClockwise() {
        int[][] oneTurnOldMatrix = new int[SIDE][SIDE];

        for (int row = 0, i = 0; row < SIDE; row++) {
            int column = SIDE - row - 1;
            for (int runner = 0; runner < SIDE; runner++) {
                oneTurnOldMatrix[runner][column] = gameField[row][runner];
            }
        }
        gameField = oneTurnOldMatrix;
    }

    private int getMaxTileValue() {
        int maxValue = 0;
        for (int[] row : gameField) {
            for (int cell : row) {
                if (cell > maxValue) {
                    maxValue = cell;
                }
            }
        }
        return maxValue;
    }

    private void win() {
        isGameStopped = true;
        showMessageDialog(Color.BLACK, "YOU WIN", Color.RED, 50);
    }

    private boolean canUserMove() {
        for (int row = 0; row < SIDE; row++) {
            for (int col = 0; col < SIDE; col++) {
                int element = gameField[row][col];
                if (element == 0) {
                    return true;
                }
                if (col + 1 != SIDE) {
                    int neighborElementInRow = gameField[row][col + 1];
                    if (element == neighborElementInRow) {
                        return true;
                    }
                }
                if (row + 1 != SIDE) {
                    int neighborElementInCol = gameField[row + 1][col];
                    if (element == neighborElementInCol) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void gameOver() {
        isGameStopped = true;
        showMessageDialog(Color.BLACK, "YOU LOSE", Color.RED, 50);
    }
}

