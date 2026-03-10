package com.java8;

import java.util.Arrays;
import java.util.List;

public class StringJoinExample {

    // String join example
    public static void main(String[] args) {

        List<String> list = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9");
        final String results = stringJoin(list, "->");
        System.out.println(results);
    }

    public static String stringJoin(List<String> list, String delimiter) {
        return String.join(delimiter, list);
    }
}
