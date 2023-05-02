package ua.javarush.task.jdk13.task13.task1314;

import java.util.ArrayList;
import java.util.List;

/* 
Ріпа
*/

public class Solution {
    public static void main(String[] args) {
        List<Person> plot = new ArrayList<>();
        plot.add(new Person("Ріпка", "Ріпку"));
        plot.add(new Person("Дід", "Діда"));
        plot.add(new Person("Баба", "Бабу"));
        plot.add(new Person("Онучка", "Онучку"));
        RepkaStory.tell(plot);
    }
}
