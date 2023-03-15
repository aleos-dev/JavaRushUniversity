package ua.javarush.task.pro.task13.task1320;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getMonthByIndex(4));
        System.out.println(getMonthByIndex(8));
        System.out.println(getMonthByIndex(12));
    }

    public static String getMonthByIndex(int monthIndex) {
        String monthString;
        switch(monthIndex) {
            case 1 : {
                monthString = "Січень";
                break;
            }
            case 2 : {
                monthString = "Лютий";
                break;
            }
            case 3 : {
                monthString = "Березень";
                break;
            }
            case 4 : {
                monthString = "Квітень";
                break;
            }
            case 5 : {
                monthString = "Травень";
                break;
            }
            case 6 : {
                monthString = "Червень";
                break;
            }
            case 7 : {
                monthString = "Липень";
                break;
            }
            case 8 : {
                monthString = "Серпень";
                break;
            }
            case 9 : {
                monthString = "Вересень";
                break;
            }
            case 10 : {
                monthString = "Жовтень";
                break;
            }
            case 11 : {
                monthString = "Листопад";
                break;
            }
            case 12 : {
                monthString = "Грудень";
                break;
            }
            default: {
                monthString = "Неприпустимий місяць";
            }

        }
        return monthString;
    }
}
