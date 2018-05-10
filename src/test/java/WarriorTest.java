import org.junit.Before;
import org.junit.Test;
import players.CharacterType;
import players.Designation;
import players.Warrior;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class WarriorTest {

    Warrior warrior;

    @Before
    public void setUp() {

        warrior = new Warrior(CharacterType.BARBARIAN);

    }

    @Test
    public void getHealth() {
        assertEquals(100, warrior.getHealth());
    }

    @Test
    public void getSwagbag() {
        assertEquals(0, warrior.getSwagbag());
    }

    @Test
    public void getInventoryCount() {
        assertEquals(0, warrior.getInventoryCount());
    }

    @Test
    public void getCharacterType(){
        assertEquals(CharacterType.BARBARIAN, warrior.getCharactertype());
    }

    @Test
    public void getDesignation(){
        assertEquals(Designation.WARRIOR, warrior.getDesignation());
    }

    @Test
    public void basicAttack() {
        assertEquals(1, warrior.basicAttack());
    }


    @Test
    public void decreaseHealth() {
        warrior.decreaseHealth(10);
        assertEquals(90, warrior.getHealth());
    }

    @Test
    public void increaseHealth() {
        warrior.increaseHealth(10);
        assertEquals(110, warrior.getHealth());
    }

    @Test
    public void increaseSwag() {
        warrior.increaseSwag(10);
        assertEquals(10, warrior.getSwagbag());
    }

    @Test
    public void decreaseSwag() {
        warrior.increaseSwag(10);
        warrior.increaseSwag(10);
        warrior.decreaseSwag(10);
        assertEquals(10, warrior.getSwagbag());
    }
}
