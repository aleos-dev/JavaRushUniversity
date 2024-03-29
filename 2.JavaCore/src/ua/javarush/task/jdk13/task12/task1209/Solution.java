package ua.javarush.task.jdk13.task12.task1209;

/* 
Визначимося з тваринами
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //напишіть тут ваш код
        if (o instanceof Cow) {
            return "Корова";
        } else if (o instanceof Dog) {
            return "Собака";
        } else if (o instanceof Whale) {
            return "Кит";
        } else {
            return "Невідома тварина";
        }
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
