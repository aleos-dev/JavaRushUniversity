package ua.javarush.task.jdk13.task16.task1624;

/* 
Відлік на перегонах
*/

public class Solution {
    public static volatile int numSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //напишіть тут ваш код
        Thread.sleep(3500);
            clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //напишіть тут ваш код
            try {
                while (!isInterrupted()) {
                    if (numSeconds == 0) {
                        System.out.println("Марш!");
                        break;
                    }

                    System.out.print(numSeconds-- + " ");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println("Прервано!");
            }
         }
    }
}
