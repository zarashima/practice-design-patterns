package decorator;

public class Vegan extends Pizza {

    @Override
    public String getDescription() {
        return "Vegan";
    }

    @Override
    Double cost() {
        return 4.0;
    }
}
