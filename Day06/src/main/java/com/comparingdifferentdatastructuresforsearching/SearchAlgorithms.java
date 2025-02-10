package com.comparingdifferentdatastructuresforsearching;

import java.util.HashSet;
import java.util.TreeSet;

public class SearchAlgorithms {

    // Linear Search in an Array (O(N))
    public static boolean searchInArray(int[] array, int key) {
        for (int num : array) {
            if (num == key) {
                return true;
            }
        }
        return false;
    }

    // Search in a HashSet (O(1) on average)
    public static boolean searchInHashSet(HashSet<Integer> set, int key) {
        return set.contains(key);
    }

    // Search in a TreeSet (O(log N))
    public static boolean searchInTreeSet(TreeSet<Integer> set, int key) {
        return set.contains(key);
    }
}
