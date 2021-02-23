package ru.geekbrains.java2.lesson1.participants;

import java.security.acl.Permission;

public class Cat implements Participant {
    private String name;

    private int maxRunTrack;
    private int maxJumpHeight;

    private boolean onDistance;

    public Cat(String name, int maxRunTrack, int maxJumpHeight) {
        this.name = name;
        this.maxRunTrack = maxRunTrack;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
    }

    public Cat(String name) {
        this(name,500,2);
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
