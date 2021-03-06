import items.Item;
import items.ItemType;
import org.junit.Before;
import org.junit.Test;
import players.CharacterType;
import players.Designation;
import players.Healer;
import players.Warrior;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class WarriorTest {

    Warrior warrior;
    Healer healer;
    Item physicalItem;
    Item magicItem;
    Item healingItem;

    @Before
    public void setUp() {

        warrior = new Warrior(CharacterType.BARBARIAN);
        healer = new Healer(CharacterType.CLERIC);
        physicalItem= new Item("Sword", ItemType.WEAPON, 10);
        magicItem = new Item("Spell", ItemType.SPELL, 5);
        healingItem = new Item("Potion", ItemType.HEALING, 10);

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
    public void addItemToInventory(){
        warrior.addItemToInventory(physicalItem);
        assertEquals(1, warrior.getInventoryCount());
    }

    @Test
    public void removeItemFromInventory(){
        warrior.addItemToInventory(physicalItem);
        warrior.addItemToInventory(physicalItem);
        warrior.removeItemFromInventory(physicalItem);
        assertEquals(1, warrior.getInventoryCount());
    }

    @Test
    public void clearInventory(){
        warrior.addItemToInventory(physicalItem);
        warrior.addItemToInventory(physicalItem);
        warrior.clearInventory();
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

    @Test
    public void nothingEquipped() {
        assertEquals(false, warrior.hasEquipped());
    }

    @Test
    public void equipPhysicalItem() {
        warrior.equip(physicalItem);
        assertEquals(true, warrior.hasEquipped());
    }

    @Test
    public void equipMagicalItem() {
        warrior.equip(magicItem);
        assertEquals(false, warrior.hasEquipped());
    }

    @Test
    public void useEquippedCleric() {
        healer.equip(healingItem);
        assertEquals(-10, healer.useEquipped());
    }

    @Test
    public void useEquippedBarbarian() {
        warrior.equip(physicalItem);
        assertEquals(10, warrior.useEquipped());
    }
}
