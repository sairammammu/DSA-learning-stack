package BitManipulation.tricks;

public class Swapping {

    private static void usingThdVariable(int a , int b)
    {
        System.out.println("before swapping a = "+a+" "+" b = "+b);
        int temp = a;
        a = b;
        b = a;
        System.out.println("after swapping a = "+a+" "+" b = "+b);
    }
    private static void usingXOR(int a, int b) {

        System.out.println("before swapping a = "+a+" "+" b = "+b);
        // a^a = 0
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("after swapping a = "+a+" "+" b = "+b);
    }
    public static void main(String args[])
    {

        int a = 10;
        int b = 20;
        //1. using 3rd variable
        usingThdVariable(a,b);

        //2. using XOR(^)
        usingXOR(a,b);

        //3.

    }


}
