package ua.javarush.task.jdk13.task12.task1219;

/* 
Створюємо людину
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }


    public class Human implements CanSwim, CanRun {
        public void swim() {}
        public void run() {}

    }

    public class Duck implements CanSwim, CanRun, CanFly {
        public void swim() {}
        public void run() {}
        public void fly() {}

    }

    public class Penguin implements CanSwim, CanRun {
        public void swim() {}
        public void run() {}

    }

    public class Airplane implements CanFly {
        public void fly() {}

    }
}
