package ua.javarush.task.pro.task13.task1322;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getShapeNameByCountOfCorners(3));
        System.out.println(getShapeNameByCountOfCorners(5));
        System.out.println(getShapeNameByCountOfCorners(1));
    }

    public static String getShapeNameByCountOfCorners(int countOfCorner) {
        String shape;
        switch (countOfCorner) {
            case 3: {
                shape = "Трикутник";
                break;
            }
            case 4: {
                shape = "Чотирикутник";
                break;
            }
            case 5: {
                shape = "П'ятикутник";
                break;
            }
            case 6: {
                shape = "Шестикутник";
                break;
            }
            case 7: {
                shape = "Семикутник";
                break;
            }
            case 8: {
                shape = "Восьмикутник";
                break;
            }
            default  : {
                shape = "Інша фігура";
            }
        }
        return shape;

    }
}
