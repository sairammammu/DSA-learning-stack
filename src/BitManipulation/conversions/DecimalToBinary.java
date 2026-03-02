package BitManipulation.conversions;

import java.util.Scanner;

public class DecimalToBinary {

    private static void convert2Binary(int n)
    {
        String res = "";

        while(n>=1)
        {
            int remainder = n%2;
            res = remainder+res;  //not optimaal
            n  = n/2;
        }

        System.out.println(res);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        //int num = sc.nextInt();

        convert2Binary(11);
    }
}
