package com.stackroute.pe5;

import java.util.*;

public class NumOfCount {
    public String checkFrequency(String input) {
        if (input == null)
            return null;
        List<String> list = Arrays.asList(input.split("[\\W_]+"));
        Map<String, Integer> map = new HashMap<>();
        for (String each : list) {
            if (map.containsKey(each)) {
                map.replace(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }
        return map.toString();
    }
}