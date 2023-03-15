package ua.javarush.task.pro;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String firstFile = reader.readLine();
        String secondFile = reader.readLine();
        String thirdFile = reader.readLine();

        BufferedWriter firstFileWriter = new BufferedWriter(new FileWriter(firstFile));
        BufferedReader secondFileReader = new BufferedReader(new FileReader(secondFile));
        BufferedReader thirdFileReader = new BufferedReader(new FileReader(thirdFile));

        while(secondFileReader.ready()) {
            firstFileWriter.newLine();
            firstFileWriter.write(secondFileReader.readLine());
        }
        while(thirdFileReader.ready()) {
            firstFileWriter.write(thirdFileReader.readLine());
        }

        firstFileWriter.close();
        secondFileReader.close();
        thirdFileReader.close();
    }


}