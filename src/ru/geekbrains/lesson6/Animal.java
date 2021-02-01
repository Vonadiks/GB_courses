package ru.geekbrains.lesson6;

public class Animal {
    int maxRunLimit;
    int maxSwimLimit;
    String name;

    public Animal (String name, int maxRunLimit, int maxSwimLimit)
    {
        this.name = name;
        this.maxRunLimit = maxRunLimit;
        this.maxSwimLimit = maxSwimLimit;
    }

    public void run(int runLimit)
    {
        if (runLimit < maxRunLimit)
        {
            System.out.println(name + " пробежит " + runLimit + "м.");
        }
        else
        {
            System.out.println("Животное устанет");
        }

    }

    public void swim(int swimLimit)
    {
        if (swimLimit < maxSwimLimit)
        {
            System.out.println(name + " проплывет " + swimLimit + "м.");
        }
        else
        {
            System.out.println("Животное устанет");
        }

    }

    public String getName()
    {
        return name;
    }

}
