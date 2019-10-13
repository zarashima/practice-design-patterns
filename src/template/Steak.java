package template;

public class Steak extends Meal {
    @Override
    public void prepare() {
        System.out.println("Prepare Steak");
    }

    @Override
    public void cook() {
        System.out.println("Cook Steak");

    }

    @Override
    public void cleanUp() {
        System.out.println("Cleanup Steak");
    }
}
