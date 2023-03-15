package ua.javarush.task.pro.task04.task0408;

import java.util.Scanner;


/* 
Максимум серед уведених чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner sc = new Scanner(System.in);
        int maxEven = Integer.MIN_VALUE;
        while(true) {
            int number;
            if ( !sc.hasNextInt() ) {break;}
            number = sc.nextInt();
            if (number % 2 == 0) {
                if (number > maxEven) {
                    maxEven = number;
                }
            }
        }
        System.out.println(maxEven);
    }
}