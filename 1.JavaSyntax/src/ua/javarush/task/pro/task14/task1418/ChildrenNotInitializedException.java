package ua.javarush.task.pro.task14.task1418;

public class ChildrenNotInitializedException extends RuntimeException {
    public ChildrenNotInitializedException(String info) {
        System.out.println(info);
    }
}
