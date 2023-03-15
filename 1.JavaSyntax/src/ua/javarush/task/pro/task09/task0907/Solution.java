package ua.javarush.task.pro.task09.task0907;


/* 
Шістнадцятковий конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десяткове число " + decimalNumber + " дорівнює шістнадцятковому числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шістнадцяткове число " + hexNumber + " дорівнює десятковому числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        //напишіть тут ваш код
        if (decimalNumber <= 0) return "";
        char[] hexAlphabet = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int index;
        StringBuilder sb = new StringBuilder();
        for (; decimalNumber > 15; decimalNumber /= 16) {
            index = decimalNumber % 16;
            sb.append(hexAlphabet[index]);
        }
        sb.append(hexAlphabet[decimalNumber]);
        sb.reverse();

        return sb.toString();
    }

    public static int toDecimal(String hexNumber) {
        //напишіть тут ваш код
        if (hexNumber == null || hexNumber == "") return 0;
        int decimal = 0;
        int numberOfDigits = hexNumber.length();
        for( int index = 0; index < numberOfDigits; index++) {
          int currentHexDigit = hexNumber.charAt(numberOfDigits - 1 - index);
          int decRepresantation = HEX.indexOf((char)currentHexDigit);
          decimal += decRepresantation * Math.pow(16, index);
        }
        return decimal;
    }
}
