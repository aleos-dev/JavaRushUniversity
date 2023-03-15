package ua.javarush.task.pro.task03.task0314;

import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Поламана клавіатура
*/

public class Solution {
    public static String secret = "AmIGo";
    public static void main(String[] args) {
        //напишіть тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String parol;
        try {
            parol = bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (parol.equalsIgnoreCase(secret)) {
            System.out.println("доступ дозволено");
        } else {
            System.out.println("доступ заборонено");
        }
    }
}
