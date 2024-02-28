package Main;

import classes.animal.Animal;
import classes.animal.Lion;
import classes.animal.Zebra;
import classes.animal.ZooKeeper;
import classes.zoo.Zoo;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ZooKeeper zooKeeper = new ZooKeeper("John");

        Animal lion = new Lion("Simba", 5);
        Animal zebra = new Zebra("Marty", 6);

        Map<Animal, String> animals = new HashMap<>();
        animals.put(lion, "Meat");
        animals.put(zebra, "Grass");

        Zoo zoo = new Zoo("My Zoo", zooKeeper, animals);

        zoo.feedAllAnimals();
    }
}