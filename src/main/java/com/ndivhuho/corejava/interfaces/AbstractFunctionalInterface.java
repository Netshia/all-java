package com.ndivhuho.corejava.interfaces;

public interface AbstractFunctionalInterface {

    boolean test(boolean b1, boolean b2);

    default String test2() {
        return new String("Ndivhuho");
    }
}
