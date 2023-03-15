package ua.javarush.task.pro.task15.task1526;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        try (
                var reader = new BufferedReader(new InputStreamReader(System.in));
                var fileReader = new FileReader(reader.readLine())
        ) {
            int readed;
            var sb =new StringBuilder();
           while(fileReader.ready()) {
                readed = fileReader.read();
               if ("., ".contains(Character.toString(readed))) { continue; }
                sb.append((char)readed);
           }
           System.out.println(sb);
        } catch (IOException e) {
//            Nope
        }
    }
}