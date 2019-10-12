package decorator;

public abstract class Pizza {
    String description;

    public String getDescription() {
        return description;
    }

    abstract Double cost();
}



abstract class Decorator extends Pizza {
    public abstract String getDescription();
}



