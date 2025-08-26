public class Bedroll extends Item {

    public Bedroll(String name) {
        super(name, 7.0); // Weight is 7.0kg
    }

    @Override
    public String toString() {
        return String.format("Bedroll (%s) has weight of %.2f kg - to rest.",
                name, weight);
    }
}