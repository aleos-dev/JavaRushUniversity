package ua.javarush.task.jdk13.task16.task1627;

import java.util.ArrayList;
import java.util.List;

/* 
Один для всіх, всі - для одного
*/

public class Solution {
    public static byte threadCount = 3;
    static List<Thread> threads = new ArrayList<>(threadCount);

    public static void main(String[] args) throws InterruptedException {
        initThreadsAndStart();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    private static void initThreadsAndStart() {
        Water water = new Water("water");
        for (int i = 0; i < threadCount; i++) {
            threads.add(new Thread(water, "#" + i));
        }

        for (int i = 0; i < threadCount; i++) {
            threads.get(i).start();
        }
    }

    public static void ourInterruptMethod() {
        //напишіть тут ваш код
        for(var thread: threads) {
            thread.interrupt();
        }
    }

    public static class Water implements Runnable {
        private String sharedResource;

        public Water(String sharedResource) {
            this.sharedResource = sharedResource;
        }

        public void run() {
            //fix 2 variables - виправ 2 змінні
            boolean isCurrentThreadInterrupted = getCurrentThread().isInterrupted();
            String threadName = getCurrentThread().getName();

            try {
                while (!isCurrentThreadInterrupted) {

                    System.out.println("Об'єкт " + sharedResource + ", потік " + threadName);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException ignore) {
            }
        }

        public static Thread getCurrentThread() {
            return Thread.currentThread();
        }
    }
}
