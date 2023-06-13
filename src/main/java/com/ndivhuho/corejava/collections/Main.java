package com.ndivhuho.corejava.collections;

import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List arrayList = List.of(2, 5, 1, 3, 6, 7);

        for (Iterator<Iterator> listIterator = arrayList.iterator(); listIterator.hasNext();) {
            listIterator.next();
        }

        System.out.println(SetTest.TreeSetTest());

    }
}
