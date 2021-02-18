package ru.geekbrains.java2.lesson1;

import ru.geekbrains.java2.lesson1.obstacles.Obstacle;
import ru.geekbrains.java2.lesson1.obstacles.Track;
import ru.geekbrains.java2.lesson1.obstacles.Wall;
import ru.geekbrains.java2.lesson1.participants.Cat;
import ru.geekbrains.java2.lesson1.participants.Human;
import ru.geekbrains.java2.lesson1.participants.Participant;
import ru.geekbrains.java2.lesson1.participants.Robot;

public class Main {
    public static void main(String[] args) {
        //проверка 1 пункта задания
//        Cat cat1 = new Cat("Vaska", 200, 2);
//        cat1.jump(2);
//        cat1.run(3);
//        Human ivan = new Human("Ivan");
//        ivan.jump(2);
//        ivan.run(8);
//        Robot r2d2 = new Robot("R2D2");
//        r2d2.jump(2);
//        r2d2.run(2);

        Participant[] participants = {
                new Human("Ivan"),
                new Cat("Vaska"),
                new Robot("T8000"),
                new Cat("Murzik", 200, 3),
                new Human("Sarah Connor", 5000, 5)
        };

        Obstacle[] obstacles = {
                new Track(400),
                new Wall(1)
        };

        for (Participant part : participants) {
            for (Obstacle o : obstacles) {
                o.doIt(part);
                if (!part.isOnDistance()) {
                    break;
                }
            }
        }

        for (Participant part : participants) {
            part.info();
        }
    }
}
