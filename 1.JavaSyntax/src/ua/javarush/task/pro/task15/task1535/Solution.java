package ua.javarush.task.pro.task15.task1535;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/*
Розбиваємо файл на частини
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        splitFile("/home/aleos/Documents/dev/JavaRushTasks/1.JavaSyntax/src/ua/javarush/task/pro/task15/task1535/1.txt", 4);
    }

    public static void splitFile(String fileName, int partSize) throws IOException {
        try (FileChannel inputChannel = FileChannel.open(Paths.get(fileName))) {
            //напишіть тут ваш код
            ByteBuffer buf = ByteBuffer.allocate(partSize);
            int fileNumber = 0;
            while (inputChannel.read(buf) > 0) {
                fileNumber++;
                Path outputFile = Path.of(getNewFileName(fileName, fileNumber));
                buf.flip();
                try (var outputChannel = FileChannel.open(outputFile, StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
                    outputChannel.write(buf);
                    buf.clear();
                }
            }
        }
    }

    public static String getNewFileName(String oldFileName, int number) {
        int dotIndex = oldFileName.lastIndexOf(".");
        return oldFileName.substring(0, dotIndex) + number + oldFileName.substring(dotIndex);
    }
}
