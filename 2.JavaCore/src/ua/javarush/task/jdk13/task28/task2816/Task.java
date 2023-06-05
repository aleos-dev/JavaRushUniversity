package ua.javarush.task.jdk13.task28.task2816;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public class Task implements Callable<String> {

    private final char letter;
    private final Future<String> future;

    public Task(char letter, Future<String> future) {
        this.letter = letter;
        this.future = future;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(new Random().nextInt(20));

        // combine previous result and letter
//        String result = future.get() + letter;
//        System.out.println(result);
//
//        return result;

        System.out.println(future.get() + letter);
        return future.get() + letter;
    }
}
