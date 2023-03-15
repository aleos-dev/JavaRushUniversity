package ua.javarush.task.pro.task04.task0406;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Показуємо, що отримуємо
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишіть тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String data = reader.readLine();
            if("enough".equals(data)) { break; }
            System.out.println(data);
        }
    }
}