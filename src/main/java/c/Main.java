package c;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myArray; // объявление массива
        myArray = new int[10]; // создание, то есть, выделение памяти для массива на 10 элементов типа int
        for (int i = 0; i < 10; i++) {
            myArray[i] = i + 1;
        }
        System.out.println(Arrays.toString(myArray));
    }
}