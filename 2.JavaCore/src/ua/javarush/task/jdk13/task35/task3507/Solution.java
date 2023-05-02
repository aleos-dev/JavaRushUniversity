package ua.javarush.task.jdk13.task35.task3507;

import java.util.*;

/* 
Collections & Generics
*/

public class Solution {

    public static void main(String[] args) {
    }

    public static <T> ArrayList<T> newArrayList(T... elements) {
        //напишіть тут ваш код
        return new ArrayList<>(List.of(elements));
    }

    public static <T> HashSet<T> newHashSet(T... elements) {
        //напишіть тут ваш код
        return new HashSet<>(List.of(elements));
    }

    public static <K, V> HashMap<K, V> newHashMap(List<? extends K> keys,
                                                  List<? extends V> values) {
        //напишіть тут ваш код
        if (keys.size() != values.size()) {
            throw new IllegalArgumentException();
        }

        HashMap<K, V> ham = new HashMap<>();
        for (int i = 0; i < keys.size(); i++) {
           ham.put(keys.get(i), values.get(i));
        }

        return ham;
    }
}
