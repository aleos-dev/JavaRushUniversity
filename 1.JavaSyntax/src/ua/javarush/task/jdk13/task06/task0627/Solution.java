package ua.javarush.task.jdk13.task06.task0627;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Оце так переворот!
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

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < i; j++) {
                int buf = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = buf;
            }
        }

        for(int i = 0; i < array.length; i++) {
            int j =0;
            for(; j < array[i].length - 1; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(array[i][j]);
        }
    }
}
