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
        System.out.println(firstLastName + " " + position + " " + email + " " +
                phoneNumber + " " + salary + " " + age);
    }


    


}
