package com.simplenum;

import org.apache.commons.math3.primes.Primes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число для определения являются оно простым или нет: ");

        String str = scanner.nextLine();

        definNum(str);

    }

    static void definNum(String str) {

        List<Integer> list = new ArrayList<>();

        for (String s : str.split(" ")) {
            if (s.matches("[0-9]+")) {
                list.add(Integer.parseInt(s));
                if (Primes.isPrime(Integer.parseInt(s))) {
                    System.out.println(s + " - prime");
                } else {
                    System.out.println(s + " - not prime");
                }
            } else {
                System.out.println(s + " - is not a number");
            }
        }
    }
}
