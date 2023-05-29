package ua.javarush.task.jdk13.task27.task2702;

/* 
Модифікатори та deadlock
*/

public class Solution {
    private final String field;

    public Solution(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void sout(Solution solution) {
        synchronized (field) {
            System.out.format("111:  %s: %s %n", this.field, solution.getField());
            synchronized (this) {
                solution.sout2(this);
            }
        }
    }

    public void sout2(Solution solution) {
        synchronized (this) {
            System.out.format("222:  %s: %s %n", this.field, solution.getField());
            synchronized (field) {
                solution.sout(this);
            }
        }
    }

    public static void main(String[] args) {
        final Solution solution = new Solution("first");
        final Solution solution2 = new Solution("second");
        new Thread(new Runnable() {
            public void run() {
                solution.sout(solution2);
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                solution2.sout(solution);
            }
        }).start();

    }
}
