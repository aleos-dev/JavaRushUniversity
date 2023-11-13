package ua.javarush.task.jdk13.task41.task4115;

import ua.javarush.task.jdk13.task41.task4115.listeners.NotificationType;
import ua.javarush.task.jdk13.task41.task4115.publisher.NotificationManager;

public class ChainStore {

    private final String name;
    public NotificationManager notifications;

    public ChainStore(String name) {
        this.name = name;
        notifications =  new NotificationManager(NotificationType.values());
    }

    public void launchPersonalOffer() {
        System.out.println(name + " запускає спокусливі персональні знижки!");
        notifications.notify(NotificationType.PERSONAL_OFFER, name);
    }

    public void launchSale() {
        System.out.println(name + " запускає гарячий розпродаж!");
        notifications.notify(NotificationType.SALE, name);
    }

    public void launchPromo() {
        System.out.println("В " + name + " стартує супер промо акція!");
        notifications.notify(NotificationType.PROMO, name);
    }

    public void launchEvent() {
        System.out.println("В " + name + " відбудеться грандіозний захід!");
        notifications.notify(NotificationType.EVENT, name);
    }
}
