package ua.javarush.task.jdk13.task13.task1307;

/* 
Том, Джеррі та Спайк
*/

public class Solution {
    public static void main(String[] args) {

    }

    class Cat implements Movable, Edible, Eat {
        public void move() {

        }

        public void beEaten() {

        }

        public void eat() {

        }

    }

    class Mouse implements Movable, Edible {
        public void move() {

        }

        public void beEaten() {

        }

    }

    class Dog implements Movable, Eat {
        public void move() {

        }

        public void eat() {

        }
    }


    // може рухатися
    public interface Movable {
        void move();
    }

    // може бути з'їдений
    public interface Edible {
        void beEaten();
    }

    // може когось з'їсти
    public interface Eat {
        void eat();
    }
}