package ru.geekbrains.lesson7;

public class Main
{
    public static void main(String[] args) {
        //создаем тарелку с 50 еды
        Plate plate = new Plate(50);
        //создаем массив из 5 котов и заполняем его
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Barsik", 5);
        cats[1] = new Cat("Murzik", 10);
        cats[2] = new Cat("Vaska", 22);
        cats[3] = new Cat("Ryznyi", 22);
        cats[4] = new Cat("Pushok", 10);
        //выводем первоначальное состояние сытости всех котов
        for (int i = 0; i < 5; i++) {
            if (cats[i].getSatiety() == true)
            {
                System.out.println(cats[i].getName() + " сыт!");
            }
            else System.out.println(cats[i].getName() + " голоден!");
        }
        //кормим всех котов из одной тарелки
        for (int i = 0; i < 5; i++) {
            cats[i].eat(plate);
        }
        plate.info();
        //еще раз выводим состояние сытости всех котов
        for (int i = 0; i < 5; i++) {
            if (cats[i].getSatiety() == true)
            {
                System.out.println(cats[i].getName() + " сыт!");
            }
            else System.out.println(cats[i].getName() + " голоден!");
        }
        //добавляем 30 еды в тарелку
        plate.addFood(30);
        plate.info();
        //пытаемся кормить всех котов, сытые больше не едят
        for (int i = 0; i < 5; i++) {
            cats[i].eat(plate);
        }
        plate.info();
        //выводим состояние сытости всех котов, все должны быть сыты и в тарелке осталась еда
        for (int i = 0; i < 5; i++) {
            if (cats[i].getSatiety() == true)
            {
                System.out.println(cats[i].getName() + " сыт!");
            }
            else System.out.println(cats[i].getName() + " голоден!");
        }
    }
}
