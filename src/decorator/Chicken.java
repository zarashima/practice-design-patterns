package decorator;

public class Chicken extends Decorator {
    private Pizza pizza;

    public Chicken(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Chicken";
    }

    @Override
    Double cost() {
        return pizza.cost() + 2.0;
    }
}