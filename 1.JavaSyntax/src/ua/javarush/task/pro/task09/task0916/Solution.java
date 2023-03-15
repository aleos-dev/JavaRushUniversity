package ua.javarush.task.pro.task09.task0916;

/* 
String.format()
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(format("Аміго", 5000));
    }

    public static String format(String name, int salary) {
        String phrase = "Мене звати %s. Я зароблятиму $%d на місяць.";
        //напишіть тут ваш код

        return String.format(phrase, name, salary);
    }
}
