package ua.javarush.task.jdk13.task34.task3410;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* 
Обнулення об'єкту
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        User user = new User(28219, "Paulo", 40, 9999, "paulo@javarush.com");
        System.out.println(user);
        reset(user);
        System.out.println(user);
    }

    public static void reset(Object object) throws Exception {
        //напишіть тут ваш код
        for (Field field: object.getClass().getDeclaredFields()) {
            int mod = field.getModifiers();
            if (!Modifier.isStatic(mod) && Modifier.isPrivate(mod) && !field.getType().isPrimitive()) {
                field.setAccessible(true);
                field.set(object, null);
            }
        }

    }
}
