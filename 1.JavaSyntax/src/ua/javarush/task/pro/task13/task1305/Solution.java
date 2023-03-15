package ua.javarush.task.pro.task13.task1305;

import java.util.ArrayList;
import java.util.Iterator;

/* 
Знайти і знешкодити
*/

public class Solution {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello world!");
        words.add("Amigo");
        words.add("Elly");
        words.add("Kerry");
        words.add("Bug");
        words.add("bug");
        words.add("Easy ug");
        words.add("Risha");

        ArrayList<String> copyWordsFirst = new ArrayList<>(words);
        ArrayList<String> copyWordsSecond = new ArrayList<>(words);
        ArrayList<String> copyWordsThird = new ArrayList<>(words);

        removeBugWithFor(copyWordsFirst);
        removeBugWithWhile(copyWordsSecond);
        removeBugWithCopy(copyWordsThird);

        copyWordsFirst.forEach(System.out::println);
        String line = "_________________________";
        System.out.println(line);
        copyWordsSecond.forEach(System.out::println);
        System.out.println(line);
        copyWordsThird.forEach(System.out::println);
        System.out.println(line);
    }

    public static void removeBugWithFor(ArrayList<String> list) {
        //напишіть тут ваш код
        for (int i = 0; i < list.size(); i++) {
            if ("bug".equalsIgnoreCase(list.get(i))) {
                list.remove(i--);
            }
        }
    }

    public static void removeBugWithWhile(ArrayList<String> list) {
        //напишіть тут ваш код
        int i = 0;
        while (i < list.size()) {
            if ("bug".equalsIgnoreCase(list.get(i))) {
                list.remove(i--);
            }
            i++;
        }
    }

    public static void removeBugWithCopy(ArrayList<String> list) {
        //напишіть тут ваш код
        var copyOfList = new ArrayList<String>(list);
        int index = 0;
        for(String word: copyOfList) {
            if ("bug".equalsIgnoreCase(word)) {
               list.remove(index--);
            }
            index++;
        }
    }
}
