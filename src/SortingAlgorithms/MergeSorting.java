package SortingAlgorithms;

public class MergeSorting {

    private static void merge(int leftArray[] , int rightArray[] , int array[])
    {
            int l = 0;
            int r = 0;
            int i=0;

            int len = leftArray.length + rightArray.length;
            while (l<leftArray.length && r<rightArray.length)
            {
                if(leftArray[l]<rightArray[r])
                {
                    array[i] = leftArray[l];
                    l++;
                    i++;
                }
                else{
                    array[i] = rightArray[r];
                    r++;
                    i++;
                }
            }

            while (l<leftArray.length)
            {
                array[i] = leftArray[l];
                l++;
                i++;
            }
            while(r<rightArray.length)
            {
                array[i] = rightArray[r];
                r++;
                i++;
            }

    }
    private static void mergeSort(int array[])
    {

        int length = array.length;
        if(length<=1) return; // base condition

        int leftArraySize = length/2;
        int rightArraySize = length - (length/2);

        int leftArray[] = new int[leftArraySize];
        int rightArray[] = new int[rightArraySize];

        int l = 0;
        int r = 0;
        int i=0;
        while(i<length)
        {
            if(l<leftArraySize)
            {
                leftArray[l] = array[i];
                l++;
            }
            else {
                rightArray[r] = array[i];
                r++;
            }
            i++;
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray , rightArray , array);
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
