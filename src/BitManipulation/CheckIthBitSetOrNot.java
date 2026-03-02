package BitManipulation;

import java.util.Scanner;

/*
You are given an integer N and an integer i.
Your task is to determine whether the i-th bit (0-based index) of N is set (1) or not set (0).

Print "SET" if the i-th bit of N is 1

Print "NOT SET" if the i-th bit of N is 0

 */
public class CheckIthBitSetOrNot {

    private static boolean checkIthBitUsingLSO(int num,int i)
    {
        if((num & (1<<i))!=0)
        {
            return  true;
        }
        return false;

    }

    public static boolean checkIthBitUsingRSO(int num , int i)
    {
        if(((num<<i) &1)==1)
        {
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String args[])
    {
        // brute force approach convert to binary and check ith bit from last
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int i = sc.nextInt();
        //using left shift
        if(checkIthBitUsingLSO(num,i))
        {
            System.out.println("i-TH bit is SET");
        }
        else{
            System.out.println("i-TH bit is NOT SET");
        }

        //using right shift operator
        if(checkIthBitUsingRSO(num,i))
        {
            System.out.println("i-TH bit is SET");
        }
        else{
            System.out.println("i-TH bit is NOT SET");
        }
    }

}
