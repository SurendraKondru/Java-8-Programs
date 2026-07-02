package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFrequency {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "spring", "java");

        Map<Object, Long> map = list.stream()
                .collect(Collectors.groupingBy(
                        s -> s,
                        Collectors.counting()
                ));

        System.out.println(map);
    }
}
