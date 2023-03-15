package ua.javarush.task.pro.task05.task0505;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишіть тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String arrSize = reader.readLine();
        int length = Integer.parseInt(arrSize);
        if (length <= 0) {
            System.exit(1);
        }
        int[] intArray = new int[length];
        for (int i = 0; i < length; i++) {
            intArray[i] = Integer.parseInt(reader.readLine());
        }

        if (length % 2 == 1) {
            for (int i : intArray) {
                System.out.println(i);
            }
        } else {
            for (int i = length - 1; i >= 0; i--) {
                System.out.println(intArray[i]);
            }
        }

    }
}
