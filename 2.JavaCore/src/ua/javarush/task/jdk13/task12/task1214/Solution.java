package ua.javarush.task.jdk13.task12.task1214;

/* 
«Виправ код», частина 2
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public String getName() {
            return "Я - кошеня";
        }

        public abstract Pet getChild();
    }
}
