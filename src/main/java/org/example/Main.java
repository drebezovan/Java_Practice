package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Как тебя зовут?");
        String name = sc.next();
        System.out.println("Здравствуй, " + name);

    }
}