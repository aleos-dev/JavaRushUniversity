package ua.javarush.task.pro.task16.task1604;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* 
День тижня твого народження
*/

public class Solution {

    static Calendar birthDate = new GregorianCalendar(1987, 2, 21);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        //напишіть тут ваш код
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        switch (day) {
            case 1:
                return "неділя";
            case 2:
                return "понеділок";
            case 3:
                return "вівторок";
            case 4:
                return "середа";
            case 5:
                return "четвер";
            case 6:
                return "п'ятниця";
            case 7:
                return "субота";
        }

        return null;
    }
}
