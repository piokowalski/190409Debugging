package com.infoshareacademy;

/**
 * @author Marcin Kwiatkowski <m.kwiatkowski@int.pl>
 */
public class Fibonacci {

    private long fib(long n) {
        if ( n == 1 || n == 2 ){
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public long get(long n) {
        return fib(n);
    }
}
