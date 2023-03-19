package ua.javarush.task.pro.task15.task1538;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

/* 
Використання Paths
*/

public class Solution {

    public static Path rpmLogPath;

    public static void main(String[] args) throws URISyntaxException {
        //напишіть тут ваш код
        URI uri = new URI("file:/usr/lib/rpm/rpm.log");
        rpmLogPath = Paths.get(uri);
    }
}
