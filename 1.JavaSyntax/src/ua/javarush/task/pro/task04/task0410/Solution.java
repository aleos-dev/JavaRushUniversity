package ua.javarush.task.pro.task04.task0410;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Друге мінімальне число серед уведених
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int min = Integer.MAX_VALUE;
        int subMin = Integer.MIN_VALUE;

        while (true) {
            int newNumber;
            try {
                String newData = bufferedReader.readLine();
                newNumber = Integer.parseInt(newData);

            } catch (Exception e) {
                break;
            }

            if (newNumber < min) {
                    subMin = min;
                    min = newNumber;
            } else {
                if(newNumber < subMin && newNumber != min) {
                    subMin = newNumber;
                }
            }
        }

        System.out.println(subMin == Integer.MAX_VALUE ? "" : subMin);

    }
}