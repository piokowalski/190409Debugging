package com.infoshareacademy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read number a from standard input
        System.out.print("a = ");
        int a = scanner.nextInt();

        // Read number b from standard input
        System.out.print("b = ");
        int b = scanner.nextInt();

        // Output a + b
        int c = a + b;
        System.out.println("a + b = " + c);

        scanner.close();

    }
}
