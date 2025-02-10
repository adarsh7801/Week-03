//package
package com.stringconcatenationperformance;

//class
public class OneThousandOperationCount {

    //main method
    public static void main(String[] args) {

        //initializing start time as long
        long startTime = System.nanoTime();

        //calling concatenate with string for 1000 operations
        StringConcatenation.concatenateWithString(1000);

        //printing time for string
        System.out.println("The string time for 1000 operations is : "+(System.nanoTime()-startTime));

        //start time
        startTime = System.nanoTime();

        //calling concatenate with string builder for 1000 operations
        StringConcatenation.concatenateWithStringBuilder(1000);

        //printing time for string builder
        System.out.println("The string builder time for 1000 operations is : "+(System.nanoTime()-startTime));

        //start time
        startTime = System.nanoTime();

        //calling concatenate with string buffer for 1000 operations
        StringConcatenation.concatenateWithStringBuffer(1000);

        //printing time for string buffer
        System.out.println("The string buffer time for 1000 operations is : "+(System.nanoTime()-startTime));

    }

}
