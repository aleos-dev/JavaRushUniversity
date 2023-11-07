package ua.javarush.task.jdk13.task41.task4112;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* 
Перекотиполе
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Bowling bowling = new Bowling(9);
        Set<Team> teams = new HashSet<>();
        teams.add(new Team("Шершні", bowling));
        teams.add(new Team("Страйкмобіль", bowling));
        teams.add(new Team("Перекотиполе", bowling));
        teams.add(new Team("Дівчата не шарять", bowling));
        teams.add(new Team("Гранітні кулі", bowling));
        teams.add(new Team("Balls of Thunder", bowling));
        teams.add(new Team("Ми намагаємося", bowling));
        teams.add(new Team("Dolls With Balls", bowling));
        teams.add(new Team("Заткнися та котися", bowling));
        teams.add(new Team("Хлопці та хлопці", bowling));
        teams.add(new Team("Алко Раш", bowling));
        teams.add(new Team("Всунь! Кинь! Збий!", bowling));
        teams.add(new Team("Накотя викоти", bowling));

        ExecutorService executor = Executors.newCachedThreadPool();
        List<Future<Integer>> futures = executor.invokeAll(teams);
        executor.awaitTermination(5, TimeUnit.SECONDS);
        int sum = 0;
        for (Future<Integer> future : futures) {
            sum += future.get();
        }
        System.out.println("Боулінг заробив $" + sum);

        executor.shutdown();
    }
}
