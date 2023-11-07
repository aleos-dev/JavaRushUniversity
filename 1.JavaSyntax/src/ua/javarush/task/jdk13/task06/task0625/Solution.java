package ua.javarush.task.jdk13.task06.task0625;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
/* 
Мінімальна сума
*/

//public class Solution {
//    public static int[][] array = new int[3][3];
//
//    public static void main(String[] args) throws IOException {
//        //напишіть тут ваш код
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        for(int i = 0; i < array.length; i++) {
//            for(int j = 0; j < array[i].length; j++) {
//                array[i][j] = Integer.parseInt(reader.readLine());
//            }
//        }
//        int minSum = Integer.MAX_VALUE;
//        for(int i = 0; i < array.length; i++) {
//            int minSumRow = array[i][0];
//            int minSumColumn = array[0][i];
//            for (int j = 1; j <array[i].length; j++) {
//                minSumRow += array[i][j];
//                minSumColumn += array[j][i];
//            }
//
//            if (minSumRow < minSum && minSumRow < minSumColumn) {
//                minSum = minSumRow;
//            } else {
//                if (minSumColumn < minSum) {
//                    minSum = minSumColumn;
//                }
//            }
//        }
//        System.out.println(minSum);
//    }
//}

public class Solution {
    public static int[][] array = new int[3][3];
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner console = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int line1 = 0;
        for (int i = 0; i < array.length; i++){
            int line2 = 0;
            for (int j = 0; j < array[i].length; j++){
                int x = console.nextInt();
                array[i][j] = x;
                line2 = line2 + x;
            }
            if (line2 < min){
                min = line2;
            }
        }
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < array.length; j++){
                int x = array[j][i];
                line1 = line1 + x;
            }
            if (line1 < min){
                min = line1;
            }
        }
        System.out.println(min);
    }
}