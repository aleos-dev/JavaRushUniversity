package ua.javarush.task.pro.task09.task0905;

import java.util.regex.Pattern;

/* 
Вісімковий конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 8;
        System.out.println("Десяткове число " + decimalNumber + " дорівнює вісімковому числу " + toOctal(decimalNumber));
        int octalNumber = 16;
        System.out.println("Вісімкове число " + octalNumber + " дорівнює десятковому числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        //напишіть тут ваш код11
        if (decimalNumber <= 0) return 0;

        int octal = 0;
        //напишіть тут ваш код
        int i = 0;
        for( ; decimalNumber > 7; decimalNumber /= 8, i++) {
            octal += decimalNumber % 8 * Math.pow(10, i);
        }
        octal += decimalNumber % 8 * Math.pow(10, i);

        return octal;
    }

    public static int toDecimal(int octalNumber) {
        //напишіть тут ваш код
        if (octalNumber <= 0) return 0;
        int decimal = 0;
        int i = 0;
        for(; octalNumber > 9; octalNumber /= 10, i++) {
            decimal += octalNumber % 10 * Math.pow(8, i);
        }
        decimal += octalNumber * Math.pow(8, i);
        return decimal;
    }
}
