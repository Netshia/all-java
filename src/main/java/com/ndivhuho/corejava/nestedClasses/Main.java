package com.ndivhuho.corejava.nestedClasses;

public class Main {

    public static void main(String[] args) {
        AnotherClass anotherClass = new AnotherClass();
        OuterClass.InnerClass inner = new OuterClass().new InnerClass();
        OuterClass.StaticNestedClass nested = new OuterClass.StaticNestedClass();
    }
}
