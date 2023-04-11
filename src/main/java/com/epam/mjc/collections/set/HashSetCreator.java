package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();
        for (Integer element : sourceList) {
            if (element % 2 == 0) {
                result.add(element);
                while (element % 2 == 0) {
                    element /= 2;
                    result.add(element);
                }
            } else {
                result.add(element);
                result.add((element * 2));
            }
        }
        return result;
    }
}
