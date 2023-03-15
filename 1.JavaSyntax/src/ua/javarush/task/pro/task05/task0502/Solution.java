package ua.javarush.task.pro.task05.task0502;

/* 
Парні та непарні комірки масиву
*/

public class Solution {
    public static final String ODD = "Непарний";
    public static final String EVEN = "Парний";
    public static String[] strings = new String[5];

    public static void main(String[] args) {
        //напишіть тут ваш код
        for(int i = 0; i < strings.length; i++) {
            if(i % 2 == 0) {
                strings[i] = "Парний";
            } else {
                strings[i] = "Непарний";
            }
        }
    }
}
