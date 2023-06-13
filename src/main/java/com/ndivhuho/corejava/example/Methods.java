package com.ndivhuho.corejava.example;

public class Methods {

    public static void testingLocalClass() {

        int x = 1;

        class StaticInnerClass {

            public void add() {
                System.out.println("add: " + (x));
            }
        }

        StaticInnerClass s = new StaticInnerClass();
        s.add();
    }

    static void doCalc(byte... a) {
        System.out.print("byte...");
    }

    static void doCalc(long a, long b) {
        System.out.print("long, long");
    }

    static void doCalc(Byte s1, Byte s2) {
        System.out.print("Byte, Byte");
    }

    public static void main (String[] args) {
        testingLocalClass();
    }

    public void test() {
        System.out.println("Testing 1");
    }
}
