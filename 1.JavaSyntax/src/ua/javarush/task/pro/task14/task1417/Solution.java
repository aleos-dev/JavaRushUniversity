package ua.javarush.task.pro.task14.task1417;

/* 
Валідатор дати
*/

import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи дату у форматі dd.mm.yyyy : ");
        String date = scanner.nextLine();
        validateDate(date);
        System.out.println("\nДата коректна.");
    }

    public static void validateDate(String date) {
        checkDateFormat(date);
        checkYearValue(date);
        checkMonthValue(date);
        checkDayValue(date);
    }

    public static void checkDateFormat(String date) {
        //напишіть тут ваш код
        String[] splitDate = date.split("\\.");
        if (splitDate.length != 3) throw new InvalidDateFormatException();

        String dd = splitDate[0];
        String mm = splitDate[1];
        String yyyy = splitDate[2];
        if (
                dd.length() != 2 || mm.length() != 2 || yyyy.length() != 4
        ) {
            throw new InvalidDateFormatException();
        } else {
            for(char c: dd.toCharArray()) {
                if ( !Character.isDigit(c)) { throw new InvalidDateFormatException(); }
            }
            for(char c: mm.toCharArray()) {
                if ( !Character.isDigit(c)) { throw new InvalidDateFormatException(); }
            }
            for(char c: yyyy.toCharArray()) {
                if ( !Character.isDigit(c)) { throw new InvalidDateFormatException(); }
            }
        }
    }

    public static void checkYearValue(String date) {
        //напишіть тут ваш код
        int year = Integer.parseInt(date.split("\\.")[2]);
        if(year < 1900 || year > 2100) { throw new InvalidYearValueException(); }
    }

    public static void checkMonthValue(String date) {
        //напишіть тут ваш код
        String monthStr = date.split("\\.")[1];
        int month = Integer.parseInt(monthStr);
        if(month < 1 || month > 12) { throw new InvalidMonthValueException(); }
    }

    public static void checkDayValue(String date) {
        HashMap<Integer, Integer> months = new HashMap<>() {{
            put(1, 31);
            put(2, 29);
            put(3, 31);
            put(4, 30);
            put(5, 31);
            put(6, 30);
            put(7, 31);
            put(8, 31);
            put(9, 30);
            put(10, 31);
            put(11, 30);
            put(12, 31);
        }};
        //напишіть тут ваш код
        String monthStr = date.split("\\.")[1];
        int month = Integer.parseInt(monthStr);
        String dayStr = date.split("\\.")[0];
        int day = Integer.parseInt(dayStr);
        if(day < 1 || day > months.get(month)) { throw new InvalidDayValueException(); }
    }
}
