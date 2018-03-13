package Vehicle;

public abstract class Vehicle implements ITakeDamage, IAttack{
    String type;
    int healthValue;
    int attackValue;


    public Vehicle(String type, int healthValue, int attackValue){
        this.type = type;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getType() {
        return type;
    }

    public int getHealth() {
        return healthValue;
    }

    public int getAttack() {
        return attackValue;
    }


    @Override
    public void attack(ITakeDamage object) {
        if (healthValue > 0) {
            object.damage(attackValue);
        }
    }

    @Override
    public void damage(int amount) {
        healthValue -= amount;
    }
}


