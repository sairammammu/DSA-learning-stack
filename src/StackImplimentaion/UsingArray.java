package StackImplimentaion;

class StackImp{

    int top = -1;
    int stack[] = new int[10]; // fixed size
    void push(int var)
    {
        top = top+1;
        if(top>=10)
        {
            System.out.println("Stack OverFlow error");
            return;
        }
        stack[top] = var;
    }

    int pop()
    {
        if(top==-1)
        {
            System.out.print("cannot pop since no elements found");
            return 0;
        }
        top--;
        return stack[top];
    }

    int size()
    {
        return top+1;
    }

    int top()
    {
        if(top==-1)
        {
            System.out.print("cannot pop since no elements found");
            return 0;
        }
        return stack[top];
    }

}

public class UsingArray {

    //implementing stack using arrays'

}
