import com.searchatargetinalargedataset.LinearSearchAndBinarySearch;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinearSearchAndBinarySearchTesting {

    @Test
    public void testLinearSearchfalse(){
        LinearSearchAndBinarySearch lsbs = new LinearSearchAndBinarySearch();

        int [] dataset = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int target = 100;

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        lsbs.linearSearch(dataset, target);

        assertTrue(outContent.toString().contains("Element not found"));

    }


    @Test
    public void testLinearSearchTrue(){
        LinearSearchAndBinarySearch lsbs = new LinearSearchAndBinarySearch();

        int [] dataset = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int target = 10;

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        lsbs.linearSearch(dataset, target);

        assertTrue(outContent.toString().contains("Element found"));
    }

    @Test
    public void testBinarySearchTrue(){
        LinearSearchAndBinarySearch lsbs = new LinearSearchAndBinarySearch();

        int [] dataset = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int target = 10;

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        lsbs.binarySearch(dataset, target);

        assertTrue(outContent.toString().contains("Element found"));

    }


    @Test
    public void testBinarySearchFalse(){
        LinearSearchAndBinarySearch lsbs = new LinearSearchAndBinarySearch();

        int [] dataset = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int target = 100;

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        lsbs.binarySearch(dataset, target);

        assertTrue(outContent.toString().contains("Element not found"));

    }

}