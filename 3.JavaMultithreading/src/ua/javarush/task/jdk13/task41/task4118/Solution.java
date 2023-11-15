package ua.javarush.task.jdk13.task41.task4118;

import ua.javarush.task.jdk13.task41.task4118.ui.Player;
import ua.javarush.task.jdk13.task41.task4118.ui.UI;

/* 
Usb mp3 плеєр
*/

public class Solution {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
