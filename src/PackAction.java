public class PackAction extends Action {
    private Item item;

    public PackAction(Item item) {
        this.item = item;
    }

    @Override
    public String execute(Camper camper, Campsite campsite) {
        // The idea of this action is that:

        // we want to pack the item that's available at the campsite to our backpack.
        // if we can pack the item (meaning that the weight will not exceed the backpack weight limit)
        // then we will pack the item and remove the item from the campsite
        // otherwise, we will say that the item can't be packed as it will exceed the backpack limit

        if (camper.getBackpack().add(item)) {
            // do what we need to do here
            campsite.removeItem(item);
            return camper.toString() + " packed " + this.item.getSimpleName() + " to the backpack";
        }
        return this.item.getSimpleName() + " can not be packed as it will exceed the backpack limit";
    }

    @Override
    public String menuDescription(Camper camper) {
        return camper.toString() + " will pack " + this.item.getSimpleName() + " to the backpack";
    }
}
