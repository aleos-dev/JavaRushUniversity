package ua.javarush.task.jdk13.task38.task3801;

/* 
Annotation + Reflection
*/

public class Solution {
    public static void main(String[] args) throws IllegalAccessException {
        JavaRushBankAccount account = new JavaRushBankAccount("Mr.Smith");
        System.out.println("Перевірка №1:");
        ReflectionAnnotationUtil.check(account);

        System.out.println("Перевірка №2:");
        account.setAmount(100);
        ReflectionAnnotationUtil.check(account);

        System.out.println("Перевірка №3:");
        ReflectionAnnotationUtil.check(new IncorrectAccount());
/* Очікуване виведення:

Перевірка №1:
Поле amount у класі JavaRushBankAccount має анотацію LongPositive, але його значення не додатне.
Перевірка №2:
Перевірка №3:
Поле amountString у класі IncorrectAccount має анотацію LongPositive, але його тип String.

*/
    }
}
