import java.util.*;

public class Backpack {
    private List<Item> storage;
    private double limit = 10.0; // Weight limit in kg

    public Backpack() {
        // Initialize with ArrayList instead of fixed array
        storage = new ArrayList<>();
        storage.add(new Bedroll("KAMUI"));
        storage.add(new Bottle("Mountain Franklin"));
        storage.add(new FlintAndSteel("Aurora"));
    }

    public List<Item> getItems() {
        return storage;
    }

    public double totalWeight() {
        double total = 0;
        for (Item item : storage) {
            total += item.getWeight();
        }
        return total;
    }

    public boolean add(Item item) {
        double estimatedWeight = this.totalWeight() + item.getWeight();
        if (estimatedWeight > limit) {
            return false;
        }
        this.storage.add(item);
        return true;
    }

    public void remove(Item item) {
        storage.remove(item);
    }

    public List<Action> allowableActions() {
        List<Action> actions = new ArrayList<>();
        // Add all the possible actions that can be done with the object
        // to the list of actions that we have just instantiated.
        for (Item item : storage) {
            actions.add(item.getUnpackAction());
        }
        return actions;
    }
}