package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

import java.util.Locale;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("I am so pretty!",(a) -> a.toUpperCase(Locale.ROOT));
        poemBeautifier.beautify("I am so pretty!",(a) -> "123 " + a + " 456");
        poemBeautifier.beautify("I am so pretty!",(a) -> "Look! " + a + " And amazing!");
        poemBeautifier.beautify("I am so pretty!",(a) -> "*** " + a + " ***");
    }
}
