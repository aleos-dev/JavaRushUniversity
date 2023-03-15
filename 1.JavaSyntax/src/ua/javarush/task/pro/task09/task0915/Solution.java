package ua.javarush.task.pro.task09.task0915;

import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        //напишіть тут ваш код

        StringTokenizer st = new StringTokenizer(query, delimiter);
        String[] data = new String[st.countTokens()];
        for(int i = 0; st.hasMoreTokens(); i++) {
            data[i] = st.nextToken();
        }
        return data;
    }
}
