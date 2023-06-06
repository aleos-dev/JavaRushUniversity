package ua.javarush.task.jdk13.task23.task2301;

/* 
Inner
*/

public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public static void main(String[] args) {

    }

    public static Solution[] getTwoSolutions() {

        Solution[] sol = new Solution[2];

        sol[0] = new Solution();
        sol[0].innerClasses[0] = new InnerClass();
        sol[0].innerClasses[1] = new InnerClass();
        sol[1] = new Solution();
        sol[1].innerClasses[0] = new InnerClass();
        sol[1].innerClasses[1] = new InnerClass();

        return sol;
    }

    public static class InnerClass {
    }
}
