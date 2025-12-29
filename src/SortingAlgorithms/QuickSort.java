package SortingAlgorithms;

public class QuickSort {

    private static void quickSort(int array[])
    {
        
        
    }

    public static void main(String args[])
    {
        int array[] = {2,9,3,5,8,1,6,4,7};

        System.out.println("Array before QuickSort....");
        for(int num : array)
        {
            System.out.print(num+" ");
        }
        System.out.println();
        quickSort(array);
        System.out.println("Array after QuickSort....");

        for(int num : array)
        {
            System.out.print(num+" ");
        }

    }
}
