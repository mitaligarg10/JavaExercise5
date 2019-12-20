package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class AscendingOrder {
    public String sortArrayList(String string) {
        if (string == null) return null;
        SortedSet<String> sortedSet = new TreeSet<>(Arrays.asList(string.split(" ")));

        return new ArrayList<String>(sortedSet).toString();
    }
}
