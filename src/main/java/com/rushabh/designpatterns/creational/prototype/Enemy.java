package com.rushabh.designpatterns.creational.prototype;

public class Enemy implements EnemyPrototype{
    private String type;
    private int health;
    private int attackPower;

    public Enemy(String type, int health, int attackPower) {
        this.type = type;
        this.health = health;
        this.attackPower = attackPower;
    }

    // Shallow copy clone method
    @Override
    public EnemyPrototype clone() {
        return new Enemy(type, health, attackPower);
    }

    // Deep copy clone method
    public EnemyPrototype deepClone() {
        return new Enemy(new String(type), health, attackPower);
    }

    public void printStats() {
        System.out.println("Enemy{" +
                "type='" + type + '\'' +
                ", health=" + health +
                ", attackPower=" + attackPower +
                '}');
    }
}
