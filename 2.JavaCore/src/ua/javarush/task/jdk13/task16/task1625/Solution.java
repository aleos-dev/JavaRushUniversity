package ua.javarush.task.jdk13.task16.task1625;

/* 
Знову interrupt
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //напишіть тут ваш код
        TestThread thread = new TestThread();
        thread.start();
        thread.interrupt();
    }

    //напишіть тут ваш код
    public static class TestThread extends Thread {

        @Override
        public void run() {
            while(!isInterrupted()) {
            }
        }
    }
}