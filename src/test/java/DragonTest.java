import creatures.Dragon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonTest {

    Dragon dragon;

    @Before
    public void setUp() throws Exception {
        dragon = new Dragon();
    }

    @Test
    public void getHealth() {
        assertEquals(50, dragon.getHealth());
    }

    @Test
    public void attack() {
        assertEquals(10, dragon.attack());
    }
}
