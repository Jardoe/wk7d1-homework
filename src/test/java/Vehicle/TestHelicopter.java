package Vehicle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestHelicopter {

    Helicopter helicopter;

    @Before
    public void before(){
        helicopter = new Helicopter("Helicopter", 4, 2);
    }

    @Test
    public void canGetType(){
        assertEquals("Helicopter", helicopter.getType());
    }

    @Test
    public void canGetHealth(){
        assertEquals(4, helicopter.getHealth());
    }

    @Test
    public void canGetAttack(){
        assertEquals(2, helicopter.getAttack());
    }

    @Test
    public void helicopterCanFly(){
        assertEquals("pb pb pb", helicopter.fly());
    }

}