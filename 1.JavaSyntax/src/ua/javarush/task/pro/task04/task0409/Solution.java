package ua.javarush.task.pro.task04.task0409;

import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/* 
Мінімум серед уведених чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишіть тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputString;
        int min = Integer.MAX_VALUE;
        int nextInt;

        while (true) {
            inputString = reader.readLine();
            try {
                nextInt = Integer.parseInt(inputString);
            } catch (NumberFormatException e) {
                break;
            }
            if (nextInt < min) {
                min = nextInt;
            }
        }
        System.out.println(min);
    }
}