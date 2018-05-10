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

    public void setHealth(int health) {
        this.health = health;
    }

    public CharacterType getCharactertype() {
        return charactertype;
    }

    public int getSwagbag() {
        return swagbag;
    }

    public void setSwagbag(int swagbag) {
        this.swagbag = swagbag;
    }

    public int basicAttack(){
        return 1;
    }

    public int getInventroyCount(){
        return this.inventory.size();
    }

    public Designation getDesignation(){
        return getCharactertype().getDesignation();
    }

}
