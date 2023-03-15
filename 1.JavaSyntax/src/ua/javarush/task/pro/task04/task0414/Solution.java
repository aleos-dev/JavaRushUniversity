package ua.javarush.task.pro.task04.task0414;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/* 
Хорошого забагато не буває
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишіть тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine();
        int i = Integer.parseInt(reader.readLine());
        do {

            System.out.println(str);
            if (i < 1 || i > 4) break;
            i--;
        } while (i > 0);

    }
}