package ua.javarush.task.pro.task15.task1514;

import java.nio.file.Path;
import java.util.Scanner;

/* 
Усе відносне
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        //напишіть тут ваш код
        Path firstPath = Path.of(str1);
        Path secondPath = Path.of(str2);
        try {
            System.out.println(firstPath.relativize(secondPath));
        } catch (IllegalArgumentException e) {
            try {
                System.out.println(secondPath.relativize(firstPath));
                System.out.println("block2");
            } catch (IllegalArgumentException x) {

            }
        }
    }
}

