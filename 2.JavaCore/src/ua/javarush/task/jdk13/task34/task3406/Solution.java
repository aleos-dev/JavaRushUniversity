package ua.javarush.task.jdk13.task34.task3406;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;

/* 
Класні методи
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        print(getMethods(Set.of(Object.class, Math.class, Arrays.class)));
    }

    public static Map<Class<?>, Set<String>> getMethods(Set<Class<?>> classes) {
        //напишіть тут ваш код
        Map<Class<?>, Set<String>> resultMap = new HashMap<>();

        for (Class<?> clazz: classes) {

            Set<String> methodNameSet = new HashSet<>();
            for (Method method : clazz.getDeclaredMethods()) {
                if (Modifier.isStatic(method.getModifiers())) {
                    methodNameSet.add(method.getName());
                }
            }

            resultMap.put(clazz, methodNameSet);
        }

        return resultMap;
    }

    public static void print(Map<?, ?> map) {
        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
