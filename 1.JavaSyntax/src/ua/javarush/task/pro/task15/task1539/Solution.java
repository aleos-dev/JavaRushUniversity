package ua.javarush.task.pro.task15.task1539;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/* 
Використання Paths 2
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(joinToPath(Arrays.asList("d:/", "study/", "javarush/", "корисні шматки коду.txt")));
    }

    public static Path joinToPath(List<String> partsList) {
        //напишіть тут ваш код
        Path fullPath = Paths.get(partsList.get(0), partsList.subList(1, partsList.size()).toArray(new String[0]));

        return fullPath;
    }
}
