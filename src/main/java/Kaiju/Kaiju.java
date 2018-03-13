package Kaiju;

import Vehicle.IAttack;
import Vehicle.ITakeDamage;

public abstract class Kaiju implements ITakeDamage, IAttack {
    private String name;
    private int healthValue;
    private int attackValue;

    public Kaiju(String name, int healthValue, int attackValue){
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;

    }

    public abstract String roar();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void setAttackValue(int attackValue) {
        this.attackValue = attackValue;
    }

    @Override
    public void attack(ITakeDamage object){
        if (healthValue > 0){
            object.damage(attackValue);
        }
    }

    @Override
    public void damage(int amount){
        healthValue -= amount;
    }
}
