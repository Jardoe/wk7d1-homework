package Vehicle;

import Vehicle.Interfaces.IFlying;

public class Helicopter extends Vehicle implements IFlying {

    public Helicopter(String type, int healthValue, int attackValue) {
        super(type, healthValue, attackValue);
    }


    @Override
    public String fly() {
        return "pb pb pb";
    }

}
