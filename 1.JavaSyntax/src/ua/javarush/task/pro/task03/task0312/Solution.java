package ua.javarush.task.pro.task03.task0312;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Порівняймо рядки
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String row1 = reader.readLine();
        String row2 = reader.readLine();
        if (row1.equals(row2)) {
            //напишіть тут ваш код
            System.out.println("рядки однакові");
        } else {
            //напишіть тут ваш код
            System.out.println("рядки різні");
        }
    }
}
