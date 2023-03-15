package ua.javarush.task.pro.task10.task1020;

public class Computer {
    Keyboard keyboard;
    Monitor monitor;
    Mouse mouse;
    SystemUnit systemUnit;

    public Computer() {
        keyboard = new Keyboard();
        monitor = new Monitor();
        mouse = new Mouse();
        systemUnit = new SystemUnit();
    }

}
