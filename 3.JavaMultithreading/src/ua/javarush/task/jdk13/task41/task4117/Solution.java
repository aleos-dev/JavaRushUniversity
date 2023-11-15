package ua.javarush.task.jdk13.task41.task4117;

/* 
Вітаннячка в цьому чаті
*/

public class Solution {
    public static void main(String[] args) {
        UserDB db = new UserDB();
        Mediator chat = new Chat(db);
        User user1 = new User(chat,1, "Льоша");
        User user2 = new User(chat,2, "Боря");
        User user3 = new User(chat,3, "Чінгіз");
        User user4 = new User(chat,4, "David");

        db.add(user1);
        db.add(user2);
        db.add(user3);
        db.add(user4);

        user1.send("Добрий день, Борисе Олексійовичу", 2);
        user2.send("Вітаю! Олексій Борисович", 1);
    }
}
