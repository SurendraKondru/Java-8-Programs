package com.practice;

/*
Given an array of strings strs, group all anagrams together into sublists.
You may return the output in any order.

An anagram is a string that contains the exact same characters
as another string, but the order of the characters can be different.

Example 1:

Input: strs = ["act","pots","tops","cat","stop","hat"]

Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]
*/

// anagram test git

import java.util.*;
import java.util.stream.Collectors;

public class AnagramTest {
    public static void main(String[] args) {
        String[] str = {"act", "pots", "tops", "cat", "stop", "hat"};

//        Map<String, List<String>> map = new HashMap<>();
//
//        for (String s : str) {
//            char[] charArray = s.toCharArray();
//            Arrays.sort(charArray);
//            String s1 = String.valueOf(charArray);
//            if (!map.containsKey(s1)) {
//                map.put(s1, new ArrayList<>());
//            }
//            map.get(s1).add(s);
//
//        }
//        System.out.println(map);

        Map<String, List<String>> map = new HashMap<>();

        for (String word : str) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(word);
        }
        System.out.println(map);

//        final List<List<String>> collect = Arrays.stream(str)
//                .collect(Collectors.groupingBy(s -> {
//                    char[] s2 = s.toCharArray();
//                    Arrays.sort(s2);
//                    return new String(s2);
//                }))
//                .values()
//                .stream().collect(Collectors.toList());
//        System.out.println(collect);

        final List<List<String>> collect = Arrays.stream(str)
                .collect(Collectors.groupingBy(
                        word -> {
                            char[] charArray = word.toCharArray();
                            Arrays.sort(charArray);
                            return new String(charArray);
                        }
                ))
                .values()
                .stream().collect(Collectors.toList());
        System.out.println(collect);
    }
}
