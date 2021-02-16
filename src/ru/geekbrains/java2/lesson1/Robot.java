package ru.geekbrains.java2.lesson1;

public class Robot implements Jumpable, Runnable {
    private String name;
    public Robot (String name){
        this.name = name;
    }

    @Override
    public void jump() {
        System.out.println(name + " is jumping");
    }

    @Override
    public void run() {
        System.out.println(name + " is running");
    }
}
