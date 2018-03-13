package Kaiju;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestMothra {

    Mothra mothra;

    @Before
    public void before(){
        mothra = new Mothra("Mothra", 8, 2);
    }

    @Test
    public void canGetName(){
        assertEquals("Mothra", mothra.getName());
    }

    @Test
    public void canGetHealth(){
        assertEquals(8, mothra.getHealthValue());
    }

    @Test
    public void canGetAttack(){
        assertEquals(2, mothra.getAttackValue());
    }

    @Test
    public void canFly(){
        assertEquals("flap flap", mothra.fly());
    }

    @Test
    public void canRoar(){
        assertEquals("Fblthp", mothra.roar());
    }
}