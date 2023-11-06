package ua.javarush.task.jdk13.task41.task4110;

import ua.javarush.task.jdk13.task41.task4110.builders.PizzaBuilder;
import ua.javarush.task.jdk13.task41.task4110.builders.PizzaRecipeBuilder;
import ua.javarush.task.jdk13.task41.task4110.director.Director;
import ua.javarush.task.jdk13.task41.task4110.pizzas.Pizza;
import ua.javarush.task.jdk13.task41.task4110.pizzas.Recipe;

/* 
Усі ходи записані
*/

public class Solution {

    public static void main(String[] args) {
        Director director = new Director();

        PizzaBuilder builder = new PizzaBuilder();
        director.makeHawaiianPizza(builder);
        Pizza pizza = builder.getResult();
        System.out.println("Pizza made:\n" + pizza.getType());

        PizzaRecipeBuilder recipeBuilder = new PizzaRecipeBuilder();
        director.makeSpicyPizza(recipeBuilder);
        Recipe pizzaRecipe = recipeBuilder.getResult();
        System.out.println("\nPizza recipe made:\n" + pizzaRecipe.print());
    }
}
