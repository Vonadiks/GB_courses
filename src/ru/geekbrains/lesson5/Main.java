package ru.geekbrains.lesson5;

public class Main {

    public static void main(String[] args) {

        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Ivan Petrov", "Director", "director@email.ru",
               "+79000000000", 100000, 45);
        empArray[1] = new Employee("Alexey Dorofeev", "Driver", "driver@email.ru",
                "+79000000001", 30000, 40);
        empArray[2] = new Employee("Lyudmila Ivanova", "Secretary", "secretary@уmail.ru",
                "+79000000002", 20000, 25);
        empArray[3] = new Employee("Olga Gordeeva", "HR manager", "hr@email.ru",
                "+79000000003", 45000, 37);
        empArray[4] = new Employee("Vladimir Selivanov", "Engineer", "eng@email.ru",
                "+79000000004", 70000, 41);

        for (int i = 0; i < empArray.length; i++)
        {
            if (empArray[i].age > 40)
            {
                empArray[i].printEmployeeInfo();
            }

        }
    }
}
