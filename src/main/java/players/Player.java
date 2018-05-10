package players;


import items.Item;

import java.util.ArrayList;

public abstract class Player {

    protected int health;
    protected CharacterType charactertype;
    protected int swagbag;
    protected ArrayList<Item>inventory;

    public Player(CharacterType charactertype) {
        this.charactertype = charactertype;
        this.health =   100;
        this.swagbag = 0;
        this.inventory = new ArrayList<>();
    }

    public int getHealth() {
        return health;
    }


    public CharacterType getCharactertype() {
        return charactertype;
    }

    public int getSwagbag() {
        return swagbag;
    }


    public int basicAttack(){
        return 1;
    }

    public int getInventoryCount(){
        return this.inventory.size();
    }

    public void addItemToInventory(Item item){
        this.inventory.add(item);
    }

    public void removeItemFromInventory(Item item){
        this.inventory.remove(item);
    }

    public Designation getDesignation(){
        return getCharactertype().getDesignation();
    }

    public void increaseHealth(int value){
        this.health += value;
    }

    public void decreaseHealth(int value){
        this.health -= value;
    }

    public void increaseSwag(int value){
        this.swagbag += value;
    }

    public void decreaseSwag(int value){
        this.swagbag -= value;
    }

}
