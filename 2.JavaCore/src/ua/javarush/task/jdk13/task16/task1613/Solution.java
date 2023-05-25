package ua.javarush.task.jdk13.task16.task1613;

import java.util.ArrayList;
import java.util.List;

/* 
Список і потоки
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<>(5);

    public static void main(String[] args) {
        //напишіть тут ваш код
        for(int i = 0; i < 5; i++) {
            list.add(new Thread(new SpecialThread()));
        }
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
