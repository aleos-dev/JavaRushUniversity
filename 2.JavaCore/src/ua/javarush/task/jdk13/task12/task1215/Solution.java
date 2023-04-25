package ua.javarush.task.jdk13.task12.task1215;

/* 
Корова — теж тварина
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Animal {
        public abstract String getName();
    }

    public static class Cow extends Animal {
        public String getName() {
            return "Milka";
        }
    }

}
