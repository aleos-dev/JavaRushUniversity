package ua.javarush.task.pro.task05.task0507;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

/* 
Максимальне з N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        //напишіть тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arraySize = Integer.parseInt(reader.readLine());
        array = new int[arraySize];

        for(int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        int maxNumber = Integer.MIN_VALUE;

        for (int value : array) {
            if (value > maxNumber) {
                maxNumber = value;
            }
        }

        if (array.length > 0) {
            System.out.println(maxNumber);
        }

    }
}
