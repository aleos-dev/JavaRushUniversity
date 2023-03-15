package ua.javarush.task.pro.task09.task0906;

import java.util.regex.Pattern;

/* 
Двійковий конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 15;
        System.out.println("Десяткове число " + decimalNumber + " дорівнює двійковому числу " + toBinary(decimalNumber));
        String binaryNumber = "1111";
        System.out.println("Двійкове число " + binaryNumber + " дорівнює десятковому числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        if (decimalNumber <= 0) return "";

        StringBuilder sb = new StringBuilder();
        //напишіть тут ваш код
        for( ; decimalNumber > 1; decimalNumber /= 2  ) {
            sb.append(decimalNumber % 2);
        }
        sb.append(decimalNumber);

        return sb.reverse().toString();
    }

    public static int toDecimal(String binaryNumber) {
        //напишіть тут ваш код
        if (binaryNumber == null || binaryNumber.equals("")) return 0;
        int decimal = 0;
        for(int i = binaryNumber.length() - 1; i >= 0; i--) {
            decimal += (binaryNumber.charAt(i) - 48) * Math.pow(2, binaryNumber.length() - i - 1);
        }
        return decimal;
    }
}
