package ru.geekbrains.java2.lesson1.participants;

public class Robot implements Participant {
    private String name;

    private int maxRunTrack;
    private int maxJumpHeight;

    private boolean onDistance;

    public Robot(String name, int maxRunTrack, int maxJumpHeight) {
        this.name = name;
        this.maxRunTrack = maxRunTrack;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
    }

    public Robot(String name) {
        this(name,1000,3);
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " jumped " + height + " m.");
        } else {
            System.out.println(name + " couldn't jump " + height + " m.");
            onDistance = false;
        }
    }

    @Override
    public void run(int track) {
        if (track <= maxRunTrack)
        {
            System.out.println(name + " ran " + track + " m.");
        } else {
            System.out.println(name + " couldn't run " + track + " m.");
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.printf("%s %b\n", name, onDistance);
    }
}
