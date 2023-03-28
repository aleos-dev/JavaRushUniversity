package com.javarush.games.moonlander;

import com.javarush.engine.cell.*;

public class GameObject {
    public double x;
    public double y;
    public int[][] matrix;
    public int width;
    public int height;

    public GameObject(double x, double y, int[][] matrix) {
        this.x = x;
        this.y = y;
        this.matrix = matrix;
        this.width = matrix[0].length;
        this.height = matrix.length;
    }

    public void draw(Game game) {
        if (matrix == null) {
            return;
        }

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                int colorIndex = matrix[row][col];
                game.setCellColor((int) x + col, (int) y + row, Color.values()[colorIndex]);
            }
        }
    }
}
