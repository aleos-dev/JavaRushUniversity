package ua.javarush.task.pro.task11.task1104;

/* 
Конвертер рядка
*/

public class Solution {
    public static void main(String[] args) {
        String string = "12.84";
        //напишіть тут ваш код
        double number = Double.parseDouble(string);
        System.out.println(Math.round(number));
    }
}
