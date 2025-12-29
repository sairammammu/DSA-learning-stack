package StackImplimentaion;

class StackNode {
    int data;
    StackNode next;
    StackNode(int d) {
        data = d;
        next = null;
    }
}
class StackImpLL{

    StackNode top;
    int size =0;
    void push(int value)
    {

        StackNode temp = new StackNode(value);
        temp.next = top;
        top = temp;
        size++;
    }

    int pop() {
        if (size == 0) {
            System.out.println("No elements found in stack");
            return 0;
        }

        int value = top.data;
        top = top.next;
        size--;   // decrement after removing
        return value;
    }

    int top()
    {
        if(size ==0)
        {
            System.out.println("No elements found in stack");
            return 0;
        }
        return  top.data;
    }


    int size()
    {
        return size;
    }

    void display() {
        if (size == 0) {
            System.out.println("Stack is empty");
            return;
        }
        StackNode current = top;
        System.out.print("Stack elements: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

}
//public class usingLL {
//}


/*

   top = null
   temp -- 10 , null
   temp---> top(null)
   top = temp;

   temp = 20 , null
   20 , p --> 10 , null
   top


 */