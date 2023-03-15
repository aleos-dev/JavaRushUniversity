package ua.javarush.task.pro.task03.task0310;

import java.util.Scanner;

/* 
Крізь терни…
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String result;
        if (number < 5) {
            result = "число менше за 5";
        } else {
            if (number == 5) {
                result = "число дорівнює 5";
            } else {
                result = "число більше за 5";
            }
        }
        System.out.println(result);
    }
}
