package ua.javarush.task.jdk13.task17.task1706;

/* 
Синхронізований президент
*/

public class Solution {

    public static void main(String[] args) {
        OurPresident expectedPresident = OurPresident.getOurPresident();
        OurPresident ourPresident = OurPresident.getOurPresident();
        System.out.println(expectedPresident == ourPresident);
    }
}
