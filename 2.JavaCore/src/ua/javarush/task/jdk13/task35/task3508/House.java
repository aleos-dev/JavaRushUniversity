package ua.javarush.task.jdk13.task35.task3508;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* 
Вхід заборонено!
*/

public class House<T> {

    private List<T> residents = new ArrayList();

    public void enter(T resident) {
        residents.add(resident);
    }

    public void leave(T resident) {
        residents.remove(resident);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("У будинку знаходяться:\n");
        for (Object resident : residents) {
            builder.append(resident.toString()).append("\n");
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        Dog bruno = new Dog("Bruno");
        Puppy larsik = new Puppy("Larsik");
        Cat barsik = new Cat("Barsik");
        Kitten keksik = new Kitten("Keksik");

        House dogHouse = new House();
        dogHouse.enter(bruno);
        dogHouse.enter(larsik);
        dogHouse.enter(barsik);
        System.out.println(dogHouse.toString());

        House catHouse = new House();
        catHouse.enter(barsik);
        catHouse.enter(keksik);
        catHouse.enter(bruno);
        System.out.println(catHouse.toString());
    }
}
