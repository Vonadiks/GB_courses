package ru.geekbrains.java2.lesson1.obstacles;

import ru.geekbrains.java2.lesson1.participants.Participant;

public class Wall implements Obstacle {

    private int height;

    public Wall(int height){
        this.height = height;
    }

    @Override
    public void doIt(Participant part) {
        part.jump(height);
    }
}
