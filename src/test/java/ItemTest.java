import items.Item;
import items.ItemType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    Item physicalItem;
    Item magicItem;

    @Before
    public void setUp() throws Exception {
        physicalItem= new Item("Sword", ItemType.WEAPON, 10);
        magicItem = new Item("Spell", ItemType.SPELL, 5);
    }

    @Test
    public void getName() {
        assertEquals("Sword", physicalItem.getName());
    }

    @Test
    public void getType() {
        assertEquals(ItemType.SPELL, magicItem.getType());
    }


    @Test
    public void getPower() {
        assertEquals(10, physicalItem.getPower());
    }
}
