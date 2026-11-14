package ru.practice;

public class Hello {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Maven build OK: 2 + 3 = " + sum(2, 3));
    }
}
