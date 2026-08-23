package com.rushabh.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

// Registry class for the Prototype pattern
public class EnemyRegistry {
    private Map<String, Enemy> prototypes = new HashMap<>();

    public void register(String key, Enemy prototype) {
        prototypes.put(key, prototype);
    }

    public Enemy get(String key) {
        Enemy prototype = prototypes.get(key);
        if (prototype == null) {
            throw new IllegalArgumentException("No prototype registered for: " + key);
        }
        return (Enemy) prototype.clone();
    }
}
