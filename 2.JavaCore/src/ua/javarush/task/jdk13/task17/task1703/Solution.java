package ua.javarush.task.jdk13.task17.task1703;

import java.util.ArrayList;
import java.util.List;

/* 
Синхронізовані нотатки
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class Note {

        public final List<String> notes = new ArrayList<String>();

        public void addNote(int index, String note) {
            System.out.println("Зараз буде додано нотатку [" + note + "] На позицію " + index);

            synchronized (notes) {
                notes.add(index, note);
            }
            System.out.println("Вже додано нотатку [" + note + "]");
        }

        public void removeNote(int index) {
            System.out.println("Зараз буде видалено нотатку з позиції " + index);

            String note;
            synchronized (notes) {
                note = notes.remove(index);
            }
            System.out.println("Вже видалено нотатку [" + note + "] з позиції " + index);
        }
    }

}
