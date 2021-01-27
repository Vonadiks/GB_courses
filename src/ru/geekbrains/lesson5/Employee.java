package ru.geekbrains.lesson5;

public class Employee {

    String firstLastName;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;

    Employee(String firstLastName, String position, String email, String phoneNumber, int salary, int age)
    {
        this.firstLastName = firstLastName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    void printEmployeeInfo()
    {
        System.out.println(firstLastName);
        System.out.println("Position: " + position);
        System.out.println("Email: " + email);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
        System.out.println("==========================================");
    }
}
