package ua.javarush.task.jdk13.task14.task1403;

/* 
Building и School
*/

public class Solution {
    public static void main(String[] args) {
        Building school = getSchool();
        Building shop = getBuilding();

        System.out.println(school);
        System.out.println(shop);
    }

    public static Building getSchool() {
        // змініть null на об'єкт класу Building або School
        return new School();
    }

    public static Building getBuilding() {
        // змініть null на об'єкт класу Building або School
        return new Building();
    }

    static class School extends Building/* Додайте сюди ваш код */ {
        @Override
        public String toString() {
            return "School";
        }
    }

    static class Building /* Додайте сюди ваш код */ {
        @Override
        public String toString() {
            return "Building";
        }
    }
}
