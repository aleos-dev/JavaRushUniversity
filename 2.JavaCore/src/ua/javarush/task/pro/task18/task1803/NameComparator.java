package ua.javarush.task.pro.task18.task1803;

import java.util.Comparator;

/* 
Наставники JavaRush
*/

public class NameComparator implements Comparator<JavaRushMentor> {
    //напишіть тут ваш код

    public int compare(JavaRushMentor m1, JavaRushMentor m2) {
        return m1.getName().length() - m2.getName().length();
    }
}
