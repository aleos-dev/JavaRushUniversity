package ua.javarush.task.jdk13.task13.task1302;

/* 
Selectable та Updatable
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    //напишіть тут ваш код

    public class Screen implements Selectable, Updatable {
        public void onSelect() {}
        public void refresh() {}
    }
}
