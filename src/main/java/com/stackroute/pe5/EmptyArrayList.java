package com.stackroute.pe5;

import java.util.*;

public class EmptyArrayList {

    private List<String> list = new ArrayList<>();

    public List<String> addArray(String[] inputArray) {
        for (String input : inputArray) {
            list.add(input);
        }
        return list;
    }

    public List<String> update(int index, String value) {
        list.set(index, value);
        return list;
    }

    public List<String> removeAll() {
        list.clear();
        return list;
    }
}
