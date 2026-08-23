package com.rushabh.designpatterns.creational.prototype;

// Main class to demonstrate the Prototype pattern
public class main {
    public static void main(String[] args) {
        // Using the EnemyRegistry to create and manage enemy prototypes
        EnemyRegistry registry = new EnemyRegistry();
        registry.register("zombie", new Enemy("Zombie", 100, 10));
        registry.register("vampire", new Enemy("Vampire", 150, 20));

        Enemy zombie = registry.get("zombie");
        Enemy vampire = registry.get("vampire");

        zombie.printStats();
        vampire.printStats();

        // Demonstrating using cloning
        Enemy deepClonedZombie = (Enemy) zombie.deepClone();
        deepClonedZombie.printStats();
    }
}
