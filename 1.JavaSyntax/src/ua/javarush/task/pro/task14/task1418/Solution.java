package ua.javarush.task.pro.task14.task1418;

/*
Власний виняток
*/
import java.util.ArrayList;

public class Solution {
    public static String message = "Схоже, що в об'єкта класу Human не ініціалізований список дітей.";

    public static void main(String[] args) {
        Human amigo = new Human("Amigo", 25, new ArrayList<>());
        System.out.printf("Ім'я: %s, вік: %d, кількість дітей: %d%n", amigo.getName(), amigo.getAge(), getChildrenCount(amigo));

        Human diego = new Human("Diego", 35);
        System.out.printf("Ім'я: %s, вік: %d, кількість дітей: %d%n", diego.getName(), diego.getAge(), getChildrenCount(diego));
    }

    public static int getChildrenCount(Human human) {
        int size;
        //напишіть тут ваш код
        try {
            size = human.getChildren().size();
        } catch (NullPointerException e) {
            throw new ChildrenNotInitializedException(message);
        }

        return size;
    }
}

