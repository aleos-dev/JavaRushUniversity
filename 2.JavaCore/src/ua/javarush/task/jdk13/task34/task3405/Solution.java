package ua.javarush.task.jdk13.task34.task3405;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

/* 
Порушення приватності
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        User user = new User("Amigo", 21);
        print(getFields(user));

        Task task = new Task("task3405", true);
        print(getFields(task));
    }

    public static Map<String, Object> getFields(Object object) throws Exception {
        //напишіть тут ваш код
        Map<String, Object> resultMap = new HashMap<>();
        for (Field field: object.getClass().getDeclaredFields()) {
            if (Modifier.isPrivate(field.getModifiers())) {
                field.setAccessible(true);
                resultMap.put(field.getName(), field.get(object));
            }
        }

        return resultMap;
    }

    public static void print(Map<?, ?> fields) {
        System.out.println("-------------------");
        fields.forEach((fieldName, fieldValue) -> System.out.println(fieldName + " = " + fieldValue));
    }
}
