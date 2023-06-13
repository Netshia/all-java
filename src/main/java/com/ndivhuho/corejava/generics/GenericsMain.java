package com.ndivhuho.corejava.generics;

import java.util.List;

public class GenericsMain {

    public static void main(String[] args) {

        GenericNumber<Integer> genericNumber = new GenericNumber<>(List.of(4, 6));
        System.out.println(genericNumber);
    }
}
