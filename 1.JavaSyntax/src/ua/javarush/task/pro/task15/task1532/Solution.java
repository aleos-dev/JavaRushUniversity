package ua.javarush.task.pro.task15.task1532;

import java.io.ByteArrayOutputStream;

/* 
Шифр
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(encrypt("abcdefghi"));
    }

    public static ByteArrayOutputStream encrypt(String message) {
        //напишіть тут ваш код
        var baos = new ByteArrayOutputStream(message.length());
        byte[] bytesOfMessage = message.getBytes();
        int size = bytesOfMessage.length;
        for(int i = 0; i < size / 2; i++) {
           baos.write(bytesOfMessage[i]);
           baos.write(bytesOfMessage[size - i - 1]);
        }
        if ((size & 1) == 1) {
            baos.write(bytesOfMessage[size/2]);
        }

        return baos;
    }
}
