package classes.zoo;

import classes.animal.Animal;
import classes.animal.ZooKeeper;

import java.util.Map;

public class Zoo {
    private String name;
    private ZooKeeper zooKeeper;
    private Map<Animal, String> animals;

    public Zoo(String name, ZooKeeper zooKeeper, Map<Animal, String> animals) {
        this.name = name;
        this.zooKeeper = zooKeeper;
        this.animals = animals;
    }

    public void feedAllAnimals() {
        for (Map.Entry<Animal, String> entry : animals.entrySet()) {
            Animal animal = entry.getKey();
            String food = entry.getValue();
            zooKeeper.feedAnimal(animal, food);
            // animal.eat(food);
        }
    }
}