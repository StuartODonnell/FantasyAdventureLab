package creatures;

public abstract class Creature {

    protected int health;

    public Creature(int health){
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void increaseHealth(int value){
        this.health += value;
    }

    public void decreaseHealth(int value){
        this.health -= value;
    }

    public abstract int attack();

}
