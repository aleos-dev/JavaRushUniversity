package ua.javarush.task.pro.task05.task0520;

import java.applet.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
Перевзуваємося на ходу
*/

public class Solution {

    public static int result = 105;

    public static void main(String[] args) {
        byte correction = Byte.MAX_VALUE;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (double fahrenheit = -459.67; fahrenheit < 451; fahrenheit += 40) {
            correction *= fahrenheit;
            System.out.println(correction);

        }
    }
}
