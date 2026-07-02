package com.practice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CompetitionRanking {

    public static Map<Integer, Integer> computeRanks(List<Integer> scores) {

        Map<Integer, Integer> rankMap = new LinkedHashMap<>();

        for (int i = 0; i < scores.size(); i++) {
            int currentScore = scores.get(i);

            if (rankMap.containsKey(currentScore)) {
                continue; // already computed
            }

            int rank = 1;
            for (int j = 0; j < scores.size(); j++) {
                if (scores.get(j) > currentScore) {
                    rank++;
                }
            }

            rankMap.put(currentScore, rank);
        }

        return rankMap;
    }

    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(149, 149, 149, 149, 148, 148, 147, 146, 149);

        Map<Integer, Integer> rankMap = computeRanks(scores);

        System.out.println(rankMap);

        for (Map.Entry<Integer, Integer> entry : rankMap.entrySet()) {
            System.out.println("Rank of " + entry.getKey() + ": " + entry.getValue());
        }
    }
}