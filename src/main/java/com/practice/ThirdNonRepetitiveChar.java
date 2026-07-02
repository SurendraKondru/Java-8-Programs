package com.practice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class ThirdNonRepetitiveChar {

    public static void main(String[] args) {
        /*final String nonRepeatingChar = findThirdNonRepeatingChar("microservices");
        System.out.println(nonRepeatingChar);*/

        String str = "microservices";

        final String key = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(value -> value, () -> new LinkedHashMap<>(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .skip(2)
                .findFirst()
                .get()
                .getKey();

        System.out.println(key);


    }

    /*public static String findThirdNonRepeatingChar(String str) {
        return Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(value -> value, () -> new LinkedHashMap<>(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(value -> value.getKey())
                .skip(2)
                .findFirst()
                .orElse(null);
    }*/
}
