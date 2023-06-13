package com.ndivhuho.corejava.generics;

import java.util.List;

public class GenericTesting {

    /**
     * The method to demonstrate generic method. When this method is called the type T will be inferred.
     * Thus, there is no need to explicitly provide the type. However, there can be situations where you will need
     * to provide the type explicitly.
     *
     * @param list The list of a generic type
     * @param num The value of a generic type
     * @param <T> the type that will be inferred upon the call of this method.
     */
    public static <T> void genericMethod(final List<T> list, T num) {
        System.out.println("The list: " + list);
        System.out.println("The number: " + num);
    }
}