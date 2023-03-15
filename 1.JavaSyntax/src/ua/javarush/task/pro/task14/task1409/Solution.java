package ua.javarush.task.pro.task14.task1409;

/* 
Пропускаємо крізь себе
*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;
        int sum = 0;
        String s = scanner.nextLine();
        while (!(isExit = s.equals("ENTER"))) {
            int i = Integer.parseInt(s);
            sum += i;
            s = scanner.nextLine();
        }
        System.out.println(sum);
    }
}

