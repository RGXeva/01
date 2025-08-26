public class Bottle extends Item {
    private double capacity;

    public Bottle(String name) {
        super(name, 1.0); // Weight is 1kg
        this.capacity = 1.0; // Capacity is 1 Liter
    }

    @Override
    public String toString() {
        return String.format("Bottle (%s) has weight of %.2f kg - to drink, with %.1f liter left.",
                name, weight, capacity);
    }
}