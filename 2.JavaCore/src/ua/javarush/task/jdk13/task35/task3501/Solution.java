package ua.javarush.task.jdk13.task35.task3501;

/* 
Виклик статичного методу
*/

public class Solution {
    public static void main(String[] args) {
        GenericStatic.someStaticMethod("hello");
        GenericStatic.someStaticMethod(123);
        GenericStatic.someStaticMethod(321.123);
    }
}
