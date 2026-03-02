package Trees.BinaryTree;

import java.util.*;

class TreeNode{

    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data)
    {
        this.data = data;
        this.left = this.right = null;
    }
}
public class BTImp {

    private static void levelOrderTraversal(TreeNode node)
    {

        Queue<TreeNode> queue = new LinkedList<>();
        if(node == null)
        {
            return;
        }
        queue.add(node);
        List<Integer> result = new ArrayList<>();
        while(!queue.isEmpty())
        {
            TreeNode current = queue.remove();
                if(current.left!=null)
                {
                    queue.add(current.left);
                }
                if(current.right!=null)
                {
                    queue.add(current.right);
                }
            result.add(current.data);
        }

        for(int i=0;i<result.size();i++)
        {
            System.out.print(result.get(i)+" ");
        }

    }
    private static void preOrderTraversal(TreeNode root) {

        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    private static  void postOrderTraversal(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data+" ");

    }

    private static void inOrderTraversal(TreeNode root)
    {
        if(root == null)
        {
            return;
        }

        inOrderTraversal(root.left);
        System.out.print(root.data+" ");
        inOrderTraversal(root.right);
    }

    private static void iterativePreOrderTraversal(TreeNode node)
    {
        /*  root left right
            using stack
         */

        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if(node==null)
        {
            return;
        }
        stack.push(node);
        while(!stack.isEmpty())
        {
            TreeNode current = stack.pop();
            result.add(current.data );
            // since stack follows LIFO 1st add right then left
            if(current.right!=null)
            {
                stack.push(current.right);
            }
            if(current.left!=null) {
                stack.push(current.left);
            }
        }

        for(Integer num : result)
        {
            System.out.print(num+" ");
        }

    }

    private static void iterativeInOrderTraversal(TreeNode temproot) {

        /*
         using stack data strucure
        */
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(temproot);
        while(!stack.isEmpty())
        {
            
        }



    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);

        root.left.right.left = new TreeNode(10);
        root.right.left.right = new TreeNode(11);

        // preOrderTraversal--> (root left right)
        System.out.println("----PreOrderTraversal----");
        TreeNode temproot= root;
        preOrderTraversal(temproot);
        System.out.println();

        System.out.println("----InOrderTraversal----");
        inOrderTraversal(temproot);
        System.out.println();

        System.out.println("----postOrderTraversal----");
        postOrderTraversal(temproot);
        System.out.println();

        System.out.println("----levelOrderTraversal");
        levelOrderTraversal(temproot);
        System.out.println();


        // itertive preorder traversal using stack
        System.out.println("----iterativePreOrderTraversal----");
        iterativePreOrderTraversal(temproot);
        System.out.println();

        // itertive inorder traversal using stack
        System.out.println("----iterativeInOrderTraversal----");
        iterativeInOrderTraversal(temproot);
        System.out.println();











    }




}
