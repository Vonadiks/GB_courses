package ru.geekbrains.java2.lesson3;

import java.util.*;

public class HomeWork3 {
    public static void main(String[] args) {
        part1();
        part2();
    }
    public static void part1(){
        String[] words = {
                "мама", "папа", "сын",
                "дочь", "кошка", "собака",
                "собака", "телефон", "компьютер",
                "солнце", "осень", "зима",
                "лето", "каникулы", "смех",
                "счастье", "осень", "любовь",
                "кошка", "собака"
        };

        // Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
        Set<String> setWords = new HashSet<>(Arrays.asList(words));
        System.out.println("Список уникальных слов: " + setWords);
        System.out.println();

        //Посчитать сколько раз встречается каждое слово.
        Map<String, Integer> mapWords = new HashMap<>();
        for (String word: words)
        {
            mapWords.put(word, mapWords.getOrDefault(word, 0) + 1);
        }
        System.out.println("Частотность слов: " + mapWords);
        System.out.println();
    }

    public static void part2()
    {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "+791233210000");
        phoneBook.add("Петров", "+791233211111");
        phoneBook.add("Сидоров", "+791233212222");
        phoneBook.add("Иванов", "+791233210001");
        phoneBook.add("Иванов", "+791233210002");
        phoneBook.add("Зайцев", "+791233213333");
        phoneBook.add("Волков", "+791233214444");
        phoneBook.add("Зайцев", "+791233213331");
        System.out.println("Иванов = " + phoneBook.get("Иванов"));
        System.out.println("Петров = " + phoneBook.get("Петров"));
        System.out.println("Зайцев = " + phoneBook.get("Зайцев"));
    }
}
