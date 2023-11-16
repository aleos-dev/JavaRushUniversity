package ua.javarush.task.jdk13.task41.task4119;

import ua.javarush.task.jdk13.task41.task4119.customer.Customer;
import ua.javarush.task.jdk13.task41.task4119.shop.Item;
import ua.javarush.task.jdk13.task41.task4119.shop.ShoppingCart;
import ua.javarush.task.jdk13.task41.task4119.strategy.CashStrategy;
import ua.javarush.task.jdk13.task41.task4119.strategy.CreditCardStrategy;
import ua.javarush.task.jdk13.task41.task4119.strategy.PaypalStrategy;

import java.time.LocalDate;

import static java.util.Calendar.SEPTEMBER;

/* 
Стратегічний шопінг
*/

public class Solution {

    public static void main(String[] args) {
        Customer customer = new Customer("Панас Мирний", "panas.m@example.com", "1234-5678-9012-3456", 786, LocalDate.of(2026, SEPTEMBER, 1), "mypwd");

        ShoppingCart cart1 = new ShoppingCart(new CashStrategy());
        cart1.addItem(new Item(847, "Електрична зубна щітка", 12));
        cart1.addItem(new Item(939, "Тример", 19));
        cart1.pay();

        ShoppingCart cart2 = new ShoppingCart(new CreditCardStrategy(customer));
        cart2.addItem(new Item(2621, "Електричний термометр", 9));
        cart2.addItem(new Item(923, "Купальний костюм", 39));
        cart2.pay();

        ShoppingCart cart3 = new ShoppingCart(new PaypalStrategy(customer));
        cart3.addItem(new Item(285, "Блайзер", 5));
        cart3.addItem(new Item(266, "Велосипед", 149));
        cart3.pay();
    }
}
