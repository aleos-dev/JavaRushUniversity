package ua.javarush.task.pro.task05.task0508;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Видаляємо однакові рядки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) throws IOException {
        //напишіть тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        strings = new String[6];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = reader.readLine();
        }

        for (int i = 0; i < strings.length; i++) {
            if (strings[i] == null) continue;
            boolean flag = false;
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[j] == null) continue;
                if (strings[i].equals(strings[j])) {
                    strings[j] = null;
                    flag = true;
                }
            }
            if (flag) strings[i] = null;
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
