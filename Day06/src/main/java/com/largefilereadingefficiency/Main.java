//package
package com.largefilereadingefficiency;

//import
import static com.largefilereadingefficiency.FileReading.readWithFileReader;
import static com.largefilereadingefficiency.FileReading.readWithInputStreamReader;

//main class
public class Main {


    //main method
    public static void main(String[] args) {

        //initializing string for file path
        String filePath = "largefile.txt";

        //calculating time
        System.out.println("Reading Performance Comparison:");
        long fileReaderTime = readWithFileReader(filePath);
        System.out.println("FileReader Time: " + fileReaderTime + " ms");

        long inputStreamReaderTime = readWithInputStreamReader(filePath);
        System.out.println("InputStreamReader Time: " + inputStreamReaderTime + " ms");
    }


}
