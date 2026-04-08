package LinkedListImplementation;

public class LinkedList {

    Node head;
    int size = 0;

    //Level 1
    void insertAtBeginning(int data)
    {
            if(head==null)
            {
                head = new Node(data);
                size++;
                return;
            }
            Node temp = new Node(data);
            temp.next = head;
            head = temp;
            size++;
    }

    void insertAtEnd(int data)
    {
        if(head==null)
        {
            head = new Node(data);
            size++;
            return;
        }
        Node temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        temp.next = new Node(data);
        size++;

    }

    void insertAtMiddle(int data)
    {
        size++;
        Node temp = head;
        if(head==null)
        {
            head = new Node(data);
            return;
        }
        Node slow = head;
        Node fast = head.next;

        while((fast!=null) && (fast.next!=null))
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        Node mid = new Node(data);
        Node nextNode = slow.next;
        slow.next = mid;
        mid.next = nextNode;

    }

    void insertAtPosition(int data, int position) {
        if (position < 0 || position > size) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 0) {
            insertAtBeginning(data);
            return;
        }

        if (position == size) {
            insertAtEnd(data);
            return;
        }

        Node temp = head;

        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }

        Node node = new Node(data);
        node.next = temp.next;
        temp.next = node;

        size++;
    }

    void deleteFromBeginning()
    {
            if(head==null)
            {
                System.out.println("List is empty cannot delete");
                return;
            }

            head = head.next;
    }

    void deleteFromEnd()
    {
        Node temp = head;
        if(temp==null)
        {
            System.out.println("empty list");
            return;
        }
        if(temp.next==null)
        {
            head = null;
            size--;
            return;
        }
        while(temp.next != null && temp.next.next != null)
        {
            temp = temp.next;
        }
        temp.next = null;
        size--;
    }

    void deleteByValue(int value)
    {

    }

    void deleteAtPosition(int position){

    }

    // level 2 : display , size , isEmpty
    void display()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    //size()
    int size()
    {
        return size;
    }
    //isEmpty()
    boolean isEmpty()
    {
        return size==0;
    }

    // level 3
    boolean search(int key){
        return false;
    }

    boolean contains(int value){
        return false;
    }

    void reverse(){

    }

    Node findMiddle(){
        return head;
    }

    boolean detectLoop(){
        return true;
    }

    void removeLoop(){

    }

    Node getNthNode(int index){
        return head;
    }

    Node getNthFromEnd(int n){
        return head;
    }

    public static void  main(String args[])
    {
        LinkedList list = new LinkedList();

        list.insertAtEnd(14);

        list.insertAtBeginning(10);
        list.insertAtBeginning(20);

        list.insertAtEnd(30);

        list.insertAtBeginning(9);
        list.insertAtMiddle(42);
        list.insertAtMiddle(21);

        list.display();

    }
}

/*
Basic Operations
insertAtBeginning()
insertAtEnd()
insertAtPosition()
deleteFromBeginning()
deleteFromEnd()
deleteByValue()
deleteAtPosition()

Traversal & Utility
traverse()
display()
size()
isEmpty()

Search
search()
contains()



Advanced / Interview Important
reverse()
findMiddle()
detectLoop()
removeLoop()
getNthNode()
getNthFromEnd()


 */
