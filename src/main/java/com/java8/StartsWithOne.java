package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWithOne {

    // Java program to find all elements from array who starts with 1
    public static void main(String[] args) {
        int[] numbers = new int[]{2, 20, 11, 21, 13, 22, 81, 18, 77, 21, 17};
        startsWithOne(numbers);
    }

    public static void startsWithOne(int[] numbers) {
        final List<String> collect = Arrays.stream(numbers)
                .boxed()
                .map(s -> s + "")
                .filter(s -> s.startsWith("2"))
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
