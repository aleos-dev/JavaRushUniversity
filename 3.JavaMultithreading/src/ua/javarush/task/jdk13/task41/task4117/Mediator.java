package ua.javarush.task.jdk13.task41.task4117;

public interface Mediator {
    void sendMessage(String msd, int userId);
    void register(User user);
}
