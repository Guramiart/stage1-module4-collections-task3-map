package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> resultMap = new HashMap<>();
        for(Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            String swapKey = entry.getValue();
            int swapValue = entry.getKey();
            if(resultMap.containsKey(swapKey)) {
                int value;
                if((value = resultMap.get(swapKey)) < swapValue) {
                    swapValue = value;
                }
            }
            resultMap.put(swapKey, swapValue);
        }
        return resultMap;
    }
}
