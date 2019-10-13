package template;

public abstract class Meal {
    public void doMeal() {
        prepare();
        cook();
        eat();
        cleanUp();
    }

    public abstract void prepare();
    public abstract void cook();
    public void eat() {
        System.out.println("Eat");
    }

    public abstract void cleanUp();
}
