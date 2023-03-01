package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileReader("src/main/java/org/example/input.txt"));
        System.out.println("Как тебя зовут?");
        String name = sc.next();
        System.out.println("Здравствуй, " + name);

    }
}