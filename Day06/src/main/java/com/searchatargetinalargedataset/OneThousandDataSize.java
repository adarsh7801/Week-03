//package
package com.searchatargetinalargedataset;

//importing
import  java.util.Random;
import java.util.Arrays;

//class
public class OneThousandDataSize {

    //main method
    public static void main(String[] args) {

        //creating object of random class
        Random random = new Random();

        //creating object of Linear Search And Binary Search class
        LinearSearchAndBinarySearch lsbs = new LinearSearchAndBinarySearch();

        //initializing variables
        int n=1000;
        int[] data = lsbs.randomArray(n);
        int searchElement = random.nextInt();

        //calculating time for linear search
        long linear = System.nanoTime();
        lsbs.linearSearch(data, searchElement);
        long linearResult = System.nanoTime() - linear;

        //printing
        System.out.println("Linear time for 1000 dataset is= "+linearResult);

        //sorting array
        Arrays.sort(data);

        //calculating time for binary search
        long binary = System.nanoTime();
        lsbs.binarySearch(data, searchElement);
        long binaryResult = System.nanoTime()- binary;

        //printing
        System.out.println("Binary time for 1000 dataset is= "+binaryResult);
    }

}
