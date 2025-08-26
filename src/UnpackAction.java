public class UnpackAction extends Action {
    private Item item;

    public UnpackAction(Item item) {
        this.item = item;
    }

    @Override
    public String execute(Camper camper, Campsite campsite) {
        // Remove from backpack and add to campsite
        camper.getBackpack().remove(item);
        campsite.addItem(item);
        return camper.toString() + " removed " + this.item.getSimpleName() + " from the backpack";
    }

    @Override
    public String menuDescription(Camper camper) {
        return camper.toString() + " will unpack " + this.item.getSimpleName() + " from the backpack";
    }
}