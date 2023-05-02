package ua.javarush.task.jdk13.task13.task1312;

import java.awt.*;

/* 
Один метод у класі
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();

        Integer getAge();
    }

    public static abstract class Fox implements Animal {

        public String getName() {
            return "Fox";
        }
    }
}
