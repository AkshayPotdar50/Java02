package com.java.design;

interface Pizza{
    String getDiscription();

    double cost();
}

class BasicPizza implements Pizza{

    @Override
    public String getDiscription() {
        return "Basic Pizza";
    }

    @Override
    public double cost() {
        return 5.0;
    }
}

abstract class PizzaDecorator implements Pizza{

protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDiscription() {
        return pizza.getDiscription();
    }

    @Override
    public double cost() {
        return pizza.cost();
    }
}
class ExtraCheeseDecorator extends PizzaDecorator{

    public ExtraCheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDiscription() {
        return pizza.getDiscription()+ " Extra cheese";
    }

    @Override
    public double cost() {
        return pizza.cost() +1.5;
    }
}

class PepproniDecorator extends PizzaDecorator{

    public PepproniDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDiscription() {
        return pizza.getDiscription()+" extra pepproni";
    }

    @Override
    public double cost() {
        return pizza.cost()+2.0;
    }
}
public class Decorator {
    public static void main(String[] args) {
        // Ordering a basic pizza
        Pizza basicPizza = new BasicPizza();
        System.out.println("Description: " + basicPizza.getDiscription());
        System.out.println("Cost: $" + basicPizza.cost());

        // Adding extra cheese to the pizza
        Pizza pizzaWithExtraCheese = new ExtraCheeseDecorator(basicPizza);
        System.out.println("\nDescription: " + pizzaWithExtraCheese.getDiscription());
        System.out.println("Cost: $" + pizzaWithExtraCheese.cost());

        // Adding pepperoni to the pizza with extra cheese
        Pizza pizzaWithExtraCheeseAndPepperoni = new PepproniDecorator(pizzaWithExtraCheese);
        System.out.println("\nDescription: " + pizzaWithExtraCheeseAndPepperoni.getDiscription());
        System.out.println("Cost: $" + pizzaWithExtraCheeseAndPepperoni.cost());

    }
}
