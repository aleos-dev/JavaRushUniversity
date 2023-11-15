package ua.javarush.task.jdk13.task41.task4117;

public class User {

    private int id;
    private String name;
    private Mediator mediator;

    public User(Mediator mediator, int id, String name) {
        this.mediator = mediator;
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void send(String msg, int userId) {
        System.out.println(name + " :: вихідне повідомлення : " + msg);
        mediator.sendMessage(msg, userId);
    }

    public void receive(String msg) {
        System.out.println(name + " :: вхідне повідомлення : " + msg);
    }
}