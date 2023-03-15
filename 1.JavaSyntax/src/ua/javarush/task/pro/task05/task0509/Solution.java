package ua.javarush.task.pro.task05.task0509;

/* 
Таблиця множення
*/

public class Solution {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        //напишіть тут ваш код
        MULTIPLICATION_TABLE = new int[10][10];
        for(int multiplier1 = 1; multiplier1 < 11; multiplier1++) {
            for(int multiplier2 = 1; multiplier2 < 11; multiplier2++) {
                MULTIPLICATION_TABLE[multiplier1 - 1][multiplier2 - 1] = multiplier1 * multiplier2;
                System.out.print(multiplier1 * multiplier2 + " ");
            }
            System.out.println();
        }
    }
}
