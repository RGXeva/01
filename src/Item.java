public class Item {
    protected String name;
    protected double weight;

    public Item(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    // New method to get simple class name
    public String getSimpleName() {
        return this.getClass().getSimpleName();
    }

    // Methods to get actions for this item
    public Action getPackAction() {
        return new PackAction(this);
    }

    public Action getUnpackAction() {
        return new UnpackAction(this);
    }

    @Override
    public String toString() {
        return String.format("%s (%s) has weight of %.2f kg",
                this.getSimpleName(),
                this.name,
                this.weight);
    }
}