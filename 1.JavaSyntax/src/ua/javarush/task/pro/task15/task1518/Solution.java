package ua.javarush.task.pro.task15.task1518;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
А що там у папці?
*/

public class Solution {

    private static final String THIS_IS_FILE = " - це файл";
    private static final String THIS_IS_DIR = " - це директорія";

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path directory = Path.of(scanner.nextLine());
        //напишіть тут ваш код
        try(DirectoryStream<Path> paths = Files.newDirectoryStream(directory)) {
            for(Path p: paths) {
                if (Files.isRegularFile(p)) {
                    System.out.println(p + THIS_IS_FILE);
                } else if (Files.isDirectory(p)) {
                    System.out.println(p + THIS_IS_DIR);
                }
            }
        }
    }
}

