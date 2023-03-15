package ua.javarush.task.pro.task05.task0516;

import java.util.Arrays;

/* 
Заповнюємо масив
*/

public class Solution {

    public static int[] array = new int[20];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        //напишіть тут ваш код
        int mid = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;
            Arrays.fill(array, 0, mid, valueStart);
        Arrays.fill(array, mid, array.length, valueEnd);
        System.out.println(Arrays.toString(array));
    }
}
