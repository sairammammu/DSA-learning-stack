package QueueImplmentation;


class QueueImp{


    private int[] queue;
    int size = 10;
    int maxSize=0;

    private int start, end, currentSize;

    QueueImp(int maxSize)
    {
        start=-1;
        end = -1;
        this.maxSize = maxSize;
        queue = new int[maxSize];

    }
    int size()
    {
        return currentSize;

    }
    void push(int value)
    {
        if(currentSize == size)
        {
            System.out.println("Cannot add queue  is full");
            return;
        }
        if(currentSize ==0)
        {
            end = 0;
            start = 0;
        }
        else {
            end = (end +1)%size;
        }
        queue[end] = value;

        currentSize++;

    }

    int pop()
    {
        if(currentSize==0)
        {
            System.out.println("no elements in queue");
            return 0;
        }

        int val = queue[start];
        if(currentSize==1)
        {
            end = -1;
            start = -1;

        }else{
            start = (start+1)%size;
        }
        currentSize--;
        return val;
    }


    int top()
    {
        if(currentSize ==0)
        {
            System.out.print("No elements found");
            return 0;
        }
        return  queue[start];
    }






}
public class UsingArray {


}
