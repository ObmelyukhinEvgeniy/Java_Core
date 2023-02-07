package com.company.Lesson2;

import org.jetbrains.annotations.NotNull;

public class Main {
    public static void main(String[] args) {

        String[][] arr = {  {"2","15","7"},
                            {"@","45","89","121"},
                            {"789","153","14","bug"},
                            {"56","9","541","8"}
        };

        try {
            System.out.println(checkArr(arr, 4));

        } catch (MyArrayDataException | MyArraySizeException e) {
                e.printStackTrace();
        }
    }

    public static int checkArr(String[][] arr, int size) throws MyArrayDataException, MyArraySizeException {

        if(arr.length != size || arr[0].length != size) throw new MyArraySizeException();

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }

}
