package ua.javarush.task.jdk13.task34.task3411;

import java.lang.reflect.Field;

/* 
Приватний батько
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Child child = Child.class.getDeclaredConstructor().newInstance();
        System.out.println(child.getPrivateField());
        setPrivateParentField(child, "privateField", "новий рядок");
        System.out.println(child.getPrivateField());
    }

    public static void setPrivateParentField(Object childObject, String fieldName, Object value) throws Exception {
        //напишіть тут ваш код
        Field field = childObject.getClass().getSuperclass().getDeclaredField(fieldName);
        field.setAccessible(true);

        field.set(childObject, value);

    }
}
