package ua.javarush.task.pro.task12.task1212;

/* 
Створюємо свій список
*/

public class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        //напишіть тут ваш код
        int currentSize = elements.length;
        int newSize = (int) (currentSize * 1.5);
        String[] newArray = new String[newSize];
        System.arraycopy(elements, 0, newArray, 0, currentSize);
        elements = newArray;
        capacity = newSize;
    }

}
