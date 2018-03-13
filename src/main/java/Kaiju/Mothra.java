package Kaiju;

import Kaiju.Interfaces.IFlying;

public class Mothra extends Kaiju implements IFlying {
    public Mothra(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    @Override
    public String roar() {
        return "Fblthp";
    }

    @Override
    public String fly() {
        return "flap flap";
    }
}
