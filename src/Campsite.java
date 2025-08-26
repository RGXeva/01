import java.util.*;

public class Campsite {
    private Camper camper;
    private List<Item> scatteredItems;

    public Campsite() {
        // Initialize with a camper
        this.camper = new Camper("Cloudy");

        // Initialize scattered items at campsite
        this.scatteredItems = new ArrayList<>();
        // Add initial item at campsite as shown in expected output
        scatteredItems.add(new Bedroll("KAMUI V2"));
    }

    public void addItem(Item item) {
        scatteredItems.add(item);
    }

    public void removeItem(Item item) {
        scatteredItems.remove(item);
    }

    public List<Item> getScatteredItems() {
        return scatteredItems;
    }

    public List<Action> allowableActions() {
        List<Action> actions = new ArrayList<>();
        // Add pack actions for all scattered items
        for (Item item : scatteredItems) {
            actions.add(item.getPackAction());
        }
        return actions;
    }

    public void displayCampsiteItems() {
        System.out.println("Here are the items that we have on campsite:");
        for (Item item : scatteredItems) {
            System.out.println(item.toString());
        }
        System.out.println();
    }

    public void simulate() {
        System.out.println("#########################################");

        // Check all items the camper has
        camper.checkAllItems();

        // Display campsite items
        displayCampsiteItems();

        List<Action> actions = new ArrayList<>();
        actions.addAll(this.allowableActions());
        actions.addAll(camper.allowableActions());

        System.out.println("#########################################");

        if (!actions.isEmpty()) {
            Action action = Menu.showMenu(actions, camper);
            System.out.println(action.execute(camper, this));
        } else {
            System.out.println("No actions available.");
        }
    }
}