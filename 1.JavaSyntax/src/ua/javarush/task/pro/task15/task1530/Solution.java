package ua.javarush.task.pro.task15.task1530;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

/* 
Байти у символи
*/

public class Solution {

    public static void main(String[] args) {
        ByteArrayInputStream stream = new ByteArrayInputStream("O sole, o sole mio!\nSta 'nfronte a te!\n Sta 'nfronte a te!".getBytes(StandardCharsets.UTF_8));
        System.out.println(new String(bytesToChars(stream, 38)));
    }

    //напишіть тут ваш код
    public static char[] bytesToChars(ByteArrayInputStream bais, int n) {
        int size = Math.min(n, bais.available());
        var chars = new char[size];
        byte[] byteArray = bais.readAllBytes();
        for(int i = 0; i < size; i++) {
            chars[i] = (char) byteArray[i];
        }
        return chars;

    }
}
