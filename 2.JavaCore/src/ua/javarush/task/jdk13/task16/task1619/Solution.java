package ua.javarush.task.jdk13.task16.task1619;

/* 
Розташуй виклики методів join()
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Cat cat1 = new Cat("Мурка");
        Cat cat2 = new Cat("Пушинка");
    }

    private static void investigateWorld() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static class Cat extends Thread {
        protected Kitten kitten1;
        protected Kitten kitten2;

        public Cat(String name) {
            super(name);
            kitten1 = new Kitten("Кошеня 1, мама - " + getName());
            kitten2 = new Kitten("Кошеня 2, мама - " + getName());
            start();
        }

        public void run() {
            System.out.println(getName() + " народила 2 кошенят");
            try {
                initAllKittens();
                kitten1.join();
                kitten2.join();
            } catch (InterruptedException ignore) {
            }
            System.out.println(getName() + ": Усі кошенята в корзинці. " + getName() + " зібрала їх назад");
        }

        private void initAllKittens() throws InterruptedException {
            kitten1.start();
            kitten2.start();
        }
    }

    public static class Kitten extends Thread {
        public Kitten(String name) {
            super(name);
        }

        public void run() {
            System.out.println(getName() + ", виліз із корзинки");
            investigateWorld();
        }
    }
}
