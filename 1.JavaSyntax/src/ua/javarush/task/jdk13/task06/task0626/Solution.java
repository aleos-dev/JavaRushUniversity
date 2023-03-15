package ua.javarush.task.jdk13.task06.task0626;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Перша база даних
*/

public class Solution {
    public static String[][] array = new String[][]{
            {"123", "Іванов", "Богдан"},
            {"1425", "Петрова", "Марина"},
            {"37", "Богдан", "Андрій"},
            {"98", "Богданова", "Марина"},
            {"6285", "Прутко", "Сергій"},
            {"8", "Клочкова", "Олена"},
            {"754", "Котов", "Іван"}};

    public static void main(String[] args) throws IOException {
        //напишіть тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String dataForSearch = reader.readLine();

        for(int i = 0; i < array.length; i++) {
            boolean isWhatIsNeeded = false;
            for(int j = 0; j < array[i].length; j++) {
                if(dataForSearch.equals(array[i][j])) {
                    isWhatIsNeeded = true;
                }
            }
            if (isWhatIsNeeded) {
                int j = 0;
                for(; j < array[j].length - 1; j++) {
                    System.out.print (array[i][j] + " ");
                }
                System.out.println(array[i][j]);
            }
        }
    }
}
