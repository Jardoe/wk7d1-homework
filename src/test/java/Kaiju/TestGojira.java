package Kaiju;

import Vehicle.Tank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestGojira {

    Gojira gojira;
    Tank tank;

    @Before
    public void before(){
        gojira = new Gojira("Mechazilla", 10, 3);
        tank = new Tank("Tank", 5, 2);
    }

    @Test
    public void canGetName(){
        assertEquals("Mechazilla", gojira.getName());
    }

    @Test
    public void canGetHealth(){
        assertEquals(10, gojira.getHealthValue());
    }

    @Test
    public void canGetAttack(){
        assertEquals(3, gojira.getAttackValue());
    }

    @Test
    public void canMove(){
        assertEquals("thud thud thud", gojira.move());
    }

    @Test
    public void canAttack(){
        gojira.attack(tank);
        assertEquals(2, tank.getHealth());
    }

    @Test
    public void canTakeDamage(){
        tank.attack(gojira);
        assertEquals(8, gojira.getHealthValue());
    }

    @Test
    public void cannotAttackIfDead(){
        tank.attack(gojira);
        tank.attack(gojira);
        tank.attack(gojira);
        tank.attack(gojira);
        tank.attack(gojira);
        gojira.attack(tank);
        assertEquals(5, tank.getHealth());
    }


}