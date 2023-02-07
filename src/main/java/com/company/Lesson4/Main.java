package com.company.Lesson4;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("DZ#1\n");

        String[] list = {"один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять\n",
                "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "один", "два", "один", "два","один"};

        System.out.println("Исходный массив: " + Arrays.toString(list));
        System.out.println("\n");

        Set<String> uniqueList = new LinkedHashSet<>(Arrays.asList(list));
        System.out.println("Вывод уникальных значений массива: " + uniqueList);
        System.out.println("\n");

        Map<String, Integer> countList = new HashMap<>();
        for (String s : list) {
            countList.put(s, countList.getOrDefault(s, 0) + 1);
        }
        System.out.println("Вывод количества повторений каждого слова: " + countList);

        System.out.println("\nDZ#2\n");

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Сидоров", "+78965412302");
        phoneBook.add("Печёрин", "+78965245455");
        phoneBook.add("Грибов", "+78996985857");
        phoneBook.add("Хорев", "+78963656785");
        phoneBook.add("Дитин", "+78966565656");
        phoneBook.add("Пришвин", "+78967989890");


        System.out.println("Вывод в консоль всего телефонного справочника: ");
        phoneBook.print();

        System.out.println("\nВывод номера по запросу фамилии Грибов: " + phoneBook.get("Грибов"));
    }
}
