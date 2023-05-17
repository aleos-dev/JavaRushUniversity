package ua.javarush.task.jdk13.task21.task2101;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* 
Equals and HashCode
*/

public class Solution {
    private final String first;
    private final String last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Object n) {
        if (this == n) {
            return true;
        }
        
        if (!(n instanceof Solution)) {
            return false;
        }

        Solution solObj = (Solution) n;

        return Objects.equals(solObj.first, first) && Objects.equals(solObj.last, last);
    }

    public int hashCode() {
        int firstHash = (first == null ? 0 :first.hashCode());
        return 31 * firstHash + (last == null ? 0 : last.hashCode());
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        System.out.println(s.contains(new Solution("Donald", "Duck")));
    }
}
