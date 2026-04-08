package SortingAlgorithms;

import java.util.Scanner;

public class BubbleSort {

    // Method to perform Bubble Sort
    // start and end parameters are not used in this implementation
    private static void bubbleSort(int[] array, int start, int end) {

        int size = array.length;

        // Outer loop → controls number of passes
        for(int i = 0; i < size - 1; i++)
        {
            // Inner loop → compares adjacent elements
            // After each pass, the largest element moves to the end
            for(int j = 0; j < size - 1 - i; j++)
            {
                // Swap if current element is greater than next element
                if(array[j] > array[j + 1])
                {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        // Sample array
        int array[] = {2,9,3,5,8,1,6,4,7};

        // Print array before sorting
        System.out.println("Array before BubbleSort....");
        for(int num : array)
        {
            System.out.print(num + " ");
        }

        System.out.println();

        // Call bubble sort
        bubbleSort(array , 0 , array.length);

        // Print array after sorting
        System.out.println("Array after BubbleSort....");
        for(int num : array)
        {
            System.out.print(num + " ");
        }
    }
}