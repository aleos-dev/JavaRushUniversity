package ua.javarush.task.pro.task18.task1802;

import java.util.Comparator;

/* 
Сортування за віком
*/

public class AgeComparator implements Comparator<Student> {
    //напишіть тут ваш код

    public int compare(Student student1, Student student2) {

        return student2.getAge() - student1.getAge();
    }


}
