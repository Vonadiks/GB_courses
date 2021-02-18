package ru.geekbrains.lesson6;

public class Cat extends Animal
{
    public Cat(String name, int maxRunLimit, int maxSwimLimit)
    {
        super(name, maxRunLimit, 0);
    }

    @Override
    public void swim(int swimLimit)
    {
        System.out.println("Коты не умеют плавать!");
    }

}
