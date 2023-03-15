package ua.javarush.task.pro.task05.task0511;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
Створюємо двовимірний масив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) throws IOException {
        //напишіть тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int abscissa;
        while ((abscissa = Integer.parseInt(reader.readLine())) <= 0) ;

        multiArray = new int[abscissa][];
        for (int i = 0; i < abscissa; i++) {
            int ordinate;
            while ((ordinate = Integer.parseInt(reader.readLine())) <= 0) ;
            multiArray[i] = new int[ordinate];
        }
    }
}
