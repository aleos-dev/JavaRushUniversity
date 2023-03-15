package ua.javarush.task.jdk13.task06.task0625;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/* 
Мінімальна сума
*/

public class Solution {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) throws IOException {
        //напишіть тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                array[i][j] = Integer.parseInt(reader.readLine());
            }
        }
        int minSum = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++) {
            int minSumRow = array[i][0];
            int minSumColumn = array[0][i];
            for (int j = 1; j <array[i].length; j++) {
                minSumRow += array[i][j];
                minSumColumn += array[j][i];
            }

            if (minSumRow < minSum && minSumRow < minSumColumn) {
                minSum = minSumRow;
            } else {
                if (minSumColumn < minSum) {
                    minSum = minSumColumn;
                }
            }
        }
        System.out.println(minSum);
    }
}
