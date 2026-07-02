package com.practice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllDuplicates {
    public static void main(String[] args) {
        // Java program to find all duplicate element from a given string
        findDuplicates("surendrakondru");
    }

    public static void findDuplicates(String str) {
        final List<String> collect = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(s1 -> s1, () -> new LinkedHashMap<>(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() != 1)
                .map(set -> set.getKey())
                .collect(Collectors.toList());
        System.out.println(collect);
        // testing purpose
    }
}
