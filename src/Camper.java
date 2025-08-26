import java.util.*;

public class Camper {
    private String name;
    private Backpack backpack;
    private int hydration;
    private int coldness;

    public Camper(String name) {
        this.name = name;
        this.backpack = new Backpack();
        this.hydration = 20;
        this.coldness = 20;
    }

    public String getName() {
        return name;
    }

    public Backpack getBackpack() {
        return backpack;
    }

    public int getHydration() {
        return hydration;
    }

    public int getColdness() {
        return coldness;
    }

    public void checkAllItems() {
        System.out.printf("Here are the items that %s has in the Backpack (%.2f / %.2fkg):\n",
                name, backpack.totalWeight(), 10.00);

        List<Item> items = backpack.getItems();
        for (Item item : items) {
            System.out.println(item.toString());
        }

        System.out.println();
    }

    public List<Action> allowableActions() {
        return backpack.allowableActions();
    }

    @Override
    public String toString() {
        return String.format("%s (hydration level: %d, coldness level: %d)",
                name, hydration, coldness);
    }
}