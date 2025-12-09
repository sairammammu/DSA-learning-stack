package StackImplimentaion;
import java.util.ArrayDeque;
import java.util.Queue;

import java.util.Queue;

class StackImpQ{

    Queue<Integer> queue = new ArrayDeque<>();

    void push(int value)
    {
        int size = queue.size();

        queue.add(value);

        for(int i=0;i<size;i++)
        {
            queue.add(queue.peek());
            queue.poll();
        }

    }

    int pop()
    {
        if(queue.isEmpty())
        {
            System.out.println("Stack is empty");
            return 0;
        }
        int val =  queue.peek();
        queue.poll();
        return val;
    }
    int peek()
    {
        if(queue.isEmpty())
        {
            System.out.println("Stack is empty");
            return 0;
        }
        return queue.peek();
    }
    int size()
    {
        return queue.size();
    }


}
public class UsingQueue {



}
