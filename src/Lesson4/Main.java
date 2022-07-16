package Lesson4;

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



    }
}
