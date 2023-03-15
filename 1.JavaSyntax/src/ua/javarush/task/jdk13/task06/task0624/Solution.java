package ua.javarush.task.jdk13.task06.task0624;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Максимальний елемент
*/

public class Solution {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) throws IOException {
        //напишіть тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maxElement = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                array[i][j] = Integer.parseInt(reader.readLine());
                if (maxElement < array[i][j]) maxElement = array[i][j];
            }
        }
        System.out.println(maxElement);
    }
}
