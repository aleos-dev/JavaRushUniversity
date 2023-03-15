package ua.javarush.task.pro.task15.task1524;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Переплутані байти
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        try (var reader = new BufferedReader(new InputStreamReader(System.in));
             var fis = new FileInputStream(reader.readLine());
             var fos = new FileOutputStream(reader.readLine())) {

             byte[] dataFromFile1 = fis.readAllBytes();

             for(int i = 0; i < dataFromFile1.length / 2; i++) {
                 fos.write(dataFromFile1[i*2 + 1]);
                 fos.write(dataFromFile1[i*2]);
             }
             if (dataFromFile1.length % 2 == 1){
                 int lastIndex = dataFromFile1.length - 1;
                 fos.write(dataFromFile1[lastIndex]);
             }

        } catch (IOException e) {
        }
    }
}