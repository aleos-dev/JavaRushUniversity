package ua.javarush.task.jdk13.task28.task2813;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* 
Кешування потоків
*/

public class Solution {

    public static BlockingQueue<String> queue = new ArrayBlockingQueue<>(32);
    public static ExecutorService executorService;

    public static void main(String[] args) throws Exception {
        //напишіть тут ваш код
        executorService = Executors.newCachedThreadPool();

        submitProducers();
        submitConsumers();

        executorService.shutdownNow();
    }

    public static void submitProducers() {
        //напишіть тут ваш код
        for (int i = 0; i < 100; i++) {
            executorService.submit(new Producer("number: " + i));
        }

    }

    public static void submitConsumers() {
        //напишіть тут ваш код
        Consumer consumer = new Consumer();
        for (int i = 0; i < 100; i++) {
            executorService.submit(consumer);
        }


    }
}
