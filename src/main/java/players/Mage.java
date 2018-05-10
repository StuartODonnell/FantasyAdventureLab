package players;

import creatures.Protector;
import items.Item;

public class Mage extends Player {

    private Protector defender;

    public Mage(CharacterType charactertype) {
        super(charactertype);
        defender = null;
    }

    public boolean hasDefender(){
        if (this.defender != null){
            return true;
        }
        return false;
    }

    public void dismissDefender(){
        this.defender = null;
    }

    public void summonDefender(Protector defender){
        if(!hasDefender()) {
            this.defender = defender;
        }
    }

}
