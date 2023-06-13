package com.ndivhuho.corejava.collections;

import java.util.Arrays;

public class ComparableTest implements Comparable<ComparableTest> {

    private Long id;
    private String name;

    public ComparableTest(final Long id, final String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        ComparableTest []test = {
                new ComparableTest(2l, "Ndivhuho"),
                new ComparableTest(1l, "Tshilidzi"),
                new ComparableTest(5l, "Lutendo"),
                new ComparableTest(4l, "Zwavhidi"),
        };

        System.out.println("Before sorting by student ID");
        System.out.println("Student-ID \t  Name \t  CGPA (for 4.0) ");
        System.out.println(Arrays.toString(test));

        Arrays.sort(test);

        System.out.println("After sorting by student ID");
        System.out.println("Student-ID \t  Name \t  CGPA (for 4.0) ");
        System.out.println(Arrays.toString(test));
    }

    /**
     * The method used to compare two object. This will be called my the sort method in line 27.
     *
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(ComparableTest o) {
        return this.id.compareTo(o.id);
    }

    public String toString() {
        return " \n " + id + " \t " + name;
    }
}
