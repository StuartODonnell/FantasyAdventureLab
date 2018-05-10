package creatures;

public class Dragon extends Creature implements Protector {

    public Dragon(){
        super(50);
    }

    public int attack(){
        return 10;
    }

    public void protect(int damage){
        decreaseHealth(damage);
    }

}
