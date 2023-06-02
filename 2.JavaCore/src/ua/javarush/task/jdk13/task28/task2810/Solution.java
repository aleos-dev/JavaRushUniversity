package ua.javarush.task.jdk13.task28.task2810;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* 
Залізобетонна зупинка
*/

public class Solution {

    public static ExecutorService executor = Executors.newSingleThreadExecutor();

    public static void main(String[] args) throws Exception {
        List<String> instruments = List.of("скрипка", "тромбон", "бубонці", "контрабас");
        for (String instrument : instruments) {
            executor.submit(new MusicalInstrument(instrument));
        }

        completeConcert();
    }

    public static void completeConcert() throws Exception {
        //напишіть тут ваш код
        executor.shutdown();
        if (!executor.awaitTermination(2, TimeUnit.SECONDS)) {
            executor.shutdownNow();
        }
    }
}