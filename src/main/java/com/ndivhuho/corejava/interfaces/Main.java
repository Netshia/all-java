package com.ndivhuho.corejava.interfaces;

import java.util.function.Predicate;

public class Main {
    private static final FunctionalInterfaceTest functionalInterfaceTest = (b1, b2) -> b1 || b2;
    private static final Predicate<Integer> p = num -> num > 10;

    public static void main(String[] args) {
        String word = "Hello"; //Because the variable is meant to be used within the lambda expression, it must be effectively final.

        EffectivelyFinal ef = () -> System.out.println(word);
        ef.call();
    }
}
