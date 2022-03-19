package ru.geekbrains.lesson3;

public abstract class Fruit {
    float weight;

    public Fruit(float v) {
    }

    public void add(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }
}