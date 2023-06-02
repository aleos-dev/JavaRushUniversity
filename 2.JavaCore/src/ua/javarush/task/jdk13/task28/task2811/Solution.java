package ua.javarush.task.jdk13.task28.task2811;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* 
Знайомство з Executors
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //напишіть тут ваш код
        ExecutorService service = Executors.newFixedThreadPool(5);

        for (int i = 1; i <= 20; i++) {
            final int index = i;
            service.execute(() -> doExpensiveOperation(index));
        }

        service.shutdown();
        service.awaitTermination(5, TimeUnit.SECONDS);

    }

    private static void doExpensiveOperation(int localID) {
        System.out.println(Thread.currentThread().getName() + ", localID=" + localID);
    }
}
