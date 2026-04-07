package SortingAlgorithms;



public class QuickSort {

    public static void swap(int array[] , int i , int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void quickSort(int array[] , int start , int end)
    {
        if(end<=start)
        {
            return;
        }

        int pivot = partion(array , start , end);

        quickSort(array , start , pivot - 1);
        quickSort(array , pivot + 1 , end);
        
    }

    private static int partion(int[] array, int start, int end) {

        int pivot = array[end];
        int i=start-1;
        for(int j=start;j<end;j++)
        {
            if(array[j]<pivot)
            {
                i++;
                swap(array,i,j);
            }
        }
        i++;
        swap(array,i,end);
        return i;
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
        quickSort(array , 0 , array.length-1);
        System.out.println("Array after QuickSort....");

        for(int num : array)
        {
            System.out.print(num+" "); 
        }

    }
}
