package QueueImplmentation;


class QueueNode{

    int data;
    QueueNode next;
    QueueNode(int data)
    {
        this.data = data;
        this.next = null;
    }
}
class QueueImpLL{

    int size = 0;
    QueueNode start , end;

    void push(int value)
    {
        QueueNode temp = new QueueNode(value);
        if(start==null )
        {
            start = temp ;
            end = temp;
        }else{
            end.next = temp;
            temp = end;
        }

        size++;
    }
    int top()
    {
        if(start==null)
        {
            System.out.println("no elements in queue");
            return 0;
        }
        return  start.data;
    }
    int pop()
    {
        if(start==null)
        {
            System.out.println("no elements in queue");
        }
        int temp = start.data;
        start = start.next;
        return temp;

    }

    int size()
    {
        return size;
    }
}
public class UsingLL {
}
