package ru.geekbrains.java2.lesson1.obstacles;

import ru.geekbrains.java2.lesson1.participants.Participant;

public class Track implements Obstacle {

    private int track;

    public Track(int track){
        this.track = track;
    }

    @Override
    public void doIt(Participant part) {
        part.run(track);
    }
}
