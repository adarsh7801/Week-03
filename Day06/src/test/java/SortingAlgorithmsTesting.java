import com.sortinglargedataefficiently.SortingAlgorithms;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SortingAlgorithmsTesting {

    @Test
    public void testBubbleSort(){
        SortingAlgorithms sa = new SortingAlgorithms();
        int arr[]= {54, 34, 28, 12, 54, 24, 59};


        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        sa.bubbleSort(arr);

        assertTrue(Arrays.toString(arr).contains("12, 24, 28, 34, 54, 54, 59"));
    }

    @Test
    public void testMergeSort(){
        SortingAlgorithms sa = new SortingAlgorithms();
        int arr[]= {54, 34, 28, 12, 54, 24, 59};


        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        sa.mergeSort(arr, 0, 6);

        assertTrue(Arrays.toString(arr).contains("12, 24, 28, 34, 54, 54, 59"));
    }


    @Test
    public void testQuickSort(){
        SortingAlgorithms sa = new SortingAlgorithms();
        int arr[]= {54, 34, 28, 12, 54, 24, 59};

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        sa.quickSort(arr);

        assertTrue(Arrays.toString(arr).contains("12, 24, 28, 34, 54, 54, 59"));

    }

}
