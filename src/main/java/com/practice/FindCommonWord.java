package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommonWord {

    public static List<String> findCommonWords(List<String> list) {

        List<String> result = new ArrayList<>();

        String[] firstWords = list.get(0).toLowerCase().split("\\s+");

        for (String word : firstWords) {

            boolean isMatch = true;

            for (int i = 1; i < list.size(); i++) {

                String currentWord = list.get(i).toLowerCase();

                if (!Arrays.asList(currentWord.split("\\s+")).contains(word)) {
                    isMatch = false;
                    break;
                }
            }

            if (isMatch) {
                result.add(word);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        List<String> input1 = Arrays.asList(
                "Java spring",
                "Java Spring boot",
                "java spring boot microservice"
        );

        List<String> input2 = Arrays.asList(
                "Java",
                "Springboot",
                "microservice"
        );

        List<String> input3 = Arrays.asList(
                "Java",
                "Java Springboot",
                "microservice"
        );

        System.out.println(findCommonWords(input1)); // Java
        System.out.println(findCommonWords(input2)); // null
        System.out.println(findCommonWords(input3)); // null
    }
}