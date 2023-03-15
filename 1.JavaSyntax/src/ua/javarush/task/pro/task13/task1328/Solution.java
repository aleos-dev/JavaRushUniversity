package ua.javarush.task.pro.task13.task1328;

import java.util.*;

/* 
Досягнення
*/

public class Solution {

    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(1, "Один маленький крок");
        map.put(5, "Дай 5");
        map.put(10, "В 10-ку");
        map.put(50, "50 відтінків кодинга");
        map.put(100, "Центуріон");
        map.put(200, "Ефективність 200%");
        map.put(300, "300 спартанців");
        map.put(400, "Забіг на 400");
        map.put(500, "Багам тут не місце");
        map.put(600, "600 пострілів за хвилину");
        map.put(700, "Сезон полювання");
        map.put(800, "Стальний кодер");
        map.put(900, "100500 багів по тому");

        int tasksCount = 150;

        SortedMap<Integer, String> reachedAchievements = getReachedAchievements(map, tasksCount);
        for (Map.Entry<Integer, String> entry : reachedAchievements.entrySet()) {
            System.out.printf("У тебе є досягнення \"%s\" за %d вирішених задач%n", entry.getValue(), entry.getKey());
        }

        System.out.printf("%nЗараз у тебе %d вирішених задач%n%n", tasksCount);

        SortedMap<Integer, String> futureAchievements = getFutureAchievements(map, tasksCount);
        for (Map.Entry<Integer, String> entry : futureAchievements.entrySet()) {
            System.out.printf("Ти отримаєш досягнення \"%s\", якщо вирішиш %d задач%n", entry.getValue(), entry.getKey());
        }
    }

    public static SortedMap<Integer, String> getReachedAchievements(TreeMap<Integer, String> map, Integer tasksCount) {
        //напишіть тут ваш код
        var reachedAchievements = map.headMap(tasksCount + 1);

        return (SortedMap) reachedAchievements;
    }

    public static SortedMap<Integer, String> getFutureAchievements(TreeMap<Integer, String> map, Integer tasksCount) {
        //напишіть тут ваш код
        var futureAchievements = map.tailMap(tasksCount + 1);
        return (SortedMap) futureAchievements;
    }
}