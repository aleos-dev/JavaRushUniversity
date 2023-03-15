package ua.javarush.task.pro.task04.task0405;

/* 
Незаповнений прямокутник
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        int x = 0;
        int y = 0;

        while (y++ < 10) {
            while (x++ < 20) {
                if (y == 1 || y == 10) {
                    System.out.print("Б");
                } else {
                    if (x == 1 || x == 20) {
                        System.out.print("Б");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
            x = 0;
        }

    }
}