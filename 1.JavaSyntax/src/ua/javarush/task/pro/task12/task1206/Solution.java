package ua.javarush.task.pro.task12.task1206;

/* 
Аналіз рядків
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Гадаю, це буде нова фіча." +
                "Тільки нікому не кажіть, що вона виникла випадково.";

        System.out.println("Кількість цифр у рядку : " + countDigits(string));
        System.out.println("Кількість літер у рядку : " + countLetters(string));
        System.out.println("Кількість пробілів у рядку : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        //напишіть тут ваш код
        int numberOfDigits = 0;
        for(char c : string.toCharArray()) {
            if (Character.isDigit(c)) numberOfDigits++;
        }
        return numberOfDigits;
    }

    public static int countLetters(String string) {
        //напишіть тут ваш код
        int numberOfLetters = 0;
        for(char c : string.toCharArray()) {
            if (Character.isLetter(c)) numberOfLetters++;
        }
        return numberOfLetters;
    }

    public static int countSpaces(String string) {
        //напишіть тут ваш код
        int numberOfSpaces = 0;
        for(char c : string.toCharArray()) {
            if (Character.isSpace(c)) numberOfSpaces++;
        }
        return numberOfSpaces;
    }
}
