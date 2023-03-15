package ua.javarush.task.pro.task09.task0908;

/*
Двійково-шістнадцятковий конвертер
*/

public class Solution {

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двійкове число " + binaryNumber + " дорівнює шістнадцятковому числу " + toHex(binaryNumber));
        System.out.println("Двійкове число 0000 дорівнює шістнадцятковому числу " + toHex("1111"));
        System.out.println("Двійкове число 01101 дорівнює шістнадцятковому числу " + toHex("01101"));
        System.out.println("Двійкове число 34 дорівнює шістнадцятковому числу " + toHex("34"));
        String hexNumber = "9d0";
        System.out.println("Шістнадцяткове число " + hexNumber + " дорівнює двійковому числу " + toBinary(hexNumber));
    }
    private static final String[] BINARY = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
    private static final String HEX = "0123456789abcdef";
    public static String toHex(String binaryNumber) {
        String hexNumber = "";
        String decade;
        if (binaryNumber == null || (binaryNumber.replaceAll("[0-1]", "")).length() > 0) {
            return hexNumber;
        }
        StringBuilder stringBuilder = new StringBuilder(binaryNumber);
        for (int i = 0; i < stringBuilder.length() % 4; i++) {
            if (stringBuilder.length() % 4 != 0) {
                stringBuilder.insert(0, 0);
            }
        }
        for (int i = 0; i < stringBuilder.length(); i += 4) {
            decade = stringBuilder.substring(i, i + 4);
            for (int j = 0; j < 16; j++) {
                if (decade.equals(BINARY[j])) {
                    hexNumber += HEX.charAt(j);
                    break;
                }
            }
        }
        return hexNumber;
    }

   /* public static String toHex(String binaryNumber) {
        //напишіть тут ваш код
        if (binaryNumber == null || binaryNumber.equals("")) return "";
        StringBuilder sb = new StringBuilder(binaryNumber);
        sb.reverse();
        StringBuilder hexNumberAsString = new StringBuilder();
        int hexDigit = 0;
        for (int i = 0; i < sb.length(); i++) {
            int nextBinaryDigit = Character.getNumericValue(sb.charAt(i));
            if (nextBinaryDigit < 0 || nextBinaryDigit > 1) return "";
//            if (nextBinaryDigit == 0) continue;
            hexDigit += nextBinaryDigit * Math.pow(2, i % 4);
            if ((i + 1) % 4 == 0 || i == sb.length() - 1) {
                hexNumberAsString.append(Character.forDigit(hexDigit, 16));
                hexDigit = 0;
            }
        }
        hexNumberAsString.reverse();

        while (hexNumberAsString.charAt(0) == '0' && hexNumberAsString.length() > 1) hexNumberAsString.delete(0, 1);
        return hexNumberAsString.toString();
    }*/

    public static String toBinary(String hexNumber) {
        //напишіть тут ваш код
        if (hexNumber == null || hexNumber.equals("")) return "";
        String[] binaryStrings = {
                "0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111",
        };

        String hexSymbols = "0123456789abcdef";
        StringBuilder binaryNumber = new StringBuilder();
        for (int i = 0; i < hexNumber.length(); i++) {
            char nextDigitAsChar = hexNumber.charAt(i);
            int index = hexSymbols.indexOf(nextDigitAsChar);
            if (index == -1) {
                return "";
            }
            binaryNumber.append(binaryStrings[index]);
        }

        while (binaryNumber.charAt(0) == '0' && binaryNumber.length() > 1) binaryNumber.delete(0, 1);

        return binaryNumber.toString();
    }
}
