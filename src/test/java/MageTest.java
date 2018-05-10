import creatures.Dragon;
import org.junit.Before;
import org.junit.Test;
import players.CharacterType;
import players.Mage;

import static org.junit.Assert.assertEquals;

public class MageTest {

    Mage mage;
    Dragon dragon;

    @Before
    public void setUp() throws Exception {
        mage = new Mage(CharacterType.WIZARD);
        dragon = new Dragon();
    }

    @Test
    public void hasDefender() {
        assertEquals(false, mage.hasDefender());
    }

    @Test
    public void addDefender() {
        mage.summonDefender(dragon);
        assertEquals(true, mage.hasDefender());
    }

    @Test
    public void dismissDefender() {
        mage.summonDefender(dragon);
        mage.dismissDefender();
        assertEquals(false, mage.hasDefender());
    }
}
