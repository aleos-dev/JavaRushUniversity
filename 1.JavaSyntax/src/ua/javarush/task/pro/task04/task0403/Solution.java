package ua.javarush.task.pro.task04.task0403;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Scanner;

/* 
Підсумовування
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишіть тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String flag = "ENTER";
        String sIn;
        int result = 0;
        while (true) {
            sIn = bufferedReader.readLine();
            if (flag.equals(sIn)) break;
            result += Integer.parseInt(sIn);
        }

        System.out.println(result);

    }
}