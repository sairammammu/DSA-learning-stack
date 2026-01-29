package SortingAlgorithms;



/*
    1.Consider the first value of the list as sorted and remaining values as unsorted.
    2.Create a for loop starting from index 1 to length of the list (for looping through
      all unsorted elements).
    3.Get an unsorted value by using for loop and store it in a variable.
    4.using while loop , check If unsorted value < sorted values, then move the
      sorted values to the right and place the unsorted value in the correct index.
    5.Repeat the step 4 until all the values in the list are sorted.

 */
public class InsertionSort {


    private  static  void insertionSort(int array[])
    {
        for(int i=1;i<array.length;i++)
        {
            int temp = array[i];
            int left = i-1;
            while(left>=0 && array[left]>temp)
            {
                array[left+1] = array[left];
                left--;
            }
            array[left+1] = temp;
        }

    }
    public static void main(String args[])
    {
        int array[] = {2,9,3,5,8,1,6,4,7};

        System.out.println("Array before insertionSort....");
        for(int num : array)
        {
            System.out.print(num+" ");
        }
        insertionSort(array);
        System.out.println();
        System.out.println("Array after insertionSort....");
        for(int num : array)
        {
            System.out.print(num+" ");
        }
    }
}
