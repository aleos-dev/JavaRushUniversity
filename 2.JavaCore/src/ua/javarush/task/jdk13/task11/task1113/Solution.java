package ua.javarush.task.jdk13.task11.task1113;

/* 
Перевстановлення вінди
*/

public class Solution {

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("HP", "Windows", "3.1");
        Laptop laptop2 = new Laptop("Lenovo", "Linux Ubuntu", "16.4");
        Laptop laptop3 = new Laptop("Apple", "MacOS Monterey", "12.1");
        Laptop laptop4 = new Laptop("Google", "Chrome OS", "1.0");

        laptop1.updateOS("95");
        laptop1.printInfo();
    }
}

