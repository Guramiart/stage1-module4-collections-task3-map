package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        for(Map.Entry<Integer, Integer> entry : functionMap.entrySet()) {
            if(entry.getValue() == requiredValue) {
                return true;
            }
        }
        return false;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> resultMap = new HashMap<>();
        for(Integer element : sourceList) {
            int resultValue = 5 * element + 2;
            resultMap.put(element, resultValue);
        }
        return resultMap;
    }
}
