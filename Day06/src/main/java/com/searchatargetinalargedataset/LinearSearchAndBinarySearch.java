//package
package com.searchatargetinalargedataset;

//importing
import java.util.Random;

//class
public class LinearSearchAndBinarySearch {

    //method to generate random array
    public int [] randomArray(int n){

        //object of random class
        Random random = new Random();

        //initializing array
        int arr[] = new int[n];

        //generating random integer and saving it in array
        for (int i=0; i<n; i++){
            arr[i]= random.nextInt();
        }

        //return
        return arr;

    }


    // method for linear search
    public void linearSearch(int[] arr, int searchelement){

        //initializing variable
        int n = arr.length;

        //performing linear search
        for (int i=0; i<n; i++){

            //if element found then print element found and return
            if (searchelement == arr[i]){
                System.out.println("Element found");
                return;
            }
        }

        //if element not found then print and then return
        System.out.println("Element not found");
        return;

    }

    //method to perform binary search
    public void binarySearch(int[] arr, int searchelement){

        //initializing variables
        int left = 0;
        int right = arr.length - 1;

        //performing binary search
        while (left <= right) {

            int mid = left + (right - left) / 2;

            //if element found then printing and returning
            if (arr[mid] == searchelement) {
                System.out.println("Element found");
                return;
            } else if (arr[mid] < searchelement) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        //printing that element not found if it is not found and then return
        System.out.println("Element not found");
        return;
    }

}
