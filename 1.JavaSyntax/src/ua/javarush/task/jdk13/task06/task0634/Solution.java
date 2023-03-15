package ua.javarush.task.jdk13.task06.task0634;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Шахівниця
*/

public class Solution {
    public static char[][] array;

    public static void main(String[] args) throws IOException {
        //напишіть тут ваш код
        char black = '#';
        char white = ' ';

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sizeOfChessBoard = Integer.parseInt(reader.readLine());
        array = new char[sizeOfChessBoard][sizeOfChessBoard];

        boolean blackFlag = true;

        for (int i = 0; i < array.length * array.length; i++) {
            if (blackFlag) {
                array[i / array.length][i % array.length] = black;
                blackFlag = false;
            } else {
                array[i / array.length][i % array.length] = white;
                blackFlag = true;
            }

            if (i % array.length == array.length - 1 && array.length % 2 == 0) {
                if (blackFlag == true) {
                    blackFlag = false;
                } else {
                    blackFlag = true;
                }
            }
        }

        for (char[] chars : array) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }

    }
}
