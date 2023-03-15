package ua.javarush.task.jdk13.task06.task0637;

import java.io.IOException;
import java.util.Arrays;

/* 
Прямокутник
*/

public class Solution {
    public static char[][] array = new char[5][6];

    public static void main(String[] args) throws IOException {
        //напишіть тут ваш код
        Arrays.fill(array[0], 0, array[0].length, 'X');
        Arrays.fill(array[1], 0, 1, 'X');
        Arrays.fill(array[1], array[1].length - 1, array[1].length, 'X');
        Arrays.fill(array[1], 1, array[1].length - 1, ' ');
        Arrays.fill(array[2], 0, 1, 'X');
        Arrays.fill(array[2], array[2].length - 1, array[2].length, 'X');
        Arrays.fill(array[2], 1, array[2].length - 1, ' ');
        Arrays.fill(array[3], 0, 1, 'X');
        Arrays.fill(array[3], array[3].length - 1, array[3].length, 'X');
        Arrays.fill(array[3], 1, array[3].length - 1, ' ');
        Arrays.fill(array[4], 0, array[4].length, 'X');
    }
}
