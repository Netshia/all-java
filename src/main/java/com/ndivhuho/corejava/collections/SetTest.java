package com.ndivhuho.corejava.collections;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

    public static Set<Character> TreeSetTest() {

        String sentence = "hello bro ndichuho";
        Set<Character> treeSet = new TreeSet<>();

        for (char c: sentence.toCharArray()) {
            treeSet.add(c);
        }

        return treeSet;
    }
}
