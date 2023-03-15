package ua.javarush.task.pro.task13.task1330;

public enum MySingleton {
    INSTANCE;
    
    MySingleton() {
        System.out.println("створення екземпляра...");
    }
}
