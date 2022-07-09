package Lesson2;

public class MyArrayDataException extends Exception {
    public MyArrayDataException (int i, int j) {
        super("Тип данных в ячейке: [" + i + "] - [" + j + "] является некорректным!");
    }
}
