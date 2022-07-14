package Lesson3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //DZ#1
        System.out.println("DZ#1---------------------------------------------------");

        List<String> arr = Arrays.asList("Казнить", ", ", "нельзя", " ", "помиловать!");
        System.out.println("\nМассив до изменения...\n");
        System.out.println(arr);

        Collections.swap(arr, 1, 3);
        System.out.println("\nМассив после изменения...\n");
        System.out.println(arr);

        //DZ#2
        System.out.println("\nDZ#2-------------------------------------------------");

        Box<Apple> appleBox = new Box<>();
        for (int i = 0; i < 8; i++) {
           appleBox.add(new Apple());
        }
        System.out.println("\nКоробка с яблоками имеет вес равный " + appleBox.getWeight() + " ед.");

        Box<Orange> orangeBox = new Box<>();
        for (int i = 0; i < 4; i++) {
            orangeBox.add(new Orange());
        }
        System.out.println("\nКоробка с апельсинами имеет вес равный " + orangeBox.getWeight() + " ед.");

        Box<Orange> orangeBox2 = new Box<>();
        for (int i = 0; i < 7; i++) {
            orangeBox2.add(new Orange());
        }
        System.out.println("\nКоробка с апельсинами №2 имеет вес равный " + orangeBox.getWeight() + " ед.");

        System.out.println("\nСравнение веса коробок: " + appleBox.compare(orangeBox));

        orangeBox.addition(orangeBox2);
        System.out.println("\nВес коробки №2 с апельсинами после добавления апельсинов из коробки №1 равен " + orangeBox2.getWeight() + " ед.");
    }
}
