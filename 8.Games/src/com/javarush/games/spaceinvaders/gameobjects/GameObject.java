package com.javarush.games.spaceinvaders.gameobjects;

import com.javarush.engine.cell.*;

public class GameObject {
    public double x;
    public double y;
    public int width;
    public int height;
    public int[][] matrix;

    public GameObject(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Game game) {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                game.setCellValueEx((int) this.x + x, (int) this.y + y, Color.values()[matrix[y][x]],  "");
            }
        }

    }

    public void setMatrix(int[][] objectMatrix) {
        matrix = objectMatrix;
        width = matrix[0].length;
        height = matrix.length;
    }

}
