package ua.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успішність студентів
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        //напишіть тут ваш код
        grades.put("n94hUGY", 5.0);
        grades.put("n84hUGY", 4.0);
        grades.put("n34hUGY", 3.0);
        grades.put("n14hUGY", 2.0);
        grades.put("n04hUGY", 4.5);
    }
}
