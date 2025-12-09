package QueueImplmentation;


import java.util.Stack;

class QueueImpS{


    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();

    void push(int x)
    {
        input.push(x);
    }
    int size()
    {
        return input.size()+output.size();
    }
    int remove()
    {
        if(output.isEmpty() && input.isEmpty())
        {
            return -1;
        }
        if(!output.isEmpty())
        {
            return  output.pop();
        }
        while (!input.isEmpty()) {
            output.push(input.pop());
        }

        return output.pop();
    }
    int peek()
    {
        if(output.isEmpty() && input.isEmpty())
        {
            return -1;
        }
        if(!output.isEmpty())
        {
            return  output.peek();
        }
        while (!input.isEmpty()) {
            output.push(input.pop());
        }

        return output.peek();
    }

    public boolean empty() {
        return (input.isEmpty() && output.isEmpty());
    }
}
public class UsingStack {



}
