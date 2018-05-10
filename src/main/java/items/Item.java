package items;

public class Item {

    private String name;
    private ItemType type;
    private int power;

    public Item(String name, ItemType type, int power) {
        this.name = name;
        this.type = type;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public ItemType getType() {
        return type;
    }

    public int getPower() {
        return power;
    }
}
