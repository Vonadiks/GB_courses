package ru.geekbrains.lesson6;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal( "Петька",100, 150);
        animal.run(10);
        Cat cat1 = new Cat("Васька",200, 0);
        cat1.swim(200);
        cat1.run(20);
        Dog dog1 = new Dog("Шарик", 500, 10);
        dog1.run(200);
        dog1.swim(9);
    }

}
