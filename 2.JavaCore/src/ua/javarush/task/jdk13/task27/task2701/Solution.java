package ua.javarush.task.jdk13.task27.task2701;

/* 
Створюємо deadlock
*/

public class Solution {
    public static void main(String[] args) {
        final Friend alphonse =
                new Fri1("Alphonse");
        final Friend gaston =
                new Fri1("Gaston");
        new Thread(new Runnable() {
            public void run() {
                alphonse.bow(gaston);
            }
        }).start();
        new Thread(new Runnable() {
            public void run() {
                gaston.bow(alphonse);
            }
        }).start();
    }

    abstract static class Friend {
        private final String name;

        public Friend(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public synchronized void bow(Friend bower) {
            System.out.format("%s: %s"
                              + " bowed to me!%n",
                    this.name, bower.getName());
            bower.bowBack(this);
        }

        public synchronized void bowBack(Friend bower) {
            System.out.format("%s: %s"
                              + " bowed back to me!%n",
                    this.name, bower.getName());
        }


    }

    static class Fri1 extends Friend {

        public Fri1(String name) {
            super(name);
        }
    }
}
