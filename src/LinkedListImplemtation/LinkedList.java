package LinkedListImplemtation;



public class LinkedList {

    Node head;

    void insertAtBegining(int data)
    {
            if(head==null)
            {
                head = new Node(data);
                return;
            }

            Node temp = new Node(data);
            temp.next = head;
            head = temp;

    }

    void insertAtEnd(int data)
    {
        if(head==null)
        {
            head = new Node(data);
            return;
        }
        Node temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        temp.next = new Node(data);
    }

    void insertAtMiddle(int data)
    {
        Node temp = head;

        Node slow = head;
        Node fast = head;


    }

    void display()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
    }


    public static void  main(String args[])
    {
        LinkedList list = new LinkedList();

        list.insertAtEnd(14);
        list.insertAtBegining(10);
        list.insertAtBegining(20);
        list.insertAtEnd(30);
        list.insertAtBegining(9);

        list.insertAtMiddle(42);


        list.display();


    }
}
