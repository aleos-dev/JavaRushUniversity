package ua.javarush.task.pro.task04.task0402;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Усі люблять Мамбу
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String text = " любить мене.";
        //напишіть тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int i = 0;
        while (i < 10) {
            System.out.println(name + text);
            i++;
        }
        reader.close();

    }
}
