public class FlintAndSteel extends Item {

    public FlintAndSteel(String name) {
        super(name, 0.5); // Weight is 0.5kg
    }

    @Override
    public String toString() {
        return String.format("FlintAndSteel (%s) has weight of %.2f kg - to start a fire.",
                name, weight);
    }
}