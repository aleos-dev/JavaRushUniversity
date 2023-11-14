package ua.javarush.task.jdk13.task41.task4116;

/* 
Шерсть та зірки
*/

import ua.javarush.task.jdk13.task41.task4116.animals.Cat;
import ua.javarush.task.jdk13.task41.task4116.animals.Cow;
import ua.javarush.task.jdk13.task41.task4116.animals.Dog;
import ua.javarush.task.jdk13.task41.task4116.visitor.JsonExportVisitor;
import ua.javarush.task.jdk13.task41.task4116.visitor.YamlExportVisitor;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Cat().accept(new JsonExportVisitor()));
        System.out.println(new Cow().accept(new JsonExportVisitor()));
        System.out.println(new Dog().accept(new JsonExportVisitor()));

        System.out.println(new Cat().accept(new YamlExportVisitor()));
        System.out.println(new Cow().accept(new YamlExportVisitor()));
        System.out.println(new Dog().accept(new YamlExportVisitor()));
    }
}
