package ru.geekbrains.java2.lesson1.participants;

public interface Participant extends Jumpable, Runnable{
    boolean isOnDistance();
    void info();
}
