package Classwork;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] myArray; // объявление массива
        myArray = new int[10]; // создание, то есть, выделение памяти для массива на 10 элементов типа int
        for (int i = 0; i < 10; i++) {
            if ((i + 1) % 2 == 0) {
                myArray[i] = 0;
            } else {
                myArray[i] = i + 1;
            }

        }
        System.out.println(Arrays.toString(myArray));
    }
}