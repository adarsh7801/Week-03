//package
package com.sortinglargedataefficiently;

//importing
import java.util.Random;

//class
public class SortingAlgorithms {


    //generating random array
    public int [] randomArray(int n){

        //object of random class
        Random random = new Random();

        //initializing array
        int arr[] = new int[n];

        //loop to save random integer in array
        for (int i=0; i<n; i++){
            arr[i]= random.nextInt();
        }

        //return
        return arr;

    }


    //bubble sort
    public void bubbleSort(int arr[]) {

        //initializing variables
        int size = arr.length;
        int temp;

        //bubble sort algorithm
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //MERGE SORT

    // split function for merge sort
    public void mergeSort(int arr[], int start, int end) {

        if (start < end) {
            int mid = start + (end - start) / 2;

            //recursively dividing array
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);

            //calling merge function
            merge(arr, start, mid, end);
        }
    }

    // Merging function for merge sort
    public void merge(int[] arr, int start, int mid, int end) {

        //initializing variables
        int merged[] = new int[end - start + 1];
        int left = start;
        int right = mid + 1;
        int mergeIndex = 0;

        // Merging two halfs in temp array
        while (left <= mid && right <= end) {

            if (arr[left] <= arr[right]) {

                merged[mergeIndex++] = arr[left++];
            } else {
                merged[mergeIndex++] = arr[right++];
            }
        }

        // Copy remaining elements from left half
        while (left <= mid) {
            merged[mergeIndex++] = arr[left++];
        }

        // Copy remaining elements from right half
        while (right <= end) {
            merged[mergeIndex++] = arr[right++];
        }

        // Copy merged elements back to original array
        for (int i = 0, j = start; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }


    //quick sort
    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    //splitting array
    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    //swapping
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Method to initiate QuickSort
    public void quickSort(int[] arr) {
        if (arr == null || arr.length == 0) return;
        quickSort(arr, 0, arr.length - 1);
    }


}
