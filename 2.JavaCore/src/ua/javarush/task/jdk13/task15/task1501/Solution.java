package ua.javarush.task.jdk13.task15.task1501;

/* 
Щось зайве
*/

public class Solution {
    public static void main(String[] args) {
        print((short) 1);
        print((Number) 1);
        print(1);
        print((Integer) 1);
        print((int) 1);
    }

    public static void print(Integer i) {
        System.out.println("Це Integer");
    }

    public static void print(Object i) {
        System.out.println("Це Object");
    }

    public static void print(double i) {
        System.out.println("Це double");
    }
}
