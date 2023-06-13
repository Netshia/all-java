package com.ndivhuho.corejava.streams;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        //System.out.println(StreamSource.wordsInSentence());
        StreamSource ss = new StreamSource();
        System.out.println(ss.wordsInAFile());
    }
}
