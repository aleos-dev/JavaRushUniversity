package ua.javarush.task.pro.task13.task1326;

import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyQueue extends AbstractQueue<String> {

    private final List<String> values = new ArrayList<>();

    @Override
    public Iterator<String> iterator() {
        //напишіть тут ваш код
        return values.iterator();
    }

    @Override
    public int size() {
        //напишіть тут ваш код
        return values.size();
    }

    @Override
    public boolean offer(String o) {
        //напишіть тут ваш код
        return values.add(o);
    }

    @Override
    public String poll() {
        //напишіть тут ваш код
        return values.size() == 0 ? null : values.remove(0);
    }

    @Override
    public String peek() {
        //напишіть тут ваш код
        return values.size() == 0 ? null : values.get(0);
    }
}
