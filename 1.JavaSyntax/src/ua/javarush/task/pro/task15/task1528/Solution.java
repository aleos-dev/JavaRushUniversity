package ua.javarush.task.pro.task15.task1528;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedOutputStream;

/* 
Пишемо байти у файл
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             var writer = new BufferedOutputStream(new FileOutputStream(scanner.nextLine()))) {
            byte[] bytes = new byte[]{106, 97, 118, 97};
            writer.write(bytes);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}