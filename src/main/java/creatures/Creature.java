package creatures;

public abstract class Creature {

    protected int health;

    public Creature(int health){
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public abstract int attack();

}
