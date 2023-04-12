package com.javarush.games.racer;

import com.javarush.engine.cell.*;

public class GameObject {
    public int x;
    public int y;
    public int[][] matrix;
    public int width;
    public int height;

    public GameObject(int x, int y, int[][] matrix) {
        this.x = x;
        this.y = y;
        this.matrix = matrix;
        width = this.matrix[0].length;
        height = this.matrix.length;
    }

    public GameObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Game game) {
       for(int row = 0; row < height; row++) {
           for(int column = 0; column < width; column++) {
               game.setCellColor(x + column, y + row, Color.values()[matrix[row][column]]);
           }
       }
    }
}
