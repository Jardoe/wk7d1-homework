package Kaiju;

import Kaiju.Interfaces.ILand;

public class Gojira extends Kaiju implements ILand{

    public Gojira(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    @Override
    public String roar() {
        return "Rawr";
    }

    @Override
    public String move() {
        return "thud thud thud";
    }



}
