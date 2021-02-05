package ru.geekbrains.lesson7;

public class Cat
{
    private String name;
    private int appetite;
    private boolean  satiety;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }
    public void eat(Plate p) {
        if (p.getFood() >= appetite)
        {
            p.decreaseFood(appetite);
            satiety = true;             //добавлено состояние сытости(задание 3)
            appetite = 0;
        }
        else System.out.println("Еды недостаточно в тарелке, добавьте!");

    }
    public boolean getSatiety()
    {
        return satiety;
    }

    public String getName()
    {
        return name;
    }

}
