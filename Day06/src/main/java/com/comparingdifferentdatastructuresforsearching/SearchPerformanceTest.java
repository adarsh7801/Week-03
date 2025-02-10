package com.comparingdifferentdatastructuresforsearching;

import java.util.*;

public class SearchPerformanceTest {

    public static void main(String[] args) {
        int dataSize = 1_000_000; // Change this to test different sizes
        int searchKey = new Random().nextInt(dataSize); // Random key to search

        // Populate the data structures with random numbers
        int[] array = new int[dataSize];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        Random random = new Random();
        for (int i = 0; i < dataSize; i++) {
            int num = random.nextInt(dataSize);
            array[i] = num;
            hashSet.add(num);
            treeSet.add(num);
        }

        // Measure time for Array search
        long start = System.nanoTime();
        boolean foundArray = SearchAlgorithms.searchInArray(array, searchKey);
        long arrayTime = System.nanoTime() - start;

        // Measure time for HashSet search
        start = System.nanoTime();
        boolean foundHashSet = SearchAlgorithms.searchInHashSet(hashSet, searchKey);
        long hashSetTime = System.nanoTime() - start;

        // Measure time for TreeSet search
        start = System.nanoTime();
        boolean foundTreeSet = SearchAlgorithms.searchInTreeSet(treeSet, searchKey);
        long treeSetTime = System.nanoTime() - start;

        // Display results
        System.out.println("Search Performance Comparison (N = " + dataSize + ")");
        System.out.println("Array Search (O(N))      : " + arrayTime / 1_000_000.0 + " ms, Found: " + foundArray);
        System.out.println("HashSet Search (O(1))    : " + hashSetTime / 1_000_000.0 + " ms, Found: " + foundHashSet);
        System.out.println("TreeSet Search (O(log N)): " + treeSetTime / 1_000_000.0 + " ms, Found: " + foundTreeSet);
    }
}
