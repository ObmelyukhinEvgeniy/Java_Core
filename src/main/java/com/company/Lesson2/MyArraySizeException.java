package com.company.Lesson2;

public class MyArraySizeException extends Exception {
    public MyArraySizeException () {
        super("Размер массива не соответствует заданному!");
    }
}
