package ua.javarush.task.pro.task10.task1016;

/* 
Прогноз погоди
*/

public class Solution {

    public static void showWeather(City city) {
        //напишіть тут ваш код
        System.out.println("У місті " + city.getName() + " сьогодні температура повітря "+ city.getTemperature());
    }

    public static void main(String[] args) {
        //напишіть тут ваш код
        City Kiev =  new City("Kiev", 20);
        showWeather(Kiev);
    }
}
