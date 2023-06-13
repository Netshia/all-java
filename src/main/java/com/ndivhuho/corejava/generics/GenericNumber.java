package com.ndivhuho.corejava.generics;

import java.util.List;

public class GenericNumber<T extends Number> {

    private final List<T> listOfNumbers;

    public GenericNumber(final List<T> listOfNumbers) {
        this.listOfNumbers = listOfNumbers;
    }

    public List<T> getListOfNumbers() {
        // add logic code here
        return listOfNumbers;
    }

    @Override
    public String toString() {
        return "GenericNumber{" +
                "listOfNumbers=" + listOfNumbers +
                '}';
    }
}
