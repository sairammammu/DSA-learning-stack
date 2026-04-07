package SortingAlgorithms;

import java.util.Scanner;

public class BubbleSort {

    private static void bubbleSort(int[] array, int start, int end) {

        int size = array.length;
        for(int i=0;i<size-1;i++)
        {
            for(int j=0;j<size-1-i;j++)
            {
                if(array[j]>array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int array[] = {2,9,3,5,8,1,6,4,7};

        System.out.println("Array before BubbleSort....");
        for(int num : array)
        {
            System.out.print(num+" ");
        }
        System.out.println();
        bubbleSort(array , 0 , array.length);
        System.out.println("Array after BubbleSort....");

        for(int num : array)
        {
            System.out.print(num+" ");
        }

    }
}
