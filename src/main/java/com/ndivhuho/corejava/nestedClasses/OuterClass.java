package com.ndivhuho.corejava.nestedClasses;

/**
 * Using this class to understand Nested Classes. I will create both two Nested Classes categories:
 * 1 - Static Nested Class (static classes)
 * 2 - Inner Class (Non-static classes)
 *
 * We have deduced that both types of nested classes can be defined using all access modifiers (public, protected, default, and private)
 */
public class OuterClass {

    public static int age;
    static String name;
    public InnerEnum innerEnum;
    public InnerClass innerClass;

    enum InnerEnum {

        NAME; // TODO you always need to define a constant first before the member declaration.

        private int age1;
    }

    protected class InnerClass {
//        public static String name;
//
        public String getName() {
            return name;
        }
    }

    /**
     * To instantiate a static nested class you need to have an instance of an outer class.
     * And must be implemented as like so: OuterClass.StaticNestedClass snc = new OuterClass().new StaticNestedClass().
     */
    protected static class StaticNestedClass {

        /**
         * Testing to see if I can create a main method within the static nested class. And it possible.
         */
        public static void main(String[] args) {
            name = "Hi Ndivhuho";
            outerClassMethod();
            System.out.println(name);
        }

        public void testing() {
            int num = age;
        }
    }

    private static void outerClassMethod() {

    }
}

/**
 * Because this class is defined in a java file to which it does not belong, it must be package private.
 * Making it accessible only within the same package.
 */
class AnotherClass {

    /**
     * Testing if I can create a main method within another class. And it is possible.
     */
    public static void main(String[] args) {
        OuterClass.name = "Hi Ndivhuho, from Another class";
        System.out.println(OuterClass.name);
    }
}
