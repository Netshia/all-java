package com.ndivhuho.corejava.streams;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StreamSource {

    private static final String sentence = "I learned core java in 2023";

    /**
     * The method to test the patten class by streaming on a sentence.
     *
     * @return A list of stream words from the sentence in line 14
     */
    public static List<String> wordsInSentence() {
        return Pattern.compile(" ")
                .splitAsStream(sentence)
                .collect(Collectors.toList());
    }

    public List<String> wordsInAFile() throws IOException {
        URL resource = getClass().getClassLoader().getResource("StreamSources.txt");
        return Files.lines(Paths.get(resource.getPath())).collect(Collectors.toList());
    }
}
