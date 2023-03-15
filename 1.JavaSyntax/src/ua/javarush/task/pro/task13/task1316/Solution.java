package ua.javarush.task.pro.task13.task1316;

public class Solution {

    public static void main(String[] args) {
        //напишіть тут ваш код
        var questsJR = JavarushQuest.values();
        for(JavarushQuest instance: questsJR) {
            System.out.println(instance.ordinal());
        }
    }
}
