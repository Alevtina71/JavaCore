package ru.geekbrains.lesson3;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    ArrayList<T> fruitList;
    float totalWeight;

    public ArrayList<T> getList() {
        return fruitList;
    }

    public void addFruit(T fruit) {
        fruitList.add(fruit);

        totalWeight = totalWeight + fruit.getWeight();
    }

    public void pourTo(@NotNull Box<T> dist) {
        dist.getList().addAll(fruitList);
        fruitList.clear();
    }
    public double getTotalWeight() {
        return totalWeight;
    }
    public boolean compare(@NotNull Box<?> box) {
       return this.getTotalWeight() == box.getTotalWeight();
    }
}