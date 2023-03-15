package ua.javarush.task.pro.task05.task0506;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
Мінімальне з N чисел
*/

public class Solution {

    public static int[] array;

    public static void main(String[] args) throws IOException {
        //напишіть тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arraySize = Integer.parseInt(reader.readLine());
        array = new int[arraySize];

        for(int i = 0; i < arraySize; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        int minEl = Integer.MAX_VALUE;
        for (int value : array) {
            if (value < minEl) {
                minEl = value;
            }
        }

        System.out.println(minEl);
    }
}
