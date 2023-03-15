package ua.javarush.task.pro.task10.task1012;

import java.util.Arrays;

/* 
Дефрагментація пам'яті
*/

public class Memory {

    public static void main(String[] args) {
        String[] memory = {null, "object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        //напишіть тут ваш код
        for (int i = 0, j = -1; i < array.length; i++) {
            if (array[i] == null) {
                if (j == -1) j = i;
                continue;
            }
            if(j == - 1) continue;
            swap(array, i, j);
            j = -1;
            i = j;
        }
    }

    private static void swap(String[] array, int index1, int index2) {
        String buf = array[index1];
        array[index1] = array[index2];
        array[index2] = buf;
    }
}
