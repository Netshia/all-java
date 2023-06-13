package com.ndivhuho.corejava.interfaces;

@FunctionalInterface
public interface EffectivelyFinal {

    void call(); //abstract method effectively making this interface functional interface hence the annotation @FunctionalInterface on top of the interface.
}
