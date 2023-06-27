package ua.javarush.task.jdk13.task38.task3803;

/* 
Обробка анотацій
*/

public class Solution {
    public static void main(String[] args) {
        printFullyQualifiedNames(Solution.class);
        printFullyQualifiedNames(SomeTest.class);

        printValues(Solution.class);
        printValues(SomeTest.class);
    }

    public static <T> boolean printFullyQualifiedNames(Class<T> c) {
        PrepareMyTest anno = c.getDeclaredAnnotation(PrepareMyTest.class);

        if (anno == null) {
            return false;
        }

        for (String name: anno.fullyQualifiedNames()) {
            System.out.println(name);
        }
        return true;
    }

    public static <T> boolean printValues(Class<T> c) {
        PrepareMyTest anno = c.getDeclaredAnnotation(PrepareMyTest.class);

        if (anno == null) {
            return false;
        }

        for (Class<?> value: anno.value()) {
            System.out.println(value.getSimpleName());
        }
        return true;
    }
}
