package Trees.BinarySearchTree;

import java.util.Scanner;

class Node{

    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class BSTimp {

    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);

        Node n1 = new Node(6);
        n1.left = new Node(4);
        n1.right = new Node(9);

        Node temp = n1.left;
        System.out.println(temp.data);


    }
}
