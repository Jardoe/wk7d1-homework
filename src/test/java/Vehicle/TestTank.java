package Vehicle;

import Kaiju.Gojira;
import Kaiju.Kaiju;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestTank {
    Tank tank;
    Gojira gojira;

    @Before
    public void before(){
        tank = new Tank("Tank", 5, 2);
        gojira = new Gojira("Mechazilla", 10, 3);
    }

    @Test
    public void tankHasType(){
        assertEquals("Tank", tank.getType());
    }

    @Test
    public void tankCanMove(){
        assertEquals("Vroom", tank.drive());
    }

    @Test
    public void tankCanTakeDamage(){
        gojira.attack(tank);
        assertEquals(2, tank.getHealth());
    }

    @Test
    public void tankCanDealDamage(){
        tank.attack(gojira);
        assertEquals(8, gojira.getHealthValue());
    }

    @Test
    public void cannotAttackIfDead(){
        gojira.attack(tank);
        gojira.attack(tank);
        gojira.attack(tank);
        tank.attack(gojira);
        assertEquals(10, gojira.getHealthValue());
    }

}