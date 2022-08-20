package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> resultMap = new HashMap<>();
        StringTokenizer stringTokenizer = new StringTokenizer(sentence, " ,.");
        while (stringTokenizer.hasMoreTokens()) {
            int number = 1;
            String str = stringTokenizer.nextToken().toLowerCase();
            if(resultMap.containsKey(str)) {
                number = resultMap.get(str) + 1;
            }
            resultMap.put(str, number);
        }
        return resultMap;
    }
}
