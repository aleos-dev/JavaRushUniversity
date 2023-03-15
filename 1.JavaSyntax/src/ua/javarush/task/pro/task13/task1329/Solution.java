package ua.javarush.task.pro.task13.task1329;

import java.util.*;

/* 
Зламана база даних
*/

public class Solution {

    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(5533, "Head First Java");
        map.put(5536, "Java. Посібник для початківців");
        map.put(5535, "Java для чайників");
        map.put(5540, "Java. Повний посібник");
        map.put(5531, "Java. Бібліотека професіонала");
        map.put(5538, "Java. Методи програмування");
        map.put(5532, "Java. Довідник розробника");
        map.put(5539, "Java SE 9. Базовий курс");
        map.put(5537, "Effective Java");
        map.put(5534, "Філософія Java");

        for (int i = getMinId(map); i <= getMaxId(map); i++) {
            System.out.printf("%d %s %n", i, map.get(i));
        }
    }

    public static Integer getMinId(TreeMap<Integer, String> map) {
        //напишіть тут ваш код
        return map.firstKey();
    }

    public static Integer getMaxId(TreeMap<Integer, String> map) {
        //напишіть тут ваш код
        return map.lastKey();
    }
}