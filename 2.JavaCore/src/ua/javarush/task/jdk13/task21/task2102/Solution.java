package ua.javarush.task.jdk13.task21.task2102;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* 
Виправити помилку. Порівняння об'єктів
*/

public class Solution {
    private final String first;
    private final String last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Solution)) {
            return false;
        }
        Solution n = (Solution) o;
        return Objects.equals(n.first, first) && Objects.equals(n.last, last);
    }


    @Override
    public int hashCode() {
        int firstHash = (first == null ? 0 : first.hashCode());
        return 17 * firstHash + (last == null ? 0 : last.hashCode());
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Mickey", "Mouse"));
        System.out.println(s.contains(new Solution("Mickey", "Mouse")));
    }
}
