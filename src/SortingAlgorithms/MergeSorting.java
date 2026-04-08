package SortingAlgorithms;

public class MergeSorting {

    // Merges two sorted arrays (leftArray and rightArray) into a single sorted array
    private static void merge(int leftArray[], int rightArray[], int array[]) {

        int l = 0; // Pointer for leftArray
        int r = 0; // Pointer for rightArray
        int i = 0; // Pointer for merged array

        // Compare elements from both arrays and place the smaller one into array[]
        while (l < leftArray.length && r < rightArray.length) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                l++;
            } else {
                array[i] = rightArray[r];
                r++;
            }
            i++;
        }

        // Copy any remaining elements from leftArray (if any)
        while (l < leftArray.length) {
            array[i] = leftArray[l];
            l++;
            i++;
        }

        // Copy any remaining elements from rightArray (if any)
        while (r < rightArray.length) {
            array[i] = rightArray[r];
            r++;
            i++;
        }
    }

    // Method to perform Merge Sort on an integer array
    private static void mergeSort(int array[]) {

        int length = array.length;

        // Base case: if array has 0 or 1 element, it is already sorted
        if (length <= 1) return;

        // Divide array into two halves
        int leftArraySize = length / 2;
        int rightArraySize = length - leftArraySize;

        // Create subarrays
        int leftArray[] = new int[leftArraySize];
        int rightArray[] = new int[rightArraySize];

        // Copy elements into leftArray and rightArray
        int l = 0, r = 0;
        for (int i = 0; i < length; i++) {
            if (l < leftArraySize) {
                leftArray[l++] = array[i];
            } else {
                rightArray[r++] = array[i];
            }
        }

        // Recursively sort both halves
        mergeSort(leftArray);
        mergeSort(rightArray);
        // Merge the sorted halves back into the original array
        merge(leftArray, rightArray, array);
    }


    public static void main(String args[])
    {

        int array[] = {2,9,3,5,8,1,6,4,7};

        System.out.println("Array before MergeSort....");
        for(int num : array)
        {
            System.out.print(num+" ");
        }
        mergeSort(array);
        System.out.println();
        System.out.println("Array after MergeSort....");
        for(int num : array)
        {
            System.out.print(num+" ");
        }

    }
}
