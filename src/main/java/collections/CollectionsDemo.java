package main.java.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionsDemo {

    public static void main(String[] args) {
        CollectionsDemo cd = new CollectionsDemo();
        cd.listDemo();
    }

    public List<Fruit> listDemo() {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Apple", 40));
        fruits.add(new Fruit("Mango", 20));
        fruits.add(new Fruit("Watermelon", 200));
        System.out.println(fruits);

        return fruits;
    }

    public record Fruit(String name, int price){};
}
