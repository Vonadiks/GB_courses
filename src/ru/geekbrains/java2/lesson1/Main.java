package ru.geekbrains.java2.lesson1;

public class Main {
    public static void main(String[] args) {
        //проверка 1 пункта задания
        Cat cat1 = new Cat("Vaska");
        cat1.jump();
        cat1.run();
        Human ivan = new Human("Ivan");
        ivan.jump();
        ivan.run();
        Robot r2d2 = new Robot("R2D2");
        r2d2.jump();
        r2d2.run();
    }
}
