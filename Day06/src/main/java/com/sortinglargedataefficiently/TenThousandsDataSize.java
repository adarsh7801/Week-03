//package
package com.sortinglargedataefficiently;

//class
public class TenThousandsDataSize {

    //main method
    public static void main(String[] args) {

        //creating class
        SortingAlgorithms sa = new SortingAlgorithms();

        //generating random array of 10000 length
        int [] arr = sa.randomArray(10000);
        int [] arr2 = new int[10000];
        int [] arr3 = new int[10000];

        for (int i=0; i<10000; i++){
            arr2[i] = arr[i];
            arr3[i] = arr[i];
        }


        //start time for merge sort
        long start = System.nanoTime();

        //calling merge sort
        sa.mergeSort(arr, 0, 9999);

        //end time for merge sort
        long mergeSortTime = System.nanoTime() - start;

        //printing merge sort time
        System.out.println("Merge sort time: "+mergeSortTime);



        //starting time for quick sort
        start = System.nanoTime();

        //calling quick sort
        sa.quickSort(arr3);

        //end time for merge sort
        long quickSortTime = System.nanoTime() - start;

        //printing quick sort time
        System.out.println("Quick sort time: "+quickSortTime);


        //starting time for merge sort
        start = System.nanoTime();

        //bubble sort
        sa.bubbleSort(arr);

        //ending time
        long bubbleTime = System.nanoTime() - start;

        //printing time
        System.out.println("Bubble sort time: "+bubbleTime);

    }

}
