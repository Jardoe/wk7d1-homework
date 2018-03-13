package Vehicle;
import Vehicle.Interfaces.ILand;

public class Tank extends Vehicle implements ILand{

    public Tank(String type, int healthValue, int attackValue) {
        super(type, healthValue, attackValue);


    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public String drive() {
        return "Vroom";
    }

}
