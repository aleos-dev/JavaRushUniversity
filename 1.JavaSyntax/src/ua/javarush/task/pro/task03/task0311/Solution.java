package ua.javarush.task.pro.task03.task0311;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Висока точність
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишіть тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double number1 = Double.parseDouble(reader.readLine());
        double number2 = Double.parseDouble(reader.readLine());
        double accuracy = number1 - number2;
        if (Math.abs(accuracy) < 0.000001) {
            System.out.println("числа рівні");
        } else {
            //напишіть тут ваш код
            System.out.println("числа не рівні");
        }
    }
}
