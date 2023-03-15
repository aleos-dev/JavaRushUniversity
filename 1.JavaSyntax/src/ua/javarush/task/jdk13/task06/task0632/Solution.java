package ua.javarush.task.jdk13.task06.task0632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* 
Піраміда
*/

public class Solution {
    public static char[][] array;

    public static void main(String[] args) throws IOException {
        //напишіть тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int height = Integer.parseInt(reader.readLine());

        array = new char[height][];
        for (int i = 0; i < height; i++) {
            int baseOfPyramid = height * 2 - 1;
            array[i] = new char[baseOfPyramid];
            for (int j = 0; j < baseOfPyramid; j++) {
                if (j >=(baseOfPyramid - i*2)/2 && j <=(baseOfPyramid + i*2)/2) {
                    array[i][j] = '#';
                    System.out.print('#');
                } else {
                    array[i][j] = ' ';
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
