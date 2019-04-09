package com.infoshareacademy;

import java.util.Scanner;

/**
 * 02-fibonacci.
 * This application prints out the first n Fibonacci numbers.
 */
public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();

        int a = 0;
        int b = 1;
        int c;

            for (int i = 1; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(String.format("Fib%d = %d", i, c));
        }

        scanner.close();
    }
}
