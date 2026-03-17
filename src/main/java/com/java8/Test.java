package com.java8;

/*
Given an array of strings strs, group all anagrams together into sublists.
You may return the output in any order.

An anagram is a string that contains the exact same characters
as another string, but the order of the characters can be different.

Example 1:

Input: strs = ["act","pots","tops","cat","stop","hat"]

Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        String[] str = {"act", "pots", "tops", "cat", "stop", "hat"};

       /* Map<String, List<String>> map = new HashMap<>();

        for (String s : str) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String s1 = String.valueOf(charArray);
            if (!map.containsKey(s1)) {
                map.put(s1, new ArrayList<>());
            }
            map.get(s1).add(s);

        }
        System.out.println(map.values());*/

        final List<List<String>> collect = Arrays.stream(str)
                .collect(Collectors.groupingBy(s -> {
                    char[] s2 = s.toCharArray();
                    Arrays.sort(s2);
                    String result = new String(s2);
                    return result;
                }))
                .values()
                .stream().collect(Collectors.toList());
        System.out.println(collect);


    }
}
