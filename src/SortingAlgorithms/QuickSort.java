package SortingAlgorithms;

public class QuickSort {
    // Method to swap two elements in the array
    public static void swap(int array[] , int i , int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    // Partition method: places pivot in correct position
    private static int partion(int[] array, int start, int end) {
        // Choose last element as pivot
        int pivot = array[end];

        // Pointer for smaller elements
        int i = start - 1;

        // Traverse array from start to end-1
        for(int j = start; j < end; j++)
        {
            // If current element is smaller than pivot
            if(array[j] < pivot)
            {
                i++; // move pointer forward

                // Swap current element with element at i
                swap(array, i, j);
            }
        }
        // Place pivot at correct position
        i++;
        swap(array, i, end);

        // Return pivot index
        return i;
    }

    // Main Quick Sort method
    private static void quickSort(int array[] , int start , int end)
    {
        // Base case: if subarray has 0 or 1 element, it is already sorted
        if(end <= start)
        {
            return;
        }
        // Partition the array and get pivot index
        int pivot = partion(array , start , end);

        // Recursively sort elements before pivot
        quickSort(array , start , pivot - 1);

        // Recursively sort elements after pivot
        quickSort(array , pivot + 1 , end);
    }

    public static void main(String args[])
    {
        int array[] = {2,9,3,5,8,1,6,4,7};

        // Print array before sorting
        System.out.println("Array before QuickSort....");
        for(int num : array)
        {
            System.out.print(num + " ");
        }

        System.out.println();

        // Call Quick Sort
        quickSort(array , 0 , array.length - 1);

        // Print array after sorting
        System.out.println("Array after QuickSort....");
        for(int num : array)
        {
            System.out.print(num + " ");
        }
    }
}