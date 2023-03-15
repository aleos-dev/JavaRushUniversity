package ua.javarush.task.pro.task13.task1318;

/* 
Наступний місяць, будь ласка
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.DECEMBER));
    }

    public static Month getNextMonth(Month month) {
        //напишіть тут ваш код
        var enumValues = Month.values();
        int nextIndex = month.ordinal() == enumValues.length - 1 ? 0 : month.ordinal() + 1;
        return enumValues[nextIndex];
    }
}
