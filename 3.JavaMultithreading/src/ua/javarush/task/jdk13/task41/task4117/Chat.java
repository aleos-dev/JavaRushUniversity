package ua.javarush.task.jdk13.task41.task4117;

public class Chat implements Mediator {

    private final UserDB db;

    public Chat(UserDB db) {
        this.db = db;
    }
    @Override
    public void sendMessage(String msg, int userId) {
        User receiver = db.getById(userId);
        if (receiver != null) {
            receiver.receive(msg);
        }
    }

    @Override
    public void register(User user) {
        if (user != null) {
            db.add(user);
        }
    }
}
