package ua.javarush.task.pro.task11.task1109;

/* 
Об'єкти внутрішніх і вкладених класів
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Outer.Nested nestedClassOfOuter = new Outer.Nested();
        Outer outerClass = new Outer();
        Outer.Inner innerClassOfOuter = outerClass.new Inner();
    }
}
