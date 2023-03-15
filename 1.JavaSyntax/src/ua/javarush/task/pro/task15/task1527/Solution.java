package ua.javarush.task.pro.task15.task1527;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

/* 
Пропускаємо не всіх
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        try(
                var fileNameReader = new BufferedReader(new InputStreamReader(System.in));
                var bfr = new BufferedReader(new FileReader(fileNameReader.readLine()))
        ) {
            boolean switcher = true;
            while(bfr.ready()) {
                String line = bfr.readLine();
                if (switcher) {
                    System.out.println(line);
                    switcher = false;
                    continue;
                }
                switcher = true;
            }
        } catch (IOException e) {
            // nothing
        }
    }
}
