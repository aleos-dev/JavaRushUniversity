package ua.javarush.task.pro.task04.task0404;

/* 
Заповнений прямокутник
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код

        int i = 0;
        int j = 0;
        while (i++ < 5) {
            while (j++ < 10) {
                System.out.print("Q");
            }
            j = 0;
            System.out.println();
        }
    }
}