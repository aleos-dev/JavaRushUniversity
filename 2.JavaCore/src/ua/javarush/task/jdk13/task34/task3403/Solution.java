package ua.javarush.task.jdk13.task34.task3403;

/* 
Розкладання на множники за допомогою рекурсії
*/

public class Solution {

    public void recurse(int n) {
        if (n == 1) {
            return;
        }

        for (int i = 2; i <=n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                recurse(n / i);
                break;
            }
        }

    }
}
