package ua.javarush.task.jdk13.task34.task3407;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;

/* 
Збирач типів
*/

public class Solution {

    private Map<TimeUnit, BiFunction<Integer, Long, Map<Boolean, List<String>>>> field;

    public static void main(String[] args) throws Exception {
        getTypes(Solution.class.getDeclaredField("field").getGenericType()).forEach(System.out::println);
    }

    public static Set<Type> getTypes(Type type) {
        //напишіть тут ваш код
        Set<Type> result = new HashSet<>();

        if (type instanceof ParameterizedType) {
            ParameterizedType pt = (ParameterizedType) type;
            result.add(pt.getRawType());

            for (Type t: pt.getActualTypeArguments()) {
                result.addAll(getTypes(t));
            }

        } else {
            result.add(type);
        }

        return result;
    }
}
