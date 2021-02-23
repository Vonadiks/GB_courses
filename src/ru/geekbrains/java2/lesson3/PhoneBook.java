package ru.geekbrains.java2.lesson3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook
{
    Map<String, HashSet<String>> map;

    PhoneBook()
    {
        this.map = new HashMap<>();
    }

    public void add(String name, String number)
    {
        HashSet<String> pNumbers;
        if (map.containsKey(name))
        {
            pNumbers = map.get(name);
        }
        else
        {
            pNumbers = new HashSet<>();
        }
        pNumbers.add(number);
        map.put(name, pNumbers);
    }

    Set<String> get(String name)
    {
        return map.get(name);
    }

}
