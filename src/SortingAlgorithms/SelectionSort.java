package SortingAlgorithms;
/*

    1.By using for loop, loop through index of the list for index in range(len(myList))
   2. Search for the minimum value of the list.
   3. Swap the minimum value with the value at the index position.
    4.Repeat the above steps, until the list is sorted.

 */
public class SelectionSort {

    // Method to swap two elements in the array without using a temporary variable
    static void swap(int array[], int i, int j) {
        // Swapping using arithmetic operations
        // Note: This works only if there is no integer overflow
        array[i] = array[i] + array[j] - (array[j] = array[i]);
    }

    // Method to perform Selection Sort on an integer array
    static void selectionSort(int array[]) {

        // Loop through the array except the last element
        for (int i = 0; i < array.length - 1; i++) {

            // Assume the current index has the minimum element
            int min = i;

            // Find the index of the smallest element in the unsorted part
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j; // Update index of minimum element
                }
            }

            // Swap the found minimum element with the element at index i
            swap(array, i, min);
        }
    }

    public static void main(String args[])
    {
        int array[] = {2,9,3,5,8,1,6,4,7};

        System.out.println("Array before SelectionSort....");
        for(int num : array)
        {
            System.out.print(num+" ");
        }
        selectionSort(array);
        System.out.println();
        System.out.println("Array after SelectionSort....");
        for(int num : array)
        {
            System.out.print(num+" ");
        }
    }
}
