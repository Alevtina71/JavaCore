package ru.geekbrains.lesson3;

public class Main {
    public static void main(String[] args) {
    Box<Apple> appleBox = new Box<>();

    appleBox.addFruit(new Apple());

    Box<Fruit> fruitBox = new Box<>();

    Box<Orange> orangeBox = new Box<>();
    orangeBox.addFruit(new Orange());

    System.out.println(fruitBox.getTotalWeight());
    System.out.println(appleBox.compare(orangeBox));
    }
}