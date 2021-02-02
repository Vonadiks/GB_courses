package ru.geekbrains.lesson6;

public class Main {
    public static void main(String[] args) {

        Animal animalBegemot = new Animal("Бегемот", 200, 300);
        animalBegemot.swim(300);
        animalBegemot.run(200);
        animalBegemot.swim(400);
        animalBegemot.run(210);

        Cat catVaska = new Cat("Васька",200, 0);
        catVaska.swim(200);
        catVaska.swim(0);
        catVaska.run(20);
        catVaska.run(100);

        Dog dogSharik = new Dog("Шарик", 500, 10);
        dogSharik.run(200);
        dogSharik.run(600);
        dogSharik.swim(9);
        dogSharik.swim(11);
    }

}
